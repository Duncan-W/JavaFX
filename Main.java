package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) {
        HBox hbox = new HBox(50);

        VBox vbox0 = new VBox();
        VBox vbox1 = new VBox(20);
        VBox vbox2 = new VBox(10);


        for (int i = 0; i < 5; i++)
        {
            Button bt = new Button("A-Button " + (i+1));
            Button bt2 = new Button("B-Button " + (i+1));
            Button bt3 = new Button("C-Button " + (i+1));

            vbox0.getChildren().add(bt);
            vbox1.getChildren().add(bt2);
            vbox2.getChildren().add(bt3);
        }

        hbox.getChildren().addAll(vbox0, vbox1, vbox2);
        Scene scene = new Scene(hbox, 350, 350); // the hbox is the root node

        primaryStage.setTitle("Nested HBox and VBox's");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
