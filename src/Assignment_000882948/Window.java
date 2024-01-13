/*
 * Author:                 Sujan Rokad
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgement.
 * Purpose:                Define a Window class to represent windows in a house.
 */

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;

import static javafx.scene.paint.Color.*;

/**
 * The Window class represents a window in a house.
 */
public class Window {
    private double x; // X-coordinate of the window
    private double y; // Y-coordinate of the window
    private double diameter; // Diameter of the window

    /**
     * Initializes the state of the window.
     *
     * @param x        The X-coordinate of the window.
     * @param y        The Y-coordinate of the window.
     * @param diameter The diameter of the window.
     */
    public Window(double x, double y, double diameter) {
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    /**
     * Draws the window on the provided GraphicsContext.
     *
     * @param gc The GraphicsContext on which to draw the window.
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(PEACHPUFF);
        gc.fillOval(x, y, diameter, diameter); // Draws the window
    }
}
