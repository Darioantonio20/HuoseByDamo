package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.main;
import com.upchiapas.huosebydamo.models.ValidateUser;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class InicioSesionArrendatarioController {

    public static String useringresado;

    @FXML
    private Button btnEntradaArrendatario;

    @FXML
    private Button btnSalidaInicioSesionArrendatario;

    @FXML
    private PasswordField passArrendatario;

    @FXML
    private TextField userNameArrendatario;

    @FXML
    void btnEntradaArrendatarioOnMouseClicked(MouseEvent event) {
        ValidateUser user = new ValidateUser();
        if (user.autenticarUser(userNameArrendatario.getText(), passArrendatario.getText())){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Inicio sesión - CORRECTO ");
            alert.setContentText("Bienvenido a House By DAMO");
            alert.showAndWait();
            useringresado = userNameArrendatario.getText();
            main.setFXML("arrendatario-view","homeByDamo - menu principal");

        }else{

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Inicio sesión - ERROR");
            alert.setContentText("revise su usuario y contraseña");
            alert.showAndWait();

        }



    }

    @FXML
    void btnSalidaInicioSesionArrendatarioOnMouseClicked(MouseEvent event) {

        main.setFXML("home-view","homeByDamo - Home View");

    }
}
