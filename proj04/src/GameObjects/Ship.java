/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameObjects;

/**
 * Represents a spaceship GameObject that can be controlled by the player.
 * Extends the ControlledGameObject class.
 *
 *
 *
 * @author Ryan
 */
import Controller.KeyboardController;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;

public class Ship extends ControlledGameObject {

    //constructor
    public Ship(int xPosition, int yPosition, Color color, KeyboardController control) {
        super(xPosition, yPosition, color, control);
        this.width = 40;
        this.height = 20;
    }

    //draw method
    @Override
    public void draw(Graphics g) {
        //draw spaceship body
        g.setColor(color);
        g.fillRect(xPosition, yPosition, width, height);

        //draw spaceship top
        int[] xPoints = {xPosition, xPosition + 20, xPosition + 40};
        int[] yPoints = {yPosition, yPosition - 20, yPosition};
        g.fillPolygon(xPoints, yPoints, 3);
    }

    //getBounds method
    @Override
    public Rectangle getBounds() {
        //get bounding box code
        return new Rectangle(getXPosition(), getYPosition(), width, height);
    }

    //move method
    @Override
    public void move() {

        //wrap right edge
        if (xPosition > 600) {
            // Wrap around to the left edge
            xPosition = -width;
        }

        //wrap left edge
        if (xPosition + width < 0) {

            xPosition = 600;
        }
        int xVelocity = 0;

        //move ship
        if (getControl().getLeftKeyStatus()) {
            xVelocity -= 4;
            xPosition += xVelocity;
        }
        if (getControl().getRightKeyStatus()) {
            xVelocity += 4;
            xPosition += xVelocity;
        }
    }
}
