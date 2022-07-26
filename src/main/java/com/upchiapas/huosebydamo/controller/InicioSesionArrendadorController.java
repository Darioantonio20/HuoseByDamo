package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.models.ValidateUser;
import javafx.scene.control.PasswordField;
import com.upchiapas.huosebydamo.main;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.fxml.FXML;

public class InicioSesionArrendadorController {

    public static String useringresado;

    @FXML
    private Button btnEntrada;

    @FXML
    private Button btnSalidaInicioSesionArrendador;

    @FXML
    private PasswordField passArrendador;

    @FXML
    private TextField userNameArrendador;

    @FXML
    void btnEntradaArrendadorOnMouseClicked(MouseEvent event) {

        ValidateUser user = new ValidateUser();
        if (user.autenticarUser(userNameArrendador.getText(), passArrendador.getText())){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Inicio sesión - CORRECTO ");
            alert.setContentText("Bienvenido a House By DAMO");
            alert.showAndWait();
            useringresado = userNameArrendador.getText();
            main.setFXML("arrendador-view","homeByDamo - Arrendador View ");

        }else{

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Inicio sesión - ERROR");
            alert.setContentText("revise su usuario y contraseña");
            alert.showAndWait();

        }
    }

    @FXML
    void btnSalidaInicioSesionArrendadorOnMouseClicked(MouseEvent event) {

        main.setFXML("home-view","homeByDamo - Home View ");

    }
}
