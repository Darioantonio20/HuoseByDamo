package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.main;
import com.upchiapas.huosebydamo.models.ValidateUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeViewController {

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnRegistrate;

    @FXML
    void sesionIniciar(ActionEvent event) throws IOException {


       main.setFXML("sesion-view","homeByDamo -iniciar sesion");

    }

    @FXML
    void registroAhora(ActionEvent event) throws IOException {
        main.setFXML("registro-view","homeByDamo - registro usuario");

    }


}





