/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelperClasses;

import GameEntities.Rider;
import GameEntities.Camel;
//done

/**
 *
 * @author ryan.wetzstein
 */
public class DescriptionHelper {

    //instance variables
    Rider rider;
    Camel camel;
    static int thirst;
    static int hunger;
    static int energy;

    //getters
    public static String getThirstDescription(Camel camel) {
        if (thirst > 2 && thirst < 5) {
            return "Thirsty";
        } else if (thirst < 2 && thirst > 0) {
            return "Extremely Thirsty";
        } else {
            return "Quenched";
        }
    }

    public static String getHungerDescription(Camel camel) {
        if (hunger > 2 && hunger < 5) {
            return "Hungry";
        } else if (hunger < 2 && hunger > 0) {
            return "Extremely Hungry";
        } else {
            return "Satiated";
        }
    }

    public static String getEnergyDescription(Camel camel) {
        if (energy > 2 && energy < 5) {
            return "Tired";
        } else if (energy < 2 && energy > 0) {
            return "Extremely Tired";
        } else {
            return "Fully Rested";
        }
    }

    public static String getThirstDescription(Rider rider) {
        if (thirst > 2 && thirst < 5) {
            return "Thirsty";
        } else if (thirst < 2 && thirst > 0) {
            return "Extremely Thirsty";
        } else {
            return "Quenched";
        }
    }

    public static String getHungerDescription(Rider rider) {
        if (hunger > 2 && hunger < 5) {
            return "Hungry";
        } else if (hunger < 2 && hunger > 0) {
            return "Extremely Hungry";
        } else {
            return "Satiated";
        }
    }

    public static String getEnergyDescription(Rider rider) {
        if (energy > 2 && energy < 5) {
            return "Tired";
        } else if (energy < 2 && energy > 0) {
            return "Extremely Tired";
        } else {
            return "Fully Rested";
        }
    }

    public static String getStatus(Rider rider) {
        return "Rider Thirst: " + DescriptionHelper.getThirstDescription(rider)
                + "\nRider Hunger: " + DescriptionHelper.getHungerDescription(rider)
                + "\nRider Energy: " + DescriptionHelper.getEnergyDescription(rider);
    }

    public static String getStatus(Camel camel) {
        return "Camel Thirst: " + DescriptionHelper.getThirstDescription(camel)
                + "\nCamel Hunger: " + DescriptionHelper.getHungerDescription(camel)
                + "\nCamel Energy: " + DescriptionHelper.getEnergyDescription(camel);
    }

    //default constructor
    private DescriptionHelper() {

    }
}
