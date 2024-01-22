/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameObjects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * Represents a bullet fired in the game.
 *
 * @author ryan.wetzstein
 */

public class Bullet extends MovingGameObject {

    //instance variable to store the diameter of the bullet
    protected int diameter;

//constructor
    public Bullet(int xPosition, int yPosition, int diameter, Color color) {
        // Initialize the bullet with provided parameters
        super(xPosition, yPosition, 0, -6, color);
        this.diameter = diameter;
    }

//getter
    public int getDiameter() {
        return diameter;
    }

//draw method
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(getXPosition(), getYPosition(), diameter / 2, diameter / 2);
    }

//getbounds method
    @Override
    public Rectangle getBounds() {
        return new Rectangle(xPosition, yPosition, diameter / 2, diameter / 2);
    }
}
