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
public class NewTriangle extends JFrame {

    //triangles//
    Illumanati t1 = new Illumanati(150, 150);
    Illumanati t2 = new Illumanati(200, 200);
    Illumanati t3 = new Illumanati(100, 100);
    Illumanati t4 = new Illumanati(250, 250);

    @Override
    public void paint(Graphics g) {
        t1.draw(g);
        t2.draw(g);
        t3.draw(g);
        t4.draw(g);

    }

    public NewTriangle() {
        // This controls the size of Window and Exiting the program when is closes
        super.setSize(600, 600);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Creates and displays the Window when running this class
        EventQueue.invokeLater(() -> {
            new NewTriangle().setVisible(true);
        });
    }

}
