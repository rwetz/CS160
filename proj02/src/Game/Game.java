/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;
//this is where the "engine" of the game is//

import GameEntities.Rider;
import GameEntities.Camel;
import HelperClasses.DescriptionHelper;
import HelperClasses.MenuHelper;
import java.awt.BorderLayout;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ryan.wetzstein
 */
public class Game {

    //instance variables//
    private static double difficulty;
    private static int distanceTraveled;
    private static int persuerDistance;
    private static int distanceBetweenRP;
    private static int day;
    private static String timeOfDay;
    private static String weather;
    private static String location;
    private static Random rand = new Random();
    private static Rider rider;
    private static Camel camel;
    private static int energy;
    private static int hunger;
    private static int thirst;

    //potential constructor//
    public Game(double difficulty, Camel camel, Rider rider) {
        this.difficulty = difficulty;
        this.camel = camel;
        this.rider = rider;
    }

//main game method
    public void start() {
        while (true) {
            Game.outputTurnInformation();
            Game.processTurn();
        }
    }

    //helpers
    //checks if camel can travel
    private static boolean checkCamelCanTravel() {
        if (camel.getEnergy() <= 0) {
            return false;
        } else if (camel.getHunger() <= 0) {
            return false;
        } else if (camel.getThirst() <= 0) {
            return false;
        } else {
            System.out.println("The camel's status is good, and it isn't too thirsty, hungry, or tired.");
            return true;
        }
    }
//checks if rider is dead

    private static boolean checkRiderIsDead() {
        if (rider.getEnergy() <= 0) {
            return true;
        } else if (rider.getHunger() <= 0) {
            return true;
        } else if (rider.getThirst() <= 0) {
            return true;
        } else {
            System.out.println("The rider is alive and chilling.");
            return false;
        }
    }
//location getter; location is a literal

    private static String getNewLocation() {
        int locationValue = rand.nextInt(15);
        if (locationValue <= 1) {
            return "Oasis";
        } else if (locationValue <= 3 && locationValue >= 2) {
            return "Ruins";
        } else if (locationValue <= 5 && locationValue >= 4) {
            return "River Bank";
        } else if (locationValue <= 11 && locationValue >= 6) {
            return "Desert Plains";
        } else if (locationValue <= 14 && locationValue >= 12) {
            return "Desert Hills";
        } else {
            return null;
        }
    }
//time of day accessor

    private static String getNewTimeOfDay() {
        if (timeOfDay.equals("Morning")) {
            return "Afternoon";
        } else if (timeOfDay.equals("Afternoon")) {
            return "Evening";
        } else if (timeOfDay.equals("Evening")) {
            return "Night";
        } else if (timeOfDay.equals("Night")) {
            return "Morning" + "It is the next day";
        } else {
            return null;
        }
    }
//weather accessor

    private static String getNewWeather() {
        int weatherValue = rand.nextInt(10);
        if (weatherValue == 0) {
            return "Sandstorm";
        } else if (weatherValue == 1) {
            return "Raining";
        } else if (weatherValue == 2) {
            return "Cloudy";
        } else if (weatherValue <= 5 && weatherValue >= 3) {
            return "Warm";
            //use getTimeOfDay method for this method
        } else if (weatherValue <= 9 && weatherValue >= 6) {
            if (timeOfDay.equals("Morning")) {
                return "Warm";
            } else {
                return "Extremely Hot";
            }
        } else {
            return null;
        }
    }

    //getpersurer distance
    private static String getPursuerDistanceDescription() {
        return "The persuers are " + (distanceTraveled - persuerDistance) + "miles back.";
    }

    //turn output
    private static String outputTurnInformation() {
        Game.checkRiderIsDead();
        Game.checkCamelCanTravel();
        if (Game.checkRiderIsDead() == true) {
            System.out.println("You Died!");
        } else if (Game.checkCamelCanTravel() == true) {
            System.out.println("Your camel cant move!");
        }
        return "Time of Day: " + timeOfDay
                + "\nDay: " + day
                + "\nMiles Traveled: " + distanceTraveled
                + "\nCurrent Location: " + location
                + "\nCurrent Weather: " + weather
                + "\nCamel: " + DescriptionHelper.getStatus(rider)
                + "\nRider: " + DescriptionHelper.getStatus(camel);

    }

    public static void processTurn() {
        Scanner scan = new Scanner(System.in);
        String message = "What would you like to do?:"
                + "\n1:Rest"
                + "\n2:Search For Food"
                + "\n3:Search For Water"
                + "\n4:Travel Carefully"
                + "\n5:Travel Regularly"
                + "\n6:Ride All Out"
                + "\n7:Determine How Far The Persuers Are Away"; //write what the menu message will look like
        MenuHelper.displayMenu(message, 1, 7);

        while (true) {
            int choice = scan.nextInt();
            if (choice == 1) {
                Game.processRest();
            } else if (choice == 2) {
                Game.processFoodSearch();
            } else if (choice == 3) {
                Game.processWaterSearch();
            } else if (choice == 4) {
                Game.processTravelCarefully();
            } else if (choice == 5) {
                Game.processTravelRegularly();
            } else if (choice == 6) {
                Game.processRideAllOut();
            } else if (choice == 7) {
                Game.processPersuers();
            } else {
                System.out.println("Thats not a valid choice, choose again.");
                scan.next();
            }
        }
    }

    /**
     * process the rest
     */
    private static void processRest() {
        if (difficulty > 3) {
            System.out.println("You tried to get some sleep. ");
            energy += rand.nextInt(13) + 1;
            System.out.println("Your energy is now " + energy);
        } else {
            System.out.println("You tried to get some sleep. ");
            energy += rand.nextInt(14) + 1;
            System.out.println("Your energy is now " + energy);
        }
    }

    private static void processFoodSearch() {
        if (difficulty > 3) {
            System.out.println("You tried to find some food. ");
            hunger += rand.nextInt(13) + 1;
            System.out.println("Your hunger is now " + hunger);
        } else {
            System.out.println("You tried to find some food. ");
            hunger += rand.nextInt(14) + 1;
            System.out.println("Your energy is now " + hunger);
        }
    }

    private static void processWaterSearch() {
        if (difficulty > 3) {
            System.out.println("You tried to find some water. ");
            thirst += rand.nextInt(13) + 1;
            System.out.println("Your hunger is now " + thirst);
        } else {
            System.out.println("You tried to find some thirst. ");
            thirst += rand.nextInt(14) + 1;
            System.out.println("Your energy is now " + thirst);
        }
    }

    private static void processTravelCarefully() {
        if (difficulty > 3) {
            distanceTraveled += rand.nextInt(10) + 3;
            System.out.println("You Traveled " + distanceTraveled + " km.");
            --energy;
            --hunger;
            --thirst;
        } else {
            distanceTraveled += rand.nextInt(11) + 1;
            System.out.println("You Traveled " + distanceTraveled + " km.");
            --energy;
            --hunger;
            --thirst;
        }
    }

    private static void processTravelRegularly() {
        if (difficulty > 3) {
            distanceTraveled += rand.nextInt(10) + 5;
            System.out.println("You Traveled " + distanceTraveled + " km.");
            energy -= rand.nextInt(3) + 1;
            hunger -= rand.nextInt(3) + 1;
            thirst -= rand.nextInt(3) + 1;
        } else {
            distanceTraveled += rand.nextInt(11) + 1;
            System.out.println("You Traveled " + distanceTraveled + " km.");
            energy -= rand.nextInt(3) + 1;
            hunger -= rand.nextInt(3) + 1;
            thirst -= rand.nextInt(3) + 1;
        }
    }

    private static void processRideAllOut() {
        if (difficulty > 3) {
            distanceTraveled += rand.nextInt(10) + 7;
            System.out.println("You Traveled " + distanceTraveled + " km.");
            energy -= rand.nextInt(13) + 1;
            hunger -= rand.nextInt(13) + 1;
            thirst -= rand.nextInt(13) + 1;
        } else {
            distanceTraveled += rand.nextInt(11) + 1;
            System.out.println("You Traveled " + distanceTraveled + " km.");
            energy -= rand.nextInt(13) + 1;
            hunger -= rand.nextInt(13) + 1;
            thirst -= rand.nextInt(13) + 1;
        }
    }
//the persuers are angry, and ride the same speed in any weather.

    private static void processPersuers() {
        if (difficulty > 3) {
            if (timeOfDay.equals("Morning")) {
                persuerDistance = rand.nextInt(8) + 4;
                Game.getPursuerDistanceDescription();
            } else if (timeOfDay.equals("Afternoon")) {
                persuerDistance = rand.nextInt(8) + 4;
                Game.getPursuerDistanceDescription();
            } else if (timeOfDay.equals("Evening")) {
                persuerDistance = rand.nextInt(8) + 4;
                Game.getPursuerDistanceDescription();
            } else if (timeOfDay.equals("Night")) {
                persuerDistance = rand.nextInt(8) + 6;
                Game.getPursuerDistanceDescription();
            }
        } else {
            if (timeOfDay.equals("Morning")) {
                persuerDistance = rand.nextInt(8) + 4;
                Game.getPursuerDistanceDescription();
            } else if (timeOfDay.equals("Afternoon")) {
                persuerDistance = rand.nextInt(8) + 4;
                Game.getPursuerDistanceDescription();
            } else if (timeOfDay.equals("Evening")) {
                persuerDistance = rand.nextInt(8) + 4;
                Game.getPursuerDistanceDescription();
            } else if (timeOfDay.equals("Night")) {
                persuerDistance = rand.nextInt(8) + 6;
                Game.getPursuerDistanceDescription();
            }

        }
    }
}
