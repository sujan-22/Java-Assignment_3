package Assignment_000882948;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

import java.awt.*;
import java.util.Random;

import static javafx.application.Application.launch;
import static javafx.scene.paint.Color.*;

/**
 * Use this template to create drawings in FX. Change the name of the class and
 * put your own name as author below. Change the size of the canvas and the
 * window title where marked and add your drawing code where marked.
 *
 * @author Sujan Rokad, 000882948
 */
public class TwoVillages extends Application {

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(1050, 850); // Set canvas Size in Pixels
        stage.setTitle("The Villages"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE
//        set background color to darkgrey
        gc.setFill(DARKBLUE);
//        set background color to whole canvas
        gc.fillRect(0,0,1050,850);

        Village v1 = new Village(); //Create an object of village class
        Village v2 = new Village(); //Create a second object of village class

//        Calls a constructor and make an object of House class and set the parameters
        House h1 = new House(400, 1+(int)(50+(Math.random()*320)), Color.BLACK);

//        calls a constructor of a village class and sets parameters of two objects
        v1.State("Liverpool", 40, 10+(int)(200 + (Math.random()*400)), Color.CYAN);
        v2.State("Ash Ville", 650, 20+(int)(100 + (Math.random()*350)), Color.DARK_GRAY);


        v1.draw(gc);  //draws first village
        v2.draw(gc); //draws second village
        h1.draw(gc); //draws king's castle

        // YOUR CODE STOPS HERE

        stage.show();
    }

    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
