package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.models.Almacenamiento;
import com.upchiapas.huosebydamo.main;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
public class CuentaUsuarioArrendatarioController {

    @FXML
    private Button btnMostrarArrendatario;

    @FXML
    private Button btnReturnHomeArrendatario;

    @FXML
    private TextArea textAreaMiCuentaArrendatario;

    @FXML
    void btnMostrarArrendatarioOnMouseClicked(MouseEvent event) {
        String fulltext ="";
        String fulltext2= "";
        for (int i = 0; i< Almacenamiento.datausers.size(); i++){
            if (InicioSesionArrendatarioController.useringresado.equals(Almacenamiento.datausers.get(i).getNombreUsuario())){
                textAreaMiCuentaArrendatario.setText(Almacenamiento.datausers.get(i).toString());
                if (InicioSesionArrendatarioController.useringresado.equals(Almacenamiento.casas.get(i).getUsuarioPropietario())){
                    fulltext2 += Almacenamiento.casas.get(i).toString();
                    if(InicioSesionArrendatarioController.useringresado.equals(Almacenamiento.departamentos.get(i).getUsuarioPropietario())){
                        fulltext2 += Almacenamiento.departamentos.get(i).toString();
                    }
                }
            }
        }
    }

    @FXML
    void returnHomeArrendatarioOnMouseClicked(MouseEvent event) {

        main.setFXML("arrendatario-view","homeByDamo - Arrendatario View ");

    }

}
