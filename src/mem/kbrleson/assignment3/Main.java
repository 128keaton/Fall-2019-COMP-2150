// kbrleson
// Assignment 3 - Main Test Class
// COMP-2150
// September 30th, 2019

// NOTE: If this does not work, just compile and run each QuestionX.java file

package mem.kbrleson.assignment3;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    private static String ROOT_PATH = "./src/mem/kbrleson/assignment3";

    public static void main(String[] args) {
        List<String> questions = getQuestions(ROOT_PATH);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which question do you want to run?");
        printQuestionList(questions);
        System.out.print("Make a selection: ");

        String selection = scanner.nextLine();

        if (selection.contains("q")) {
            System.exit(0);
        } else if (selection.contains("a")) {
            runAll(args);
            main(args);
        } else {
            int questionChosen = Integer.parseInt(selection.replaceAll("[^0-9]", ""));

            if (questionChosen > 0) {
                if (questions != null && questions.contains(ROOT_PATH + "/Question" + questionChosen + ".java")) {
                    runQuestion(questionChosen, args);
                } else {
                    System.out.println("Error: Not a valid question");
                    main(args);
                }
            } else {
                main(args);
            }
        }
    }

    private static void runAll(String[] args) {
        System.out.println("--------[Question 1]--------");
        Question1.main(args);
        System.out.println("---------[Done!]----------");

        System.out.println("--------[Question 2]--------");
        Question2.main(args);
        System.out.println("---------[Done!]----------");

        System.out.println("--------[Question 4]--------");
        Question4.main(args);
        System.out.println("---------[Done!]----------");

        System.out.println("--------[Question 5]--------");
        Question5.main(args);
        System.out.println("---------[Done!]----------");

        System.out.println("--------[Question 6]--------");
        Question6.main(args);
        System.out.println("---------[Done!]----------");
    }

    private static void runQuestion(int questionNum, String[] parentArgs) {
        String className = "mem.kbrleson.assignment3.Question" + questionNum;

        try {
            Class<?> classRef = Class.forName(className);
            Object instance = classRef.newInstance();
            try {
                System.out.println("--------[Question" + questionNum + "]--------");

                Method method = classRef.getDeclaredMethod("main", String[].class);
                method.invoke(instance, (Object) parentArgs);

                System.out.println("---------[Done!]----------");
                System.out.println("\n");
                main(parentArgs);
            } catch (NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException ex) {
                ex.printStackTrace();
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
    }

    private static void printQuestionList(List<String> questionList) {
        System.out.println("--------[Choices]--------");
        if (questionList != null) {
            for (String questionPath : questionList) {
                String[] splitPath = questionPath.split("/");
                String question = splitPath[splitPath.length - 1];

                int questionNum = Integer.parseInt(question.replaceAll("[^0-9]", ""));
                System.out.println("Question " + questionNum + " - " + questionNum);
            }

            System.out.println("Run All - a(ll)");
            System.out.println("Quit - q(uit)");
        } else {
            System.out.println("No choices");
        }
        System.out.println("-------------------------");
    }

    private static List<String> getQuestions(String rootPath) {
        if (Files.exists(Paths.get(rootPath))) {
            try (Stream<Path> walk = Files.walk(Paths.get(rootPath))) {
                return walk.map(Path::toString)
                        .filter(f -> f.endsWith(".java") && f.contains("Question"))
                        .sorted()
                        .collect(Collectors.toList());
            } catch (IOException e) {
                System.out.println("Unable to find questions at path: " + rootPath);
            }

        } else if (rootPath.contains("./src")) {
            String secondaryRootPath = rootPath.replace("./src", ".");
            System.out.println(secondaryRootPath);

            ROOT_PATH = secondaryRootPath;
            return getQuestions(secondaryRootPath);
        }

        return null;
    }
}
