package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.models.Almacenamiento;
import com.upchiapas.huosebydamo.models.ValidateUser;
import com.upchiapas.huosebydamo.models.Usuario;
import com.upchiapas.huosebydamo.main;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import java.io.IOException;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;

public class HomeViewController {

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnRegistrate;

    @FXML
    void sesionIniciar(ActionEvent event) throws IOException {

       main.setFXML("iniciar-sesion-como-view","homeByDamo - Iniciar Sesión ");

        Almacenamiento.datausers.add(new Usuario("José Ángel","Merlin Ortega","gege@gmail.com","9515271070","angelxmxx","1234"));
        Almacenamiento.datausers.add(new Usuario("Darío Antonio","Gutiérrez Álvarez","antoniodario10@hotmail.com","9514795475","gtzdario","4321"));

    }

    @FXML
    void registroAhora(ActionEvent event) throws IOException {

        main.setFXML("registro-view","homeByDamo - Registro View ");

    }
}





