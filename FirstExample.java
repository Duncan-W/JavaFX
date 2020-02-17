package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FirstExample extends Application {
    Stage the_current_window;
    Button my_button;

    @Override
    public void start(Stage primaryStage) {
        the_current_window = primaryStage;
        the_current_window.setTitle("First example");
        my_button = new Button("click here");


        StackPane the_layout = new StackPane();
        the_layout.getChildren().add(my_button);


        Scene scene = new Scene(the_layout, 200, 200);

        the_current_window.setScene(scene);
        the_current_window.show();
    }

}
