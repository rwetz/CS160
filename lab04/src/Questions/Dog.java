/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;

/**
 *
 * @author ryan.wetzstein
 */
public class Dog {

    //instance veriables//
    private String dogName;
    private int numOfTricks;
    private Color coatColor;

    //default constructor//
    public Dog() {

    }

    //modifiable constructor//
    public Dog(String dogName,
            int numOfTricks,
            Color coatColor) {
        this.dogName = dogName;
        this.numOfTricks = numOfTricks;
        this.coatColor = coatColor;
    }

    //mutator method for dog tricks//
    public void setNumOfTricks(int numOfTricks) {
        this.numOfTricks = numOfTricks;
    }

    //Accesor Methods//
    public String getDogName() {
        return dogName;
    }

    public Color getCoatColor() {
        return coatColor;
    }

    public int getNumOfTricks() {
        return numOfTricks;
    }

    @Override

    public String toString() {
        return "The dog's name is " + dogName + ", The dog's coat color is " + coatColor + ", and the dog's # of tricks are " + numOfTricks;

    }

}
