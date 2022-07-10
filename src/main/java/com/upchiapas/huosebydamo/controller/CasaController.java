package com.upchiapas.huosebydamo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CasaController {
    @FXML
    private Button btnSalida;
    @FXML
    private Pane pane;

    @FXML
    private Label salidaAreaDeLavado;

    @FXML
    private Label salidaBaños;

    @FXML
    private Label salidaCaracteristicas;

    @FXML
    private Label salidaCochera;

    @FXML
    private Label salidaCuartos;

    @FXML
    private Label salidaDimensiones;

    @FXML
    private Label salidaNotaExtra;

    @FXML
    private Label salidaNumeroDeContacto;

    @FXML
    private Label salidaPisos;

    @FXML
    private Label salidaUbicacion;

    @FXML
    void closePage(ActionEvent event) {
        Stage stage = (Stage) this.btnSalida.getScene().getWindow();
        stage.close();
    }
}
