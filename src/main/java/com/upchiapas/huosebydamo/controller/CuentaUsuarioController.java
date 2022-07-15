package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class CuentaUsuarioController {

    @FXML
    private Button btnReturnHome;

    @FXML
    private TextArea textAreaMiCuenta;

    @FXML
    private TextArea textAreaRegistroInmueble;

    @FXML
    void returnHome(MouseEvent event) {
        main.setFXML("home-page-view","House By DAMO - Home Page ");
    }

}
