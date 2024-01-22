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
 * Represents a beam fired in the game.
 *
 * @author ryan.wetzstein
 */
public class Beam extends MovingGameObject {

 //constructor
    public Beam(int xPosition, int yPosition, int xVelocity, int yVelocity, int width, int height, Color color) {
        super(xPosition, yPosition, xVelocity, yVelocity, color);
        this.width = width;
        this.height = height;
    }

//getter
    @Override
    public int getWidth() {
        return width;
    }

//setter
    public void setWidth(int width) {
        this.width = width;
    }

//getter
    @Override
    public int getHeight() {
        return height;
    }

//setter
    public void setHeight(int height) {
        this.height = height;
    }

//draw methid
    @Override
    public void draw(Graphics g) {
        g.fillRect(getXPosition(), getYPosition(), width, height);
    }

//getboudns method
    @Override
    public Rectangle getBounds() {
        return new Rectangle(getXPosition(), getYPosition(), width, height);
    }

//move method
    @Override
    public void move() {
        yPosition += getYVelocity();
    }
}
