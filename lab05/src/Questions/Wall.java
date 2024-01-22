/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author ryan.wetzstein
 */
public class Wall extends JFrame {

    //bricks
    Brick b1 = new Brick(50, 25, 50, 100, Color.BLACK);
    Brick b2 = new Brick(50, 150, 50, 100, Color.BLACK);
    Brick b3 = new Brick(50, 275, 50, 100, Color.BLACK);
    Brick b4 = new Brick(50, 400, 50, 100, Color.BLACK);
    Brick b5 = new Brick(200, 25, 50, 100, Color.BLACK);
    Brick b6 = new Brick(200, 150, 50, 100, Color.BLACK);
    Brick b7 = new Brick(200, 275, 50, 100, Color.BLACK);
    Brick b8 = new Brick(200, 400, 50, 100, Color.BLACK);

    @Override
    public void paint(Graphics g) {
        b1.draw(g);
        b2.draw(g);
        b3.draw(g);
        b4.draw(g);
        b5.draw(g);
        b6.draw(g);
        b7.draw(g);
        b8.draw(g);
    }

    public Wall() {
        // This controls the size of Window and Exiting the program when is closes
        super.setSize(600, 600);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Creates and displays the Window when running this class
        EventQueue.invokeLater(() -> {
            new Wall().setVisible(true);
        });
    }

}
