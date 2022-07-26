package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.models.ValidateUser;
import javafx.scene.control.PasswordField;
import com.upchiapas.huosebydamo.main;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXML;


public class InicioSesionController {
   public static String useringresado;
    @FXML
    private Button btnEntrada;

    @FXML
    private Button btnSalidaInicioSesion;

    @FXML
    private PasswordField pass;

    @FXML
    private TextField userName;
    @FXML
    void btnEntradaOnMouseClicked(MouseEvent event) {
        ValidateUser user = new ValidateUser();
        if (user.autenticarUser(userName.getText(), pass.getText())){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Inicio sesión - CORRECTO ");
            alert.setContentText("Bienvenido a House By DAMO");
            alert.showAndWait();
            useringresado = userName.getText();
            main.setFXML("home-page-view","homeByDamo - Home Page View");

        }else{

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Inicio sesión - ERROR");
            alert.setContentText("revise su usuario y contraseña");
            alert.showAndWait();

        }
    }
    @FXML
    void btnSalidaInicioSesionOnMouseClicked(MouseEvent event) {

        main.setFXML("home-view","homeByDamo - Home View ");

    }
}
