/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */
package GameObjects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;

/**
 * Represents an enemy game object that moves horizontally and shoots beams.
 * Extends MovingGameObject class.
 *
 * @author ryan.wetzstein
 */
public class Enemy extends MovingGameObject {

    //the speed at which the enemy moves horizontally
    private static int moveSpeed = 2;
    //timer for shooting beams
    private Timer shootTimer;

    //random generator for beam shooting delay
    private Random random = new Random();

    //list to store beams shot by the enemy
    private ArrayList<Beam> beams;

//constructor
    public Enemy(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color) {
        super(xPosition, yPosition, xVelocity, yVelocity, color);
        this.width = 40;
        this.height = 25;
        //start moving to the right initially
        setXVelocity(moveSpeed);
        //initialize the shoot timer
        initializeShootTimer();
        //initialize the list of beams
        this.beams = new ArrayList<>();
    }

//create timer
    private void initializeShootTimer() {
        int delay = random.nextInt(5000) + 1000;
        shootTimer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //shoot a beam when the timer triggers
                shootBeam();
            }
        });
        shootTimer.start();
    }

//initialize the beams
    public void initializeBeams() {
        this.beams = new ArrayList<>();
        // Add initial beams if needed
    }

//beamshooting method
    private void shootBeam() {
        // Implement your beam creation logic here
        int beamX = getXPosition() + 20; // Adjust as needed
        int beamY = getYPosition() + 25;
        Beam beam = new Beam(beamX, beamY, 0, 5, 5, 5, Color.RED);
        beams.add(beam);
        // Add the created beam to your game panel or a list of beams
    }

//getbeams method
    public ArrayList<Beam> getBeams() {
        return this.beams;
    }

//draw method
    @Override
    public void draw(Graphics g) {
        // Draw an enemy using a rectangle with a circular top
        g.setColor(color);
        g.fillRect(xPosition, yPosition, 40, 25);

        // Draw the circular top of the enemy
        g.fillOval(xPosition, yPosition - 10, 40, 10);
    }

//getbounds method
    @Override
    public Rectangle getBounds() {
        return new Rectangle(getXPosition(), getYPosition(), 40, 25);
    }

//move method
    @Override
    public void move() {
        //vertical step when the enemy reaches the screen boundaries
        int verticalStep = 10;

        //move horizontally
        xPosition += getXVelocity();

        //check if the right-most enemy has exceeded the right boundary
        if ((xPosition + 40) > 600 || xPosition < 0) {
            // Change direction
            setXVelocity(-getXVelocity());

            // Move down by verticalStep
            yPosition += verticalStep;
        }
    }
}
