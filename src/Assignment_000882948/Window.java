//@author Sujan Rokad, 000882948

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;

import static javafx.scene.paint.Color.*;

public class Window {
    private double x; //house position from top left corner and goes vertically to right side
    private double y; //house position from top left corner and goes horizontally to bottom
    private double diameter; //making variable for diameter of the window

    public Window(double x, double y, double diameter){
        this.x = x;
        this.y = y;
        this.diameter = diameter;
    }

    public void draw(GraphicsContext gc){
        gc.setFill(PEACHPUFF);
        gc.fillOval(x, y, diameter, diameter); //draws window
    }
}
