import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Scanner;

/**
 * Use this template to create drawings in FX. Change the name of the class and
 * put your own name as author below. Change the size of the canvas and the
 * window title where marked and add your drawing code where marked.
 *
 * @author Ayub Ali
 */

public class StarField extends Application{

    /**
     * Start method (use this instead of main).
     *
     * @param stage The FX stage to draw on
     * @throws Exception
     */


    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        Canvas canvas = new Canvas(1000, 1000); // Set canvas Size in Pixels
        stage.setTitle("StarField"); // Set window title
        root.getChildren().add(canvas);
        stage.setScene(scene);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // YOUR CODE STARTS HERE

        //Ask user for x and y inputs for their star here. Function Call!
        Scanner scanner = new Scanner(System.in);

        // sout to welcome user and inform them on what they are doing.

        System.out.println("Hello, User you are going to create your own constellation today!");

        // Asking user same values 4 times here:
        for(int q = 0; q<4; q++){

            // Getting user input for X and Y here.
            System.out.println("We need your first star coordinate X:");
            double x = scanner.nextInt();
            System.out.println("We need your second star coordinate Y:");
            double y = scanner.nextInt();

            while(x >= 1000 || y >= 1000){
                q -= 1;
                System.out.println("Invalid coordinates. Coordinates must be less than 1000.");
                System.out.println("We need your first star coordinate X again:");
                x = scanner.nextInt();
                System.out.println("We need your second star coordinate y again:");
                y = scanner.nextInt();
            }
            // Creating user star with gc here.
            gc.setFill(Color.RED);
            gc.fillOval(x,y,70,70);



        }


//        ====================================================================//

        // Displays night sky
        for(int i=0; i<600; i++){
            gc.setFill(Color.WHITE);
            double size = Math.random()*5;
            gc.fillOval(Math.random()*1000, Math.random()*1000,size,size);
        }

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

