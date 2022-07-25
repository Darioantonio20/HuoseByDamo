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

public class RegistroArrendadorController {

    @FXML
    private Button btnAltaUserArrendador;

    @FXML
    private Button btnSalidaRegistroArrendador;

    @FXML
    private TextField idApellidosArrendador;

    @FXML
    private PasswordField idContraseñaArrendador;

    @FXML
    private TextField idCorreoElectronicoArrendador;

    @FXML
    private TextField idNombreDeUsuarioArrendador;

    @FXML
    private TextField idNombresArrendador;

    @FXML
    private TextField idNumeroDeContactoArrendador;

    @FXML
    void btnDarDeAltaArrendadorOnMouseClicked(MouseEvent event) {

        String nombre = idNombresArrendador.getText();
        String apellidos = idApellidosArrendador.getText();
        String correoElectronico = idCorreoElectronicoArrendador.getText();
        String numeroTelefono = idNumeroDeContactoArrendador.getText();
        String nombreUsuario = idNombreDeUsuarioArrendador.getText();
        String contraseña = idContraseñaArrendador.getText();
        if (ValidateUser.ValidacionDatosUser(nombre,apellidos,correoElectronico,numeroTelefono,nombreUsuario,contraseña) ==true){
            Usuario user = new Usuario(nombre,apellidos,correoElectronico,numeroTelefono,nombreUsuario,contraseña);
            Almacenamiento.datausers.add(user);
            InicioSesionController.useringresado =nombreUsuario;
            main.setFXML("arrendador-view","homeByDamo - Arrendador View");
        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("verifique sus datos");
            alert.showAndWait();
        }
    }

    @FXML
    void btnSalidaRegistroArrendadorOnMouseClicked(MouseEvent event) {

        main.setFXML("home-view","homeByDamo - Arrendador View");

    }
}
