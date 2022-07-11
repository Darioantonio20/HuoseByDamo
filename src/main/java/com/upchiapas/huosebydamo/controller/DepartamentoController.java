package com.upchiapas.huosebydamo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DepartamentoController {

    @FXML
    private Button btnsalida;

    @FXML
    private Pane pane;

    @FXML
    private TextArea txtAreaDepartamentos;

    @FXML
    void closePage(ActionEvent event) {
        Stage stage = (Stage) this.btnsalida.getScene().getWindow();
        stage.close();
    }

}
