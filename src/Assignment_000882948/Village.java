//@author Sujan Rokad, 000882948

package Assignment_000882948;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

import java.awt.*;

import static javafx.scene.paint.Color.*;

public class Village {
    private double x; //house position from top left corner and goes vertically to right side
    private double y; //house position from top left corner and goes horizontally to bottom
    private double size; // size of the village
    private Color color; //village color
    private String name; //village name
    private House house1; //declaring one object from house class
    private House house2; //declaring second object from house class

    public void State(String name, int x, int y, Color color){
        this.x = x;
        this.y = y;
        this.name = name;
        this.size = (int)(Math.random()*200-100+1)+100; //random number generate for village size

        house1 = new House(x, y-100 + (Math.random() * 20 + 10), 110, this.color); //to draw the first object in the village class, calls one object
        house2 = new House(x + 100 + (Math.random()* 70 + 5), y-50, 160, this.color); //calls second object from the house class to draw second house within the village
    }

    public void draw(GraphicsContext gc){
        house1.draw(gc); //draws first house
        house2.draw(gc); //draws second house
       gc.setFill(LAVENDERBLUSH);
       gc.setFont(new Font("Arial Black",10));
       gc.fillText(name + "\n(Size: "+size+"m, Population: "+ house1.getOccupants()+")", x-5, y+size+40); //draws the population, size and name of the village
    }

}
