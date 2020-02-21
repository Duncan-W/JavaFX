package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Inner_anonymous extends Application {
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    int counter =0;

    @Override
    public void start(Stage wherethepartyat){
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button0.setText("What will it do?");
        button1.setText("What will it do?");
        button2.setText("What will it do?");
        button3.setText("What will it do?");

        // THIS CODE

        button2.setOnMouseClicked(w00t ->{ counter++; System.out.println("Somebody successfully clicked button number 2: "+counter+ " times");});

        // AND THIS CODE ARE DOING LITERALLY THE EXACT SAME THING

        button2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                counter++;
                System.out.println("Somebody successfully clicked button number 2: "+counter+ " times");
            }
        });

        HBox hbox = new HBox();
        hbox.getChildren().addAll(button0,button1,button2,button3);
        Scene scene = new Scene(hbox, 500, 200);
        wherethepartyat.setScene(scene);
        wherethepartyat.show();
    }

}