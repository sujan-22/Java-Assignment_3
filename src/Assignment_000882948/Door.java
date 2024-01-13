/*
 * Author:                 Sujan Rokad
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgement.
 * Purpose:                Define a Door class to represent doors within houses.
 */

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;

import static javafx.scene.paint.Color.*;

/**
 * The Door class represents a door within a house.
 */
public class Door {
    private double x; // X-coordinate of the door
    private double y; // Y-coordinate of the door
    private double height; // Height of the door

    /**
     * Constructs a door with specified coordinates and height.
     *
     * @param x      The X-coordinate of the door.
     * @param y      The Y-coordinate of the door.
     * @param height The height of the door.
     */
    public Door(double x, double y, double height) {
        this.height = height;
        this.x = x;
        this.y = y;
    }

    /**
     * Draws the door on the provided GraphicsContext.
     *
     * @param gc The GraphicsContext on which to draw the door.
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(BLACK);
        gc.fillRect(x, y, height / 1.7, height); // Draws the door
    }
}
