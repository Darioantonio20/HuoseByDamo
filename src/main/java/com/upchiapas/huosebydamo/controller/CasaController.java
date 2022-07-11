package com.upchiapas.huosebydamo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CasaController {

    @FXML
    private Button btnSalida;

    @FXML
    private Pane pane;

    @FXML
    public static TextArea textArea;

    @FXML
    void closePage(ActionEvent event) {
        Stage stage = (Stage) this.btnSalida.getScene().getWindow();
        stage.close();
    }
}
