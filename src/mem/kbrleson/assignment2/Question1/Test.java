package mem.kbrleson.assignment2.Question1;

// kbrleson@memphis.edu
// Sept 15th, 2019

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a temperature: ");
            double temperature = scanner.nextDouble();

            if (temperature == -12345.1) {
                System.out.println("Good bye!");
                break;
            }

            Substances substances = new Substances(temperature);
            substances.checkAllSubstances();
        }

    }
}
