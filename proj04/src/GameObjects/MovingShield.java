/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// MovingShield.java
package GameObjects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * MovingShield class represents a shield that can move horizontally and bounce off the boundaries.
 * Extends MovingGameObject to inherit movement functionality.
 * 
 * @author Ryan
 */
public class MovingShield extends MovingGameObject {

//constructor
    public MovingShield(int xPosition, int yPosition, int xVelocity, int yVelocity, int width, int height, Color color) {
        super(xPosition, yPosition, xVelocity, yVelocity, color);
        this.width = width;
        this.height = height;
    }

 //draw method
    @Override
    public void draw(Graphics g) {
        // Draw the moving shield
        g.setColor(color);
        g.fillRect(xPosition, yPosition, width, height);
    }

//getbounds method
    @Override
    public Rectangle getBounds() {
        return new Rectangle(xPosition, yPosition, width, height);
    }

  //move method
    @Override
    public void move() {
        //move the shield
        xPosition += getXVelocity();
        yPosition += getYVelocity();

        //check and adjust for the right boundary
        if (xPosition + width > 600) {
            xPosition = 600 - width;
            setXVelocity(-getXVelocity());  //reverse direction when hitting the right boundary
        }

        //Check and adjust for the left boundary
        if (xPosition < 0) {
            xPosition = 0;
            setXVelocity(-getXVelocity());  //reverse direction when hitting the left boundary
        }
    }
}