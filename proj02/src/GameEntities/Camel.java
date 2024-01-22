/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEntities;

import java.util.Random;

/**
 *
 * @author ryan.wetzstein
 */
//done
public class Camel {

    //instance variables
    private int thirst;
    private String name;
    private int hunger;
    private int energy;

    //constructors
    public Camel(String name) {
        this.name = name;
        Random randNum = new Random();
        thirst = randNum.nextInt(16) + 1;
        hunger = randNum.nextInt(16) + 1;
        energy = randNum.nextInt(16) + 1;

    }

    public Camel(String name, int thirst, int hunger, int energy) {
        this.name = name;
        this.thirst = thirst;
        this.hunger = hunger;
        this.energy = energy;
    }

    //getters and setters
    public int getThirst() {
        return thirst;
    }

    public void adjustThirst(int value) {

        thirst += value;
        if (thirst > 15) {
            thirst = 15;
        } else if (thirst < 0) {
            thirst = 0;
        } else {
            this.thirst = thirst;
        }
    }

    public int getHunger() {
        return hunger;
    }

    public void adjustHunger(int value) {

        hunger += value;
        if (hunger > 15) {
            hunger = 15;
        } else if (hunger < 0) {
            hunger = 0;
        } else {
            this.hunger = hunger;
        }
    }

    public int getEnergy() {
        return energy;
    }

    public void adjustEnergy(int value) {

        energy += value;
        if (energy > 15) {
            energy = 15;
        } else if (energy < 0) {
            energy = 0;
        } else {
            this.energy = energy;
        }
    }
}
