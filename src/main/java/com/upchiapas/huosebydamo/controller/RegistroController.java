package com.upchiapas.huosebydamo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistroController {
    @FXML
    private Button btnAltaUser;

    @FXML
    private TextField idConfirmarContraseña;

    @FXML
    private TextField idCorreo;

    @FXML
    private TextField idNewContraseña;

    @FXML
    private TextField idNewName;

    @FXML
    private TextField idPrimerApellido;

    @FXML
    private TextField idSegundoApellido;

    @FXML
    void guardarDatos(ActionEvent event) throws IOException {
        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/upchiapas/huosebydamo/home-page-view.fxml"));

        primaryStage.setTitle("Inmoviliaria DAMO");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
