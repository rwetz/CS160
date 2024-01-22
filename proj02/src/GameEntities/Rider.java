/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameEntities;

import java.util.Random;

/**
 *
 * @author rwetz
 */
//done
public class Rider {

    //instance variables
    private int thirst;
    private String name;
    private int hunger;
    private int energy;

    //constructors
    public Rider(String name) {
        this.name = name;
        Random randNum = new Random();
        thirst = randNum.nextInt(16) + 1;
        hunger = randNum.nextInt(16) + 1;
        energy = randNum.nextInt(16) + 1;

    }

    public Rider(String name, int thirst, int hunger, int energy) {
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
    }

    public int getHunger() {
        return hunger;
    }

    public void adjustHunger(int value) {
        hunger += value;
    }

    public int getEnergy() {
        return energy;
    }

    public void adjustEnergy(int value) {
        energy += value;
    }
}
