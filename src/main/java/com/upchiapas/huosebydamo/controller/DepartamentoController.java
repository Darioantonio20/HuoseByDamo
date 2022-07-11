package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.controller.models.Almacenamiento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class DepartamentoController {

    @FXML
    private Button btnMostrarCasa;

    @FXML
    private Button btnsalida;

    @FXML
    private Pane pane;

    @FXML
    private TextArea txtAreaDepartamentos;

    @FXML
    void btnMostrarDepartamentoOnClickedMouse(MouseEvent event) {
        String fulltext = "";
        for (int i = 0; i< Almacenamiento.departamentos.size(); i++){
            //txtAreaDepartamentos.setText(Almacenamiento.departamentos.get(i).toString());
            fulltext += Almacenamiento.departamentos.get(i).toString();
            System.out.println(Almacenamiento.departamentos.get(i).toString());
        }
        txtAreaDepartamentos.setText(fulltext);

    }
    @FXML
    void closePage(ActionEvent event) {
        Stage stage = (Stage) this.btnsalida.getScene().getWindow();
        stage.close();
    }

}
