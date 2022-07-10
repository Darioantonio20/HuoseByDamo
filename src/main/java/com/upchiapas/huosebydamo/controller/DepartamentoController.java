package com.upchiapas.huosebydamo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DepartamentoController {

    @FXML
    private Button btnsalida;

    @FXML
    private Pane pane;

    @FXML
    private Label salidaBañoIndividualDepartamento;

    @FXML
    private Label salidaCapacidadDePersonasDepartamento;

    @FXML
    private Label salidaCaracteristicasDepartamento;

    @FXML
    private Label salidaClimaDepartamento;

    @FXML
    private Label salidaDimensionesDepartamento;

    @FXML
    private Label salidaInternetDepartamento;

    @FXML
    private Label salidaNotaExtraDepartamento;

    @FXML
    private Label salidaNumeroDeContactoDepartamento;

    @FXML
    private Label salidaSemiAmuebladoDepartamento;

    @FXML
    private Label salidaUbicacionDepartamento;

    @FXML
    void closePage(ActionEvent event) {
        Stage stage = (Stage) this.btnsalida.getScene().getWindow();
        stage.close();
    }

}
