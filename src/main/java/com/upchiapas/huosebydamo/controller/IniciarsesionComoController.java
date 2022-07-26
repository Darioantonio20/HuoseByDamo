package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.main;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

public class IniciarsesionComoController {

    @FXML
    private Button btnIniciarSesionArrendador;

    @FXML
    private Button btnIniciarSesionArrendatario;

    @FXML
    void btnIniciarSesionArrendadorOnMouseClicked(MouseEvent event) {

        main.setFXML("inicio-sesion-arrendador-view","homeByDamo - Inicio Sesión Arrendador ");

    }

    @FXML
    void btnIniciarSesionArrendatarioOnMouseClicked(MouseEvent event) {

        main.setFXML("inicio-sesion-arrendatario-view","homeByDamo - Inicio Sesión Arrendatario ");

    }
}
