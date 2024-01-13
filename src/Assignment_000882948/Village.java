/*
 * Author:                 Sujan Rokad
 * Authorship statement:   I, Sujan Rokad, 000882948, certify that this material is my original work.
 *                         No other person's work has been used without due acknowledgement.
 * Purpose:                Define a Village class to represent a village with houses.
 */

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import java.awt.*;

import static javafx.scene.paint.Color.*;

/**
 * The Village class represents a village with houses.
 */
public class Village {
    private double x; // X-coordinate of the village
    private double y; // Y-coordinate of the village
    private double size; // Size of the village
    private Color color; // Color of the village
    private String name; // Name of the village
    private House house1; // First house object in the village
    private House house2; // Second house object in the village

    /**
     * Initializes the state of the village.
     *
     * @param name  The name of the village.
     * @param x     The X-coordinate of the village.
     * @param y     The Y-coordinate of the village.
     * @param color The color of the village.
     */
    public void setState(String name, int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.size = (int) (Math.random() * 200 - 100 + 1) + 100; // Randomly generate village size

        // Set the color for the village
        this.color = color;

        // Create house objects
        house1 = new House(x, y - 100 + (Math.random() * 20 + 10), 110, this.color);
        house2 = new House(x + 100 + (Math.random() * 70 + 5), y - 50, 160, this.color);
    }

    /**
     * Draws the village on the provided GraphicsContext.
     *
     * @param gc The GraphicsContext on which to draw the village.
     */
    public void draw(GraphicsContext gc) {
        // Draw houses
        house1.draw(gc);
        house2.draw(gc);

        // Draw village information
        gc.setFill(LAVENDERBLUSH);
        gc.setFont(new Font("Arial Black", 10));
        gc.fillText(name + "\n(Size: " + size + "m, Population: " + house1.getOccupants() + ")", x - 5, y + size + 40);
    }
}
