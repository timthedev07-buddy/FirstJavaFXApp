package sample;

// importing necessary libraries
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Sample extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("My first JavaFX Application");
        stage.setScene(new Scene(root, 300, 275));
        stage.show();

        /**
         * I'll just use fxml instead
         */


//        // creating a button
//        Button clickme = new Button("Click Me");
//
//        // creating a stack pane, it's a back to front stacking layout
//        StackPane countainer_pane = new StackPane();
//
//        // and create a new nested tile pane
//        TilePane nestedPane = new TilePane(Orientation.VERTICAL);
//
//        // add a label to be one of the children of tile pane
//        Label countDisplay = new Label(String.format("You clicked %d times", i));
//        nestedPane.getChildren().add(countDisplay);
//
//        // add the clickme button created as well
//        nestedPane.getChildren().add(clickme);
//
//        // finally add the tile pane to the container pane
//        countainer_pane.getChildren().add(nestedPane);
//
//        // and set the alignment of the nested pane
//        StackPane.setAlignment(nestedPane, Pos.CENTER_RIGHT);
//
//        // create a new scene
//        Scene mainScene = new Scene(countainer_pane);
//
//        // setting the minimum dimensions of the window
//        stage.setMinWidth(300);
//        stage.setMinHeight(500);
//        // add scene to stage
//        stage.setScene(mainScene);
//
//        // setting the title
//        stage.setTitle("First Java FX Program");
//
//        // finally show the stage
//        stage.show();
//
//        /*
//        * Some notes here.
//        * A stage is basically like a window, so if you have two stages,
//        * you then have two windows.
//        *
//        * Normally, an application should only have one stage,
//        * but a stage can have multiple scenes(like groups of nodes)
//        */
    }


    // main method for running the app
    public static void main(String args[]) {
        launch(args);
    }
}
