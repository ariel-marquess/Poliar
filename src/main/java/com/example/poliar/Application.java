package com.example.poliar;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("/com/example/poliar/poliar-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Poliar");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        javafx.application.Application.launch(Application.class, args);
    }
}
