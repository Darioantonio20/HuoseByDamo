package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.controller.models.ValidateUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class InicioSesionController {
    @FXML
    private Button btnEntrada;

    @FXML
    private PasswordField pass;

    @FXML
    private TextField userName;

    @FXML
    void btnEntradaOnMouseClicked(MouseEvent event) {
        /*ValidateUser user = new ValidateUser();
        if (user.autenticarUser(userName.getText(), pass.getText())){

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Inicio sesión - CORRECTO ");
            alert.setContentText("Bienvenido a House By DAMO");
            alert.showAndWait();

        }else{

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Inicio sesión - ERROR");
            alert.setContentText("Él usuario no está registrado ó no existe");
            alert.showAndWait();

        }*/
    }

    @FXML
    void ingresarHome(ActionEvent event) throws IOException {

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/upchiapas/huosebydamo/home-page-view.fxml"));

        primaryStage.setTitle("Inmoviliaria DAMO");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
