//@author Sujan Rokad, 000882948

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;

import java.awt.*;

import static javafx.scene.paint.Color.*;


public class House {
    private double x; //house position from top left corner and goes vertically to right side
    private double y; //house position from top left corner and goes horizontally to bottom
    private double size; // size of the house
    private int occupants; //number of occupants
    private Color color; //house color
    private Door door; //door within house
    private Window window; //window within house

//    Declaring house constructor
    public House(double x, double y, double size, Color color){
        this.x = x;
        this.y = y;
        this.color = color;
        this.size = size;
        this.occupants = (int)(Math.random() * (60-20)); //random population
        door = new Door(x + (size/4) + (size/6.5), y + size - (size/3), size/3); //calling an object from door and set values within class
        window = new Window(x + (size/3) + (size/6), y + ((size - (size / 10)) / 4),40); //calling an object from window and set values with class
    }

    public House(double x, double y, Color color){
        this.size = 220; //King's castle size which is the biggest
        this.occupants = (int)1; //sets occupants to 1; king himself
        this.x = x;
        this.y = y;
        this.color = color;
        door = new Door(x+(size /8)+(size /12)+35,y+ size -(size /2.3), size /2.3); //calling an object from door and set values within class
        window = new Window(x + (20 + ((size /2) + (size /8))), y + (size / 17) + ((size - (size / 6)) / 4),50);  //calling an object from window and set values with class
    }

//    calling get method for size
    public double getSize() {
        return size;
    }

//    calling set method for occupants
    public void setOccupants(int occupants) {
        this.occupants = 1;
    }

//    calling get method for occupants
    public int getOccupants() {
        return occupants;
    }
    public void draw(GraphicsContext gc){
        gc.setFill(FIREBRICK);
        gc.fillRect(x, y, size, size);
        door.draw(gc); //draws the door
        window.draw(gc); //draws the window
    }
}
