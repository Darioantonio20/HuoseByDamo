package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.models.Almacenamiento;
import com.upchiapas.huosebydamo.main;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

public class CuentaUsuarioArrendadorController {


    @FXML
    private Button btnMostrarArrendador;

    @FXML
    private Button btnReturnHomeArrendador;

    @FXML
    private TextArea textAreaMiCuentaArrendador;

    @FXML
    private TextArea textAreaRegistroInmuebleArrendador;

    @FXML
    void btnMostrarArrendadorOnMouseClicked(MouseEvent event) {

        String fulltext ="";
        String fulltext2= "";
        for (int i = 0; i< Almacenamiento.datausers.size(); i++){
            if (InicioSesionArrendadorController.useringresado.equals(Almacenamiento.datausers.get(i).getNombreUsuario())){
                textAreaMiCuentaArrendador.setText(Almacenamiento.datausers.get(i).toString());
                if (InicioSesionArrendadorController.useringresado.equals(Almacenamiento.casas.get(i).getUsuarioPropietario())){
                    fulltext2 += Almacenamiento.casas.get(i).toString();
                    if(InicioSesionArrendadorController.useringresado.equals(Almacenamiento.departamentos.get(i).getUsuarioPropietario())){
                        fulltext2 += Almacenamiento.departamentos.get(i).toString();
                    }
                }
            }
        }
        textAreaRegistroInmuebleArrendador.setText(fulltext2);
    }

    @FXML
    void returnHomeArrendadorOnMouseClicked(MouseEvent event) {

        main.setFXML("arrendador-view","homeByDamo - Arrendador View ");

    }
}
