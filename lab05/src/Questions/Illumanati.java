/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author ryan.wetzstein
 */
public class Illumanati {

    //instance variables//
    int xPos;
    int yPos;
    Color color;

    //constructor
    public Illumanati(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        //this.color = color;
    }

    //accessors//
    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    public Color getColor() {
        return color;
    }

    //mutators//
    public void setXPos(int xPos) {
        this.xPos = xPos;
    }

    public void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(Graphics g) {
        Color color = Color.GREEN;
        g.setColor(color);
        Polygon triangle = new Polygon();
        triangle.addPoint(xPos + 25, yPos);
        triangle.addPoint(xPos - 25, yPos + 50);
        triangle.addPoint(xPos + 75, yPos + 50);
        g.fillPolygon(triangle);
        g.setColor(Color.BLACK);
        g.fillOval(xPos, yPos + 20, 50, 25);
        g.setColor(Color.WHITE);
        g.fillOval(xPos + 15, yPos + 27, 20, 10);
    }
}
