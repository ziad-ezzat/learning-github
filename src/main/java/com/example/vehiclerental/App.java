package com.example.vehiclerental;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("FXML/Login.fxml"));
        Scene scene1 = new Scene(fxmlLoader.load());
        stage.setScene(scene1);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}
