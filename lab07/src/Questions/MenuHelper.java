/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class MenuHelper {

    public static int displayMenu(String message, int min, int max) {
        Scanner scan = new Scanner(System.in);

        int choice = 0;
        boolean isValidChoice = false;

        System.out.println(message);

        while (!isValidChoice) {
            System.out.println("Enter your choice: ");

            if (scan.hasNextInt()) {
                choice = scan.nextInt();

                if (choice >= min && choice <= max) {
                    isValidChoice = true;
                } else {
                    System.out.println("Please enter a number between " + min + " and " + max + ".");
                }

            } else {
                System.out.println("Please enter a valid integer between " + min + " and " + max + ".");
                scan.next();
            }
        }
        scan.close();

        return choice;
    }

    public static void main(String[] args) {
        int choice = displayMenu("Select an option: \n 1. Option A \n 2. Option B \n 3. Option C", 1, 3);
        System.out.println("You selected option " + choice);
    }
}
