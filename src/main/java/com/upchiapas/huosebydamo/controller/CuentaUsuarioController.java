package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.models.Almacenamiento;
import com.upchiapas.huosebydamo.main;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

public class CuentaUsuarioController {

    @FXML
    private Button btnMostrar;

    @FXML
    private Button btnReturnHome;

    @FXML
    private TextArea textAreaMiCuenta;

    @FXML
    private TextArea textAreaRegistroInmueble;

    @FXML
    void btnMostrarOnMouseClicked(MouseEvent event) {
        String fulltext ="";
        String fulltext2= "";
        for (int i = 0; i< Almacenamiento.datausers.size(); i++){
            if (InicioSesionController.useringresado.equals(Almacenamiento.datausers.get(i).getNombreUsuario())){
                textAreaMiCuenta.setText(Almacenamiento.datausers.get(i).toString());
                 if (InicioSesionController.useringresado.equals(Almacenamiento.casas.get(i).getUsuarioPropietario())){
                     fulltext2 += Almacenamiento.casas.get(i).toString();
                     if(InicioSesionController.useringresado.equals(Almacenamiento.departamentos.get(i).getUsuarioPropietario())){
                         fulltext2 += Almacenamiento.departamentos.get(i).toString();
                     }
                 }
            }
        }
        textAreaRegistroInmueble.setText(fulltext2);
    }

    @FXML
    void returnHome(MouseEvent event) {
        main.setFXML("home-page-view","House By DAMO - Home Page ");
    }

}
