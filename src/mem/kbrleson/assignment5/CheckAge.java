package mem.kbrleson.assignment5;

import java.util.Scanner;


class AgeIsNegativeException extends Exception {

    AgeIsNegativeException(String message) {
        super(message + ": The age cannot be less than zero!");
    }
}

public class CheckAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //Declaring Scanner variable to take input from user

        System.out.println("Enter Your Age");

        int age = sc.nextInt();         //Taking input from user

        try {
            if (age < 0) {
                throw new AgeIsNegativeException("Ooops");
            }
            System.out.println(" Age entered = " + age);
        } catch (Exception ex) {
            System.out.println(ex);     //Prints exception description
        }

    }
}
