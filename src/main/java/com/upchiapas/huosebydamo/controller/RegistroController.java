package com.upchiapas.huosebydamo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistroController {

    @FXML
    private Button btnAltaUser;

    @FXML
    private TextField idApellidos;

    @FXML
    private PasswordField idContraseña;

    @FXML
    private TextField idCorreoElectronico;

    @FXML
    private TextField idNombreDeUsuario;

    @FXML
    private TextField idNombres;

    @FXML
    private PasswordField idNumeroDeContacto;

    @FXML
    void btnDarDeAltaOnMouseClicked(MouseEvent event) {

    }


    @FXML
    void guardarDatos(ActionEvent event) throws IOException {
        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/upchiapas/huosebydamo/home-page-view.fxml"));

        primaryStage.setTitle("Inmoviliaria DAMO");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
