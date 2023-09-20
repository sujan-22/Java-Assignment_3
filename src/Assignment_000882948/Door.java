//@author Sujan Rokad, 000882948

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;

import static javafx.scene.paint.Color.*;

public class Door {
    private double x; //house position from top left corner and goes vertically to right side
    private double y; //house position from top left corner and goes horizontally to bottom
    private double height; //making variable for height of the door

    public Door(double x, double y, double height){
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public void draw(GraphicsContext gc){
        gc.setFill(BLACK);
        gc.fillRect(x, y, height/1.7, height); //draws the door
    }
}
