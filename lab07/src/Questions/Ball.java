/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Ryan
 */
public class Ball {

    //instance
    int xPosition;
    int yPosition;
    int diameter;
    int xVelocity;
    int yVelocity;
    Color color;

    //constructors
    //default
    public Ball() {
        xPosition = 10;
        yPosition = 20;
        diameter = 50;
        xVelocity = 25;
        yVelocity = 35;
        color = Color.BLACK;
    }

    public Ball(int xPosition, int yPosition, int diameter, int xVelocity, int yVelocity, Color color) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.diameter = diameter;
        this.xVelocity = xVelocity;
        this.xVelocity = yVelocity;
        this.color = color;

    }

    //getters
    public int getXPosition() {
        return xPosition;
    }

    public int getYPosition() {
        return yPosition;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getXVelocity() {
        return xVelocity;
    }

    public int getYVelocity() {
        return yVelocity;
    }

    public Color getColor() {
        return color;
    }

    //setters
    public void setXPositon(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setYPositon(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    //misc
    public void move() {
        xPosition += xVelocity;
        yPosition += yVelocity;
    }

    public void draw(Graphics g) {
        g.fillOval(xPosition, yPosition, diameter, diameter);
    }
}
