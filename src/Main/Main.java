package Main;

// importing necessary libraries
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    int i;

    @Override
    public void start(Stage stage) throws Exception {
        // creating a button
        Button clickme = new Button("Click Me");

        // configuring the sizes
        clickme.setMinSize(150, 75);
        clickme.setMaxSize(200, 100);
        clickme.setPrefSize(175, 87.5);

        // create the new scene containing the button
        Scene scene = new Scene(clickme);

        // setting the scene of the stage to be the scene just created
        stage.setScene(scene);

        // setting the minimum dimensions of the window
        stage.setMinWidth(300);
        stage.setMinHeight(500);

        // setting the title
        stage.setTitle("First Java FX Program");

        // finally show the stage
        stage.show();

        /*
        * Some notes here.
        * A stage is basically like a window, so if you have two stages,
        * you then have two windows.
        *
        * Normally, an application should only have one stage,
        * but a stage can have multiple scenes(like groups of nodes)
        */
    }


    // main method for running the app
    public static void main(String args[]) {
        launch(args);
    }
}
