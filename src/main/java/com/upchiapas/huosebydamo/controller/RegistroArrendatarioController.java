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
import javafx.fxml.FXML;

public class RegistroArrendatarioController {
    @FXML
    private Button btnAltaUserArrendatario;

    @FXML
    private Button btnSalidaRegistroArrendatario;

    @FXML
    private TextField idApellidosArrendatario;

    @FXML
    private PasswordField idContraseñaArrendatario;

    @FXML
    private TextField idCorreoElectronicoArrendatario;

    @FXML
    private TextField idNombreDeUsuarioArrendatario;

    @FXML
    private TextField idNombresArrendatario;

    @FXML
    private TextField idNumeroDeContactoArrendatario;

    @FXML
    void btnDarDeAltaArrendatarioOnMouseClicked(MouseEvent event) {

        String nombre = idNombresArrendatario.getText();
        String apellidos = idApellidosArrendatario.getText();
        String correoElectronico = idCorreoElectronicoArrendatario.getText();
        String numeroTelefono = idNumeroDeContactoArrendatario.getText();
        String nombreUsuario = idNombreDeUsuarioArrendatario.getText();
        String contraseña = idContraseñaArrendatario.getText();
        if (ValidateUser.ValidacionDatosUser(nombre,apellidos,correoElectronico,numeroTelefono,nombreUsuario,contraseña) ==true){
            Usuario user = new Usuario(nombre,apellidos,correoElectronico,numeroTelefono,nombreUsuario,contraseña);
            Almacenamiento.datausers.add(user);
            InicioSesionController.useringresado =nombreUsuario;
            main.setFXML("arrendatario-view","homeByDamo - Arrendador View");
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("verifique sus datos");
            alert.showAndWait();
        }
    }

    @FXML
    void btnSalidaRegistroArrendatarioOnMouseClicked(MouseEvent event) {

        main.setFXML("home-view","homeByDamo - Arrendador View");

    }
}
