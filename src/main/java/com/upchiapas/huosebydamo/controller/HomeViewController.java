package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.main;
import com.upchiapas.huosebydamo.models.Almacenamiento;
import com.upchiapas.huosebydamo.models.Usuario;
import com.upchiapas.huosebydamo.models.ValidateUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
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

        //Almacenamiento.datausers.add(new Usuario("José Ángel","Merlin Ortega","gege@gmail.com","9515271070","angelxmxx","1234"));
        //Almacenamiento.datausers.add(new Usuario("Darío Antonio","Gutiérrez Álvarez","antoniodario10@hotmail.com","9514795475","gtzdario","4321"));

    }

    @FXML
    void registroAhora(ActionEvent event) throws IOException {

        main.setFXML("registro-view","homeByDamo - registro usuario");

    }
}





