package com.typer.telegrapher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainWindow.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),600.0,400.0);
        stage.setResizable(false);
        stage.setTitle("Telegrapher");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {launch();}
}