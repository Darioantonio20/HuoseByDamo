package com.upchiapas.huosebydamo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class main extends Application {
    private  static Stage stage;
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        this.scene = scene;
        scene = new Scene(loadFXML("home-view"));
        stage.setTitle("House by DAMO");
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }

    public  static Parent loadFXML(String nameView){
        FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource(nameView+".fxml"));
        try {
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void setFXML (String nameView, String title){
        scene.setRoot(loadFXML(nameView));
    }

    public static void main(String[] args) {
        launch();
    }
}