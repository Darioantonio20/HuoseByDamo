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

public class RegistroCasaController {

    @FXML
    private Button btnRegistroDeCasa;

    @FXML
    private TextField idAreaDeLavadoCasa;

    @FXML
    private PasswordField idCantidadDeBañosCasa;

    @FXML
    private PasswordField idCocheraCasa;

    @FXML
    private TextField idDimencionesCasa;

    @FXML
    private PasswordField idNotaExtraCasa;

    @FXML
    private PasswordField idNumeroDeContactoCasa;

    @FXML
    private TextField idNumeroDeCuartosCasa;

    @FXML
    private PasswordField idNumeroDePisosCasa;

    @FXML
    private TextField idUbicacionCasa;

    @FXML
    void btnEntradaOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void ingresarHome(ActionEvent event) throws IOException {

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/upchiapas/huosebydamo/casa-view.fxml"));

        primaryStage.setTitle("Datos iniciar sesión");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

}
