package sample;

// importing necessary libraries
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

public class Sample extends Application {

    int i;
    Label countDisplay;

    private static final String BUTTON_CLASS = "btn";
    private static final String BTN_PRIMARY = "btn-primary";
    private static final String BTN_SECONDARY = "btn-secondary";
    private static final String BTN_DANGER = "btn-danger";
    private static final String BTN_SUCCESS = "btn-success";
    private static final String BTN_LIGHT = "btn-light";
    private static final String BTN_INFO = "btn-info";
    private static final String CONTAINER_PANES = "containers";



    @Override
    public void start(Stage stage) throws Exception {

        // creating a button with jfoenix class
        Button clickme = new Button("Click Me");

        // configure the sizes of the button
        clickme.setMinWidth(100);
        clickme.setMinHeight(35);
        clickme.setPrefWidth(120);
        clickme.setPrefHeight(45);
        clickme.setMaxWidth(150);
        clickme.setMaxHeight(60);

        // add a class to it by first getting an
        // array like stuff and appending to it
        clickme.getStyleClass().addAll(BUTTON_CLASS, BTN_INFO);

        // add an mouse event listener to the button
        EventHandler<MouseEvent> clickmeOnclick = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                // increment i
                i++;

                // update the label
                countDisplay.setText(String.format("You clicked %d times", i));

            }
        };

        // binding the event handler to the button
        clickme.addEventFilter(MouseEvent.MOUSE_CLICKED, clickmeOnclick);

        // creating a border pane
        BorderPane container_pane = new BorderPane();

        // and create a vertical box with padding of 10
        VBox vbox = new VBox(10);

        // set the label to be one of the children of the vbox
        countDisplay = new Label(String.format("You clicked %d times", i));
        // add some class to it
        countDisplay.getStyleClass().addAll("normal-text", "labels");
        vbox.getChildren().add(countDisplay);

        // add the clickme button created as well
        vbox.getChildren().add(clickme);

        // finally add the vbox to the center of the container
        container_pane.setCenter(vbox);
        container_pane.getStyleClass().add(CONTAINER_PANES);
        vbox.setAlignment(Pos.CENTER);


        // create a new scene
        Scene mainScene = new Scene(container_pane);
        mainScene.setFill(Color.TRANSPARENT);

        // load custom css
        mainScene.getStylesheets().add(getClass().getResource("/css/master.css").toExternalForm());
        // load bootstrap
        mainScene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

        // setting the minimum dimensions of the window
        stage.setMinWidth(300);
        stage.setMinHeight(500);

        // add scene to stage
        stage.setScene(mainScene);


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
