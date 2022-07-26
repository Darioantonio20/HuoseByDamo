package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.main;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.fxml.FXML;

public class ArrendatarioController {

    @FXML
    private Button btnRegistroVisualizacionUsuarioArrendatario;

    @FXML
    private Button btnVisualizarCasaArrendatario;

    @FXML
    private Button btnVisualizarDepartamentoArrendatario;

    @FXML
    private Button idCerrarSesionArrendatario;

    @FXML
    private Pane idDepartamento;

    @FXML
    void btnRegistroVisualizacionUsuarioOnMouseClicked(MouseEvent event) {

        main.setFXML("cuenta-usuario-arrendatario-view","homeByDamo - Cuenta Usuario Arrendatario");

    }

    @FXML
    void btnVisualizarCasaArrendatarioOnMouseClicked(MouseEvent event) {

        main.setFXML("casa-view","homeByDamo - Casa View ");

    }

    @FXML
    void btnVisualizarDepartamentoArrendatarioOnMouseClicked(MouseEvent event) {

        main.setFXML("departamento-view","homeByDamo - Departamento View ");

    }

    @FXML
    void idCerrarSesionArrendatarioOnMouseClicked(MouseEvent event) {

        main.setFXML("home-view","homeByDamo - Home View ");

    }
}
