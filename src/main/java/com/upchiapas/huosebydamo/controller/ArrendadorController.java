package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.main;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;

public class ArrendadorController {
//merlini
    @FXML
    private Button btnRegistrarCasaArrendador;

    @FXML
    private Button btnRegistrarDepartamentoArrendador;

    @FXML
    private Button btnRegistroVisualizacionUsuarioArrendador;

    @FXML
    private Pane idCasa;

    @FXML
    private Button idCerrarSesionArrendador;

    @FXML
    void btnRegistrarCasaArrendadorOnMouseClicked(MouseEvent event) {

        main.setFXML("registrar-casa-arrendador-view","homeByDamo - Registro Casa");

    }

    @FXML
    void btnRegistrarDepartamentoArrendadorOnMouseClicked(MouseEvent event) {

        main.setFXML("registrar-departamento-arrendador-view","homeByDamo - Registro Departamento");

    }

    @FXML
    void btnRegistroVisualizacionUsuarioArrendadorOnMouseClicked(MouseEvent event) {

        main.setFXML("cuenta-usuario-arrendador-view","homeByDamo - Cuenta De Usuario Arrendador ");

    }

    @FXML
    void idCerrarSesionArrendadorOnMouseClicked(MouseEvent event) {

        main.setFXML("home-view","homeByDamo - Home View ");

    }
}
