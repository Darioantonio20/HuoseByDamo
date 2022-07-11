package com.upchiapas.huosebydamo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeViewController {

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnRegistrate;

    @FXML
    void sesionIniciar(ActionEvent event) throws IOException {

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/upchiapas/huosebydamo/sesion-view.fxml"));

        primaryStage.setTitle("Datos iniciar sesión");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    void registroAhora(ActionEvent event) throws IOException {

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/upchiapas/huosebydamo/registro-view.fxml"));
        primaryStage.setTitle("Datos iniciar sesión");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }


}





