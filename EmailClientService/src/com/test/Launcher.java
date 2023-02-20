package com.test;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button button = new Button("Click to say Hi");
        button.setOnAction(e -> {
            System.out.println("Hello Mr. Miroslav Balík!");
        });

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button);

        Scene scene = new Scene(stackPane, 300, 250);
        stage.setScene(scene);

        stage.show();

    }
}
