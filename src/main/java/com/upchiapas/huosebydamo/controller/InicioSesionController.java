package com.upchiapas.huosebydamo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class InicioSesionController {
    @FXML
    private Button btnEntrada;

    @FXML
    private PasswordField pass;

    @FXML
    private TextField userName;

    @FXML
    void ingresarHome(ActionEvent event) throws IOException {
        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/upchiapas/huosebydamo/home-page-view.fxml"));

        primaryStage.setTitle("Inmoviliaria DAMO");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
