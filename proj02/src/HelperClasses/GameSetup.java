/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HelperClasses;

import Game.Game;
import GameEntities.Camel;
import GameEntities.Rider;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Ryan
 */
//done
public class GameSetup {

    //instance
    private static Camel camel;
    private static Rider rider;
    private static Scanner scan = new Scanner(System.in);
    private static double difficulty;
    private static Camel randCamel;
    private static Rider randRider;
    private static Camel customCamel;
    private static Rider customRider;

    public static Game setupGame() {

        System.out.println("Hello Traveller! This game is called TumbleWeed and is a wild west game "
                + "\nbased on a cowboy escaping some angry Native Settlers. ");
        System.out.println("What would you like your difficulty to be set at? (Pick a number 1.0 - 5.0)");

        while (true) {
            if (scan.hasNextDouble()) {
                difficulty = scan.nextDouble();
                if (difficulty >= 1.0 && difficulty <= 5.0) {
                    break; // exit
                } else {
                    System.out.println("Please enter a number between 1.0 and 5.0.");
                }
            } else {
                System.out.println("Please enter a valid number.");
                scan.next();
            }
        }

        System.out.println("Nice difficulty! hope it isn't too hard!");
        // Ask the user about their choice of camel and rider
        System.out.println("Choose your Camel: 1: You can choose the default camel, 2: a random camel with random stats, or 3: build your own custom camel.");
        System.out.println("(Enter 1 2 or 3)");
        while (scan.hasNextInt()) {
            if (scan.nextInt() == 1) {
                System.out.println("What should his name be?");
                String name = scan.nextLine();
                Camel defaultCamel = new Camel(name, 3, 3, 3);
                defaultCamel = camel;
            } else if (scan.nextInt() == 2) {
                Random rand = new Random();
                System.out.println("What should his name be?");
                String name = scan.nextLine();
                Camel randCamel = new Camel(name, rand.nextInt(16) + 1, rand.nextInt(16) + 1, rand.nextInt(16) + 1);
                randCamel = camel;
            } else if (scan.nextInt() == 3) {
                System.out.println("What should his name be?");
                String name = scan.nextLine();
                System.out.println("What should his hunger be? (1-15)");
                int hunger = scan.nextInt();
                System.out.println("What should his Thirst be? (1-15)");
                int thirst = scan.nextInt();
                System.out.println("What should his energy be? (1-15)");
                int energy = scan.nextInt();
                Camel customCamel = new Camel(name, thirst, hunger, energy);
                customCamel = camel;
            } else {
                System.out.println("Thats not a valid number, pick a number 1-3");
            }
        }

        System.out.println("Choose your Rider: 1: You can choose the default rider, 2: a random rider with random stats, or 3: build your own custom rider.");
        System.out.println("(Enter 1 2 or 3)");
        while (scan.hasNextInt()) {
            if (scan.nextInt() == 1) {
                System.out.println("What should his name be?");
                String name = scan.nextLine();
                Rider defaultRider = new Rider(name, 3, 3, 3);
                defaultRider = rider;
            } else if (scan.nextInt() == 2) {
                Random rand = new Random();
                System.out.println("What should his name be?");
                String name = scan.nextLine();
                Rider randRider = new Rider(name, rand.nextInt(16) + 1, rand.nextInt(16) + 1, rand.nextInt(16) + 1);
                randRider = rider;
            } else if (scan.nextInt() == 3) {
                System.out.println("What should his name be?");
                String name = scan.nextLine();
                System.out.println("What should his hunger be? (1-15)");
                int hunger = scan.nextInt();
                System.out.println("What should his Thirst be? (1-15)");
                int thirst = scan.nextInt();
                System.out.println("What should his energy be? (1-15)");
                int energy = scan.nextInt();
                Rider rider = new Rider(name, thirst, hunger, energy);
                customRider = rider;
            } else {
                System.out.println("Thats not a valid number, pick a number 1-3");
            }
        }
        Game game = new Game(difficulty, camel, rider);
        return game;
    }
}
