/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameObjects;

import Interfaces.Moveable;
import java.awt.Color;

/**
 * Represents a moving game object with velocity in both x and y directions.
 * Extends the GameObject class and implements the Moveable interface.
 *
 * @author Ryan
 */
public abstract class MovingGameObject extends GameObject implements Moveable {

    private int xVelocity;
    private int yVelocity;

    //constructor
    public MovingGameObject(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color) {
        super(xPosition, yPosition, color);
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
    }

//constructor
    public MovingGameObject(int xPosition, int yPosition, Color color) {
        super(xPosition, yPosition, color);
    }
//getter

    protected int getXVelocity() {
        return xVelocity;
    }

//gettter
    protected int getYVelocity() {
        return yVelocity;
    }

//setter
    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

//setter
    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }
//getter

    @Override
    public int getYPosition() {
        return yPosition;
    }

//getter
    @Override
    public int getXPosition() {
        return xPosition;
    }

//move method
    @Override
    public void move() {
        //move the object based on its velocities
        setXPosition(getXPosition() + getXVelocity());
        setYPosition(getYPosition() + getYVelocity());
    }
}
