# frozen_string_literal: true

require 'rubygems'
require 'zip'
require 'readline'
require 'tty-prompt'
require 'tmpdir'
require 'fileutils'
require 'artii'
require 'titleize'
require_relative 'zip_file_generator'


def write_zip_file(from_dir, output_file)
  zipped_assignment = ZipFileGenerator.new(from_dir, output_file)
  zipped_assignment.write
end

def zip_assignment_dir(base_dir, assignment, output_dir)
  Dir.chdir(output_dir) do
    assignment_name = assignment.split('/')[-1].sub '/', ''
    output_file = "#{assignment_name}.zip"
    abs_output_path = File.absolute_path("#{output_dir}/#{output_file}")

    File.delete(output_file) if File.exist?(abs_output_path)

    write_zip_file(base_dir, output_file)
    abs_output_path.gsub(/ /, '\ ')
  end
end

def get_assignments(base_dir)
  assignments = []

  Dir.chdir(base_dir) do
    assignments = Dir.glob('*').select { |f| File.directory? f }
  end

  prompt.error('No assignments found!') if assignments.empty?

  assignments
end

def prompt_for_assignment(prompt, base_dir)
  assignments = get_assignments(base_dir)

  menu_choices = assignments.map do |assignment|
    formatted_path = "#{base_dir.sub '../', ''}/#{assignment}".gsub(/ /, '\ ')
    formatted_name = "#{assignment.titleize} (at #{formatted_path})"
    path = "#{base_dir}/#{assignment}"

    { name: formatted_name, value: path }
  end

  prompt.say("The selections below are from the directory #{base_dir}")
  prompt.select('Which assignment?', menu_choices).sub '../', ''
end

def make_assignment_structure(assignment, temp_dir)
  structure = assignment.split('/')[0...-1].join('/')
  # Make nested Java package structure
  FileUtils.mkdir_p("#{temp_dir}/#{structure}")

  # Copy package into base temporary package
  FileUtils.cp_r "../#{assignment}", "#{temp_dir}/#{structure}"
end

def main(prompt)
  generated_dir = '../assignments/'
  base_dir = '../src/mem/kbrleson'
  temp_dir = Dir.mktmpdir('generate-assignment', '/tmp')

  Dir.mkdir(generated_dir) unless File.exist? generated_dir

  assignment = prompt_for_assignment(prompt, base_dir)

  make_assignment_structure(assignment, temp_dir)
  written_to = zip_assignment_dir(temp_dir, assignment, generated_dir)

  puts '==================================================='
  prompt.ok("Wrote zip file to '#{written_to}'")
  puts
end


begin
  prompt = TTY::Prompt.new

  artii = Artii::Base.new
  puts artii.asciify('COMP 2150')
  puts '==================================================='

  main(prompt)
rescue Interrupt
  puts
  puts 'Bye!'
end
