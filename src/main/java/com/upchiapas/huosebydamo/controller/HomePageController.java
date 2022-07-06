package com.upchiapas.huosebydamo.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {
    @FXML
    private Button btnMasCasa;

    @FXML
    private Button btnMasDepartamentos;

    @FXML
    private Label idCaracteristicasCasa;

    @FXML
    private Pane idCasa;

    @FXML
    private Pane idDepartamento;

    @FXML
    private Label idLabelCaracteristicas;

    @FXML
    private Label idLabelTituloCasa;

    @FXML
    private Label labelTituloDepa;

    @FXML
    void infoCasa(ActionEvent event) throws IOException {

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/upchiapas/huosebydamo/casa-view.fxml"));

        primaryStage.setTitle("Inmoviliaria DAMO");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    void infoDepartamentos(ActionEvent event) throws IOException {

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/upchiapas/huosebydamo/departamento-view.fxml"));

        primaryStage.setTitle("Inmoviliaria DAMO");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
