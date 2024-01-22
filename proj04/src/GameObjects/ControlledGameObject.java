/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameObjects;

import Controller.KeyboardController;
import Interfaces.Moveable;
import java.awt.Color;

/**
 * Represents a game object that is controlled by the keyboard. It extends
 * GameObject and implements the Moveable interface. This is an abstract class,
 * meaning it cannot be instantiated directly. Subclasses are expected to
 * implement the move() method from the Moveable interface.
 *
 * @author Ryan
 */
public abstract class ControlledGameObject extends GameObject implements Moveable {

    //the keyboard controller associated with this object
    protected KeyboardController control;

//constructor
    public ControlledGameObject(int xPosition, int yPosition, Color color, KeyboardController control) {
        // Call the constructor of the superclass (GameObject) with provided parameters
        super(xPosition, yPosition, color);
        this.control = control;
    }

//getcontroller
    public KeyboardController getControl() {
        return control;
    }

//getter
    @Override
    public int getXPosition() {
        return xPosition;
    }

//getter
    @Override
    public int getYPosition() {
        return yPosition;
    }
}
