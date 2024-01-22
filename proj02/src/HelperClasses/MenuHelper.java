/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelperClasses;

import java.util.Scanner;
//done

/**
 *
 * @author ryan.wetzstein
 */
public class MenuHelper {

    //instance
    String message;
    String prompt;
    int min; //min number responses 
    int max; //max number of responses to allow

    //const
    private MenuHelper() {

    }

    public static int displayMenu(String message, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println(message);
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("That choice is not valid. Please enter a valid number");
                scanner.next();
            }
            choice = scanner.nextInt();

            if (choice < min || choice > max) {
                System.out.println("That number is not valid");
                scanner.next();
            }
        } while (choice < min || choice > max);

        return choice;
    }

    public static String getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
