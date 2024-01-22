package Questions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;

// • Prompt the user to enter a name for a Student. 
// • Use the Scanner class to read in the user input and store the result in a variable.
//  • Use the Random class to generate a random number (1 – 99999) and store it in a variable.
// • Create 3 int variables and assign them values of your choosing in the range 0 – 100. 
// • Use the variables you created in the previous steps to instantiate (construct) a Student object where the user input you read is the student’s name, the random number is the student’s ID, and the 3 int variables you created are the student’s exam scores. 
// • Print out the student’s details. You can do this by using the Student object reference as an argument in a println method call. 
// • Run your program to make sure it works correctly. 
/**
 *
 * @author ryan.wetzstein
 */
public class MyProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. Please enter your name.");
        String name = scan.nextLine();

        Random randNum = new Random();

        int eScores = randNum.nextInt(99999 - 1) + 1;

        int v1 = 68;
        int v2 = 13;
        int v3 = 96;

        MyProgram student = new MyProgram();
        System.out.println("Your name is  " + name + ", " + "Your ID is " + eScores + ", " + "Your 3 exam scores are " + v1 + ", " + v2 + ", and " + v3 + ".");
    }

}
