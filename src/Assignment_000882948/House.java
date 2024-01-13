/*
 * Author:                 Sujan Rokad
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgement.
 * Purpose:                Define a House class to represent houses with doors and windows.
 */

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

import static javafx.scene.paint.Color.*;

/**
 * The House class represents a house with doors and windows.
 */
public class House {
    private double x; // X-coordinate of the house
    private double y; // Y-coordinate of the house
    private double size; // Size of the house
    private int occupants; // Number of occupants
    private Color color; // Color of the house
    private Door door; // Door within the house
    private Window window; // Window within the house

    /**
     * Constructs a regular house with doors and windows.
     *
     * @param x     The X-coordinate of the house.
     * @param y     The Y-coordinate of the house.
     * @param size  The size of the house.
     * @param color The color of the house.
     */
    public House(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.size = size;
        this.occupants = (int) (Math.random() * (60 - 20)); // Random population
        door = new Door(x + (size / 4) + (size / 6.5), y + size - (size / 3), size / 3); // Door object
        window = new Window(x + (size / 3) + (size / 6), y + ((size - (size / 10)) / 4), 40); // Window object
    }

    /**
     * Constructs a king's castle with a single occupant.
     *
     * @param x     The X-coordinate of the king's castle.
     * @param y     The Y-coordinate of the king's castle.
     * @param color The color of the king's castle.
     */
    public House(double x, double y, Color color) {
        this.size = 220; // King's castle size
        this.occupants = 1; // Set occupants to 1 (king himself)
        this.x = x;
        this.y = y;
        this.color = color;
        door = new Door(x + (size / 8) + (size / 12) + 35, y + size - (size / 2.3), size / 2.3); // Door object
        window = new Window(x + (20 + ((size / 2) + (size / 8))), y + (size / 17) + ((size - (size / 6)) / 4), 50); // Window object
    }

    /**
     * Gets the size of the house.
     *
     * @return The size of the house.
     */
    public double getSize() {
        return size;
    }

    /**
     * Sets the number of occupants to 1.
     *
     * @param occupants The number of occupants.
     */
    public void setOccupants(int occupants) {
        this.occupants = 1;
    }

    /**
     * Gets the number of occupants in the house.
     *
     * @return The number of occupants.
     */
    public int getOccupants() {
        return occupants;
    }

    /**
     * Draws the house on the provided GraphicsContext.
     *
     * @param gc The GraphicsContext on which to draw the house.
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(FIREBRICK);
        gc.fillRect(x, y, size, size);
        door.draw(gc); // Draws the door
        window.draw(gc); // Draws the window
    }
}
