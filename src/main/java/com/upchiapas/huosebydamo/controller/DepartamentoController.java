package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.main;
import com.upchiapas.huosebydamo.models.Almacenamiento;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;

public class DepartamentoController {

    @FXML
    private Button btnMostrarCasa;

    @FXML
    private Button btnOfertarDepartamento;

    @FXML
    private Button btnsalida;

    @FXML
    private Pane pane;

    @FXML
    private TextField textfieldFiltroUbicacion;

    @FXML
    private TextField textfieldRegistroIdDepartamento;

    @FXML
    private TextArea txtAreaDepartamentos;

    @FXML
    void btnMostrarDepartamentoOnClickedMouse(MouseEvent event) {

        String fulltext = "";
        String valorar = textfieldFiltroUbicacion.getText();

        if(valorar!= ""){
            for (int i=0; i<Almacenamiento.departamentos.size();i++){
                if (valorar.equals(Almacenamiento.departamentos.get(i).getUbicacion())){
                    fulltext += Almacenamiento.departamentos.get(i).toString();
                }
            } txtAreaDepartamentos.setText(fulltext);
        }else{
            for (int i = 0; i < Almacenamiento.departamentos.size(); i++) {
                fulltext += Almacenamiento.departamentos.get(i).toString();
            }
            txtAreaDepartamentos.setText(fulltext);
        }
    }


    @FXML
    void btnOfertarDepartamentoOnMouseClicked(MouseEvent event) {

    }
    @FXML
    void btnsalidaOnMouseClicked(MouseEvent event) {

        main.setFXML("home-page-view","House By DAMO - Home Page ");

    }
}