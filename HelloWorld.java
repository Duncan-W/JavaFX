package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    @Override
    public void start(Stage hello_world_stage) {

        Label label = new Label("Hello world!");
        Scene scene = new Scene(label);
        hello_world_stage.setScene(scene);
        hello_world_stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }

}
