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
    private Button btnVisualizarCasa;

    @FXML
    private Button btnVisualizarDepartamento;

    @FXML
    private Pane idCasa;

    @FXML
    private Pane idDepartamento;

    @FXML
    void registrarCasa(ActionEvent event) throws IOException {
        main.setFXML("registrar-casa-view","homeByDamo - registro casa");

    }

    @FXML
    void registrarDepartamento(ActionEvent event) throws IOException {
        main.setFXML("registrar-departamento-view","homeByDamo - registro departamento");


    }

    @FXML
    void visualizacionCasa(ActionEvent event) throws IOException {
        main.setFXML("casa-view","homeByDamo - visualización de casas ");


    }

    @FXML
    void visualizacionDepartamentos(ActionEvent event) throws IOException {
        main.setFXML("departamento-view","homeByDamo - visualización de casas ");


    }

    @FXML
    void btnVisualizarCasaOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void btnVisualizarDepartamentoOnMouseClicked(MouseEvent event) {

    }


}

