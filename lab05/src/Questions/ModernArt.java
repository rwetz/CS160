package Questions;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;

/**
 *
 * @author (Your Name Here)
 */
public class ModernArt extends JFrame
{
    @Override
    public void paint(Graphics g)
    {
        Color c = Color.RED;
        g.setColor(c);
        g.drawRect(50, 50, 50, 100);
        g.drawOval(50, 200, 50, 100);
        g.setColor(Color.MAGENTA);
        g.fillOval(50, 350, 50, 100);
        Polygon p = new Polygon();
        p.addPoint(200, 50);
        p.addPoint(175,155);
        p.addPoint(205,215);
        p.addPoint(225, 50);
        g.drawPolygon(p);
        Polygon p1 = new Polygon();
        p1.addPoint(50, 50);
        p1.addPoint(75, 75);
        p1.addPoint(100, 100);
        p1.addPoint(120, 125);
        g.setColor(Color.PINK);
        g.fillPolygon(p1);
        g.drawLine(400, 10, 10, 10);
        g.drawLine(425, 20, 20, 20);
        g.drawLine(450, 50 ,50, 50);
        g.drawString("This art is the embodiment of art itself.", 300, 300);
        
    }
    
    public ModernArt() {
        // This controls the size of Window and Exiting the program when is closes
        super.setSize(600, 600);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Creates and displays the Window when running this class
        EventQueue.invokeLater(() -> {
            new ModernArt().setVisible(true);
        });
    }   
}
    
