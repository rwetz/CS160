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
 * Represents a shield GameObject that can be drawn on the screen. Extends the
 * GameObject class.
 *
 * @author ryan.wetzstein
 */
public class Shield extends GameObject {

//constructor
    public Shield(int xPosition, int yPosition, int width, int height, Color color) {
        super(xPosition, yPosition, width, height, color);
    }

//getwidth method
    @Override
    public int getWidth() {
        return width;
    }

//getheight method
    @Override
    public int getHeight() {
        return height;
    }

//setwidth
    public void setWidth(int width) {
        this.width = width;
    }

//setheight method
    public void setHeight(int height) {
        this.height = height;
    }

//draw method
    @Override
    public void draw(Graphics g) {
        //code to draw the shield
        g.setColor(color);
        g.fillRect(xPosition, yPosition, width, height);
    }

//getbounds method
    @Override
    public Rectangle getBounds() {
        //implement actual values
        return new Rectangle(getXPosition(), getYPosition(), width, height);
    }
}
