/*
 * To change this license header, choose License Headers in Project Properties
 * To change this template file, choose Tools | Templates
 * and open the template in the editor
 */
package Game;

import Controller.KeyboardController;
import GameObjects.Beam;
import GameObjects.Bullet;
import GameObjects.Enemy;
import GameObjects.MovingShield;
import GameObjects.Shield;
import GameObjects.Ship;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author
 */
public class GamePanel extends JPanel {

    // These are for handling the frame rate of the game and player controls
    // You should pass the controller to any objects you create that will
    //  be under keyboard control
    private Timer gameTimer;
    private KeyboardController controller;

    // Controls size of game window and framerate
    // You can adjust these if you want to use different values 
    private final int gameWidth = 600;
    private final int gameHeight = 720;
    private final int framesPerSecond = 60;
    private Ship player;
    private Enemy enemy;
    private Shield shield;
    //private Beam beam;
    private Bullet bullet = null;
    private ArrayList<Enemy> enemies;
    private ArrayList<Beam> beams;
    private int shootInterval = 250;
    private int lastShot = 0;
    private ArrayList<Beam> removeBeams;
    Random rand = new Random();
    private int lives = 3;
    private String liveCounter = "Lives: ";
    private int score = 0;
    private String scoreCounter = "Score: ";
    private MovingShield movingShield;

    private String winMessage = null;
    private String loseMessage = null;

    private int currentBulletColorIndex = 0;

    private Color[] bulletColors = {
        Color.RED,
        Color.GREEN,
        Color.BLUE,
        Color.YELLOW,
        Color.CYAN,
        Color.MAGENTA,
        Color.PINK,
        Color.GRAY
    };

    /**
     * This method is called by the GameFrame class when starting the game for
     * the first time. It should be used like a constructor method where you
     * initialize all of the instance variables. You can also use this method to
     * reset a game after a player wins or loses and wants to play again.
     */
    public final void setupGame() {
        //initialize player, beams, removeBeams, and enemies
        player = new Ship(265, 660, Color.GREEN, controller);
        beams = new ArrayList<>();
        removeBeams = new ArrayList<>();
        enemies = new ArrayList<>();

        int enemyWidth = 40;
        int enemyHeight = 25;
        int horizontalGap = 20;
        int verticalGap = 20;

        //create a grid of enemies
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 10; col++) {
                int xPosition = col * (enemyWidth + horizontalGap) + 60;
                int yPosition = row * (enemyHeight + verticalGap) + 60;

                //create an enemy and initialize its beams
                Enemy enemy = new Enemy(xPosition, yPosition, 1, 0, Color.BLUE);
                enemy.initializeBeams();

                //add enemy to the ArrayList
                enemies.add(new Enemy(xPosition, yPosition, 1, 0, Color.BLUE));
            }
        }
        //create a shield
        shield = new Shield(245, 600, 100, 5, Color.WHITE);

        //instantiate a MovingShield object
        movingShield = new MovingShield(245, 500, 5, 0, 50, 5, Color.YELLOW);

    }

    /**
     * This method is automatically called by the game timer every frame. As
     * typical, you should use it to draw all of your game objects.
     *
     * @param g The Graphics object used for drawing the GameObject instances.
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //draw player, lives, score, enemies, shield, bullet, and beams
        player.draw(g);
        g.drawString(liveCounter + lives, 5, 10);
        g.drawString(scoreCounter + score, 5, 20);
        for (Enemy enemy : enemies) {
            enemy.draw(g);
        }
        shield.draw(g);
        if (bullet != null) {
            bullet.draw(g);
        }
        for (Beam beam : beams) {
            beam.draw(g);
        }

        movingShield.draw(g);

        //display win or lose messages
        if (winMessage != null) {
            g.setColor(Color.GREEN);
            g.drawString(winMessage, gameWidth / 2 - 100, gameHeight / 2);
        } else if (loseMessage != null) {
            g.setColor(Color.RED);
            g.drawString(loseMessage, gameWidth / 2 - 100, gameHeight / 2);
        }
    }

    /**
     * This method is automatically called by the game timer every frame. Any of
     * your code for moving game objects or handling collisions, etc. should be
     * done by this method. The method has a single parameter which represents
     * the current frame number, which is incremented by the Timer each time
     * before the method is called. You can assume that it will always increase,
     * but it will eventually overflow if the game runs long enough (something
     * like 1 year)
     *
     * @param frameNumber The number of the current frame.
     */
    public void updateGameState(int frameNumber) {
        player.move();
        movingShield.move();

        //create a list to store beams to be removed
        ArrayList<Beam> beamsToRemove = new ArrayList<>();

        //check collisions between beams and player, beams and shield
        for (Beam beam : beams) {
            if (beam != null && beam.isColliding(player)) {
                lives -= 1;
                beamsToRemove.add(beam);
            }
            if (beam != null && beam.isColliding(shield)) {
                beamsToRemove.add(beam);
            }
            if (beam != null && beam.isColliding(movingShield)) {
                beamsToRemove.add(beam);
            }

            //check if beam's x-position is greater than 720
            if (beam != null && beam.getYPosition() > gameHeight) {
                beamsToRemove.add(beam);
            }
        }

        //remove beams marked for removal
        beams.removeAll(beamsToRemove);

        //use an iterator to safely remove enemies during iteration
        Iterator<Enemy> enemyIterator = enemies.iterator();
        while (enemyIterator.hasNext()) {
            Enemy enemy = enemyIterator.next();

            //check if bullet hits an enemy
            if (bullet != null && bullet.isColliding(enemy)) {
                enemyIterator.remove();
                bullet = null;

                //update score
                score += 50;
            }

            if (bullet != null && bullet.getYPosition() < 0) {
                bullet = null;
            }

            if (bullet != null && bullet.isColliding(movingShield)) {
                bullet = null;
            }
        }

        //move enemies and handle shooting logic
        Enemy removeE = null;
        for (Enemy enemy : enemies) {
            enemy.move();
            if (lastShot >= shootInterval && frameNumber % 25 == 0) {
                int r = rand.nextInt(8);
                if (r == 0) {
                    beams.add(new Beam(enemy.getXPosition(), enemy.getYPosition(), 1, 3, 1, 15, Color.GREEN));
                    lastShot = 0;
                }
            }
            //check if bullet hits an enemy
            if (bullet != null && bullet.isColliding(enemy)) {
                removeE = enemy;
                bullet = null;
                //update score
                score += 50;
            }
            lastShot++;

            //change direction if enemy hits the boundary
            if (enemy.getXPosition() + enemy.getBounds().width >= gameWidth || enemy.getXPosition() <= 0) {
                enemy.move();
            }
        }
        //remove enemy if hit by bullet
        if (removeE != null) {
            enemies.remove(removeE);
        }

        //handle bullet shooting
        boolean upKeyStatus = controller.getUpKeyStatus();
        //in your shooting logic
        if (upKeyStatus && bullet == null) {
            //set bullet color based on the current index
            Color bulletColor = bulletColors[currentBulletColorIndex];
            bullet = new Bullet(player.getXPosition() + player.getBounds().width / 2, player.getYPosition(), 25, bulletColor);

            //increment the index or reset to 0
            currentBulletColorIndex = (currentBulletColorIndex + 1) % bulletColors.length;
        }

        //move the existing bullet
        if (bullet != null) {
            if (bullet.getYPosition() + bullet.getBounds().height <= 0) {
                bullet = null;
            } else {
                bullet.move();
            }
        }

        ///BEAMS ACTION
        //check collisions between beams and player
        for (Beam bb : beams) {
            if (bb != null && bb.isColliding(player)) {
                removeBeams.add(bb);
            }
            bb.move();
        }

        //check for win condition (all enemies destroyed)
        if (enemies.isEmpty()) {
            winMessage = "Congratulations! You won!";
            resetGame();
            return;
        }

        //check for lose condition
        if (lives <= 0) {
            loseMessage = "Game Over! You lost.";
            resetGame();
            return;
        }

//        //increase enemy speed every 1000 frames
//        for (Enemy enemy : enemies) {
//            if (frameNumber % 1000 == 0) {  
//                enemy.increaseSpeed();  
//            }
//        }
    }

    /**
     * Constructor method for GamePanel class. It is not necessary for you to
     * modify this code at all
     */
    public GamePanel() {
        // Set the size of the Panel
        this.setSize(gameWidth, gameHeight);
        this.setPreferredSize(new Dimension(gameWidth, gameHeight));

        this.setBackground(Color.BLACK);

        // Register KeyboardController as KeyListener
        controller = new KeyboardController();
        this.addKeyListener(controller);

        // Call setupGame to initialize fields
        this.setupGame();

        this.setFocusable(true);
        this.requestFocusInWindow();
    }

    /**
     * Method to start the Timer that drives the animation for the game. It is
     * not necessary for you to modify this code unless you need to in order to
     * add some functionality.
     */
    public void start() {
        // Set up a new Timer to repeat based on the set framesPerSecond
        gameTimer = new Timer(1000 / framesPerSecond, new ActionListener() {

            // Tracks the number of frames that have been produced.
            // May be useful for limiting action rates
            private int frameNumber = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                // Update the game's state and repaint the screen
                updateGameState(frameNumber++);
                repaint();
            }
        });

        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    private void resetGame() {
        //reset player position, lives, and score
        player.setXPosition(265);
        player.setYPosition(660);
        lives = 3;
        score = 0;

        //clear existing enemies and create a new set
        enemies.clear();
        int enemyWidth = 40;
        int enemyHeight = 25;
        int horizontalGap = 20;
        int verticalGap = 20;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 10; col++) {
                int xPosition = col * (enemyWidth + horizontalGap) + 60;
                int yPosition = row * (enemyHeight + verticalGap) + 60;
                enemies.add(new Enemy(xPosition, yPosition, 1, 0, Color.BLUE));
            }
        }

        //clear beams and bullet
        beams.clear();
        bullet = null;

        //reset win and lose messages
        winMessage = null;
        loseMessage = null;
        //setupGame();
    }

    private boolean isEnemiesAtBottom() {
        //check if any enemy has reached the bottom of the screen
        for (Enemy enemy : enemies) {
            if (enemy.getYPosition() + enemy.getHeight() >= gameHeight) {
                return true;
            }
        }
        return false;
    }

}
