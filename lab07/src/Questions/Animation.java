/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.ActionEvent;

/**
 *
 * @author (Your Name Here)
 */
public class Animation extends JFrame {

    private Ball ball;

    public Animation() {
        // Set the size of the Window
        super.setSize(400, 400);

        // Terminate the Program when closing the Window
        super.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Create an instance of the Ball class
        ball = new Ball(200, 200, 20);

        // Create a Timer to move the ball and repaint the screen
        Timer timer = new Timer(150, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detectCollisions();
                ball.move();
                repaint();
            }
        });

        // Start the Timer
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paint(g);

        // Draw the ball on the screen
        ball.draw(g);
    }

    public void detectCollisions() {
        int x = ball.getXPosition();
        int y = ball.getYPosition();
        int diameter = ball.getDiameter();

        // Detect collisions with the walls and reverse the direction if necessary
        if (x - diameter <= 0 || x + diameter >= getDiameter()) {
            ball.reverseXDirection();
        }
        if (y - diameter <= 0 || y + diameter >= getDiameter()) {
            ball.reverseYDirection();
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new Animation().setVisible(true));
    }
}
