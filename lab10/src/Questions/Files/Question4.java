package Questions.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 *
 * @author (Your Name Here)
 */
public class Question4 {

    /*  For this exercise you will be doing some basic operations to write to a file. 
        You will be creating your very own Secrets of the Universe (TM)
    
        You can use the PrintWriter class to write to files (Chapter 11.4)
    
        Your code should perform the following actions:
    
        1) Open/Create a file for writing at the following location: "files/question4/MySecretsOfTheUniverse.txt"
            * If the file already exists you will want to overwrite its contents.
        2) Add at least 3 of your own secrets of the universe to the file.
            * Each secret should be on its own line. 
        3) Make sure to close your file so that the results are saved. 

        *Note: Your code should not throw any checked exceptions. 
        *Note: You will need to import some classes from the java.io package. 
     */
    public static void Question4() {
        try {
            FileOutputStream fos = new FileOutputStream("files/question4/MySecretsOfTheUniverse.txt", false);

            PrintWriter writer = new PrintWriter(fos);

            //secrets
            writer.println("Secret 1: Bush did 9/11");
            writer.println("Secret 2: The world is flat");
            writer.println("Secret 3: You can make napalm with styrofoam packing peanuts");

            writer.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("That file doesnt exist bro");
        }
    }

    public static void main(String[] args) {
        Question4();
    }
}
