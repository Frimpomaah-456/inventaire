package com.eafacheampong.inventaire;

import com.eafacheampong.inventaire.main.Management;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InventaireApplication extends Application {
    public static Management inventory;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InventaireApplication.class.getResource("main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("Inventaire Management System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        inventory = new Management();
        launch();
    }
}