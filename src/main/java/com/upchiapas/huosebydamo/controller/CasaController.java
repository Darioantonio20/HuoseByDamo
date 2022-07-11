package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.controller.models.Almacenamiento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CasaController {

    @FXML
    private Button btnMostrarCasa;

    @FXML
    private Button btnSalida;

    @FXML
    private Pane pane;

    @FXML
    private TextArea textArea;

    @FXML
    void btnMostrarCasaOnClickedMouse(MouseEvent event) {
        String fulltext = "";
        for (int i = 0; i< Almacenamiento.casas.size(); i++){
            //txtAreaDepartamentos.setText(Almacenamiento.departamentos.get(i).toString());
            fulltext += Almacenamiento.casas.get(i).toString();
            System.out.println(Almacenamiento.casas.get(i).toString());
        }
        textArea.setText(fulltext);

    }


    @FXML
    void closePage(ActionEvent event) {
        Stage stage = (Stage) this.btnSalida.getScene().getWindow();
        stage.close();
    }
}
