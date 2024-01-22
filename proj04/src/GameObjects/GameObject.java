/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameObjects;

import Interfaces.Drawable;
import java.awt.Color;
import java.awt.Rectangle;

/**
 * Represents a generic game object with position, dimensions, and color.
 * Implements the Drawable interface.
 *
 * @author Ryan
 */
public abstract class GameObject implements Drawable {

    //instance variables for position, dimensions, and color
    protected int xPosition;
    protected int yPosition;
    protected int width;
    protected int height;
    protected Color color;

    //default constructor
    public GameObject() {

    }

    //constructor with position and color
    public GameObject(int xPosition, int yPosition, Color color) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = color;
    }

    //another constructor with position, dimensions, and color
    public GameObject(int xPosition, int yPosition, int width, int height, Color color) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    //abstract method to get the bounds of the game object
    public abstract Rectangle getBounds();

    //getter for xPosition
    public int getXPosition() {
        return xPosition;
    }

    //getter for yPosition
    public int getYPosition() {
        return yPosition;
    }

    //getter for color
    public Color getColor() {
        return color;
    }

    //setter for xPosition
    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    //setter for yPosition
    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    //setter for color
    public void setColor(Color color) {
        this.color = color;
    }

    //getter for width
    public int getWidth() {
        return width;
    }

    //getter for height
    public int getHeight() {
        return height;
    }

//iscolliding method
    public boolean isColliding(GameObject other) {
        //get the bounding boxes of the two game objects
        Rectangle thisBounds = this.getBounds();
        Rectangle otherBounds = other.getBounds();

        //use the intersects method to check if the bounding boxes overlap
        return thisBounds.intersects(otherBounds);
    }
}
