package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.models.Almacenamiento;
import com.upchiapas.huosebydamo.models.ValidateUser;
import com.upchiapas.huosebydamo.models.Usuario;
import javafx.scene.control.PasswordField;
import com.upchiapas.huosebydamo.main;
import javafx.scene.control.TextField;
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


public class RegistroController {
    @FXML
    private Button btnAltaUser;

    @FXML
    private Button btnSalidaRegistro;

    @FXML
    private TextField idApellidos;

    @FXML
    private PasswordField idContraseña;

    @FXML
    private TextField idCorreoElectronico;

    @FXML
    private TextField idNombreDeUsuario;

    @FXML
    private TextField idNombres;

    @FXML
    private TextField idNumeroDeContacto;

    @FXML
    void btnDarDeAltaOnMouseClicked(MouseEvent event) {
        String nombre = idNombres.getText();
        String apellidos = idApellidos.getText();
        String correoElectronico = idCorreoElectronico.getText();
        String numeroTelefono = idNumeroDeContacto.getText();
        String nombreUsuario = idNombreDeUsuario.getText();
        String contraseña = idContraseña.getText();
        if (ValidateUser.ValidacionDatosUser(nombre,apellidos,correoElectronico,numeroTelefono,nombreUsuario,contraseña) ==true){
            Usuario user = new Usuario(nombre,apellidos,correoElectronico,numeroTelefono,nombreUsuario,contraseña);
            Almacenamiento.datausers.add(user);
            InicioSesionController.useringresado =nombreUsuario;
            main.setFXML("home-view","homeByDamo - menu principal");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Registro exitoso    ¡¡¡Inicia sesión ahora!!!");
            alert.showAndWait();
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("verifique sus datos");
            alert.showAndWait();
        }
    }

    @FXML
    void btnSalidaRegistroOnMouseClicked(MouseEvent event) {

        main.setFXML("home-view","homeByDamo - Home View");

    }
}
