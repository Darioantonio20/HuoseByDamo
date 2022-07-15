package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {
    @FXML
    private Button btnRegistrarCasa;

    @FXML
    private Button btnRegistrarDepartamento;

    @FXML
    private Button btnRegistroVisualizacionUsuario;

    @FXML
    private Button btnVisualizarCasa;

    @FXML
    private Button btnVisualizarDepartamento;

    @FXML
    private Pane idCasa;

    @FXML
    private Button idCerrarSesion;

    @FXML
    private Pane idDepartamento;


    @FXML
    void btnVisualizarCasaOnMouseClicked(MouseEvent event) {

        main.setFXML("casa-view","homeByDamo - Visualización De Casas ");
    }

    @FXML
    void btnVisualizarDepartamentoOnMouseClicked(MouseEvent event) {

        main.setFXML("departamento-view","homeByDamo - Visualización De Departamento ");
    }

    @FXML
    void btnRegistrarCasaOnMouseClicked(MouseEvent event) {

        main.setFXML("registrar-casa-view","homeByDamo - Registro Casa");
    }

    @FXML
    void btnRegistrarDepartamentoOnMouseClicked(MouseEvent event) {

        main.setFXML("registrar-departamento-view","homeByDamo - Registro Departamento");
    }

    @FXML
    void idCerrarSesionOnMouseClicked(MouseEvent event) {

        main.setFXML("home-view","homeByDamo - Home View ");
    }

    @FXML
    void btnRegistroVisualizacionUsuarioOnMouseClicked(MouseEvent event) {

        main.setFXML("cuenta-usuario-view","homeByDamo - Cuenta De Usuario ");
    }
}

