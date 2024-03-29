package com.upchiapas.huosebydamo.controller;


import com.upchiapas.huosebydamo.models.Almacenamiento;
import com.upchiapas.huosebydamo.main;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;

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
    private TextField textFieldFiltroUbicacionCasa;

    @FXML
    void btnMostrarCasaOnClickedMouse(MouseEvent event) {
        String fulltext = "";
        String valorar = textFieldFiltroUbicacionCasa.getText();
        if(valorar!= ""){
            for (int i=0; i<Almacenamiento.casas.size();i++){
                if (valorar.equals(Almacenamiento.casas.get(i).getUbicacion())){
                    fulltext += Almacenamiento.casas.get(i).toString();
                }
            }
            textArea.setText(fulltext);
                }else{
                    for (int i = 0; i < Almacenamiento.casas.size(); i++) {
                        fulltext += Almacenamiento.casas.get(i).toString();
        }
            textArea.setText(fulltext);
        }
    }

    @FXML
    void btnSalidaOnMouseClicked(MouseEvent event) {

        main.setFXML("arrendatario-view","House By DAMO - Arrendatario View ");

    }
}

