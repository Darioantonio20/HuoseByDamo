package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.main;
import com.upchiapas.huosebydamo.models.Almacenamiento;
import com.upchiapas.huosebydamo.models.Departamento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RegistroDepartamentoController {
    @FXML
    private Button btnRegistroDeDepartamento;

    @FXML
    private Button btnSalidaRegistroDepartamento;

    @FXML
    private TextField idBañosDepartamento;

    @FXML
    private TextField idCapacidadMaximaDepartamento;

    @FXML
    private TextField idClimaDepartamento;

    @FXML
    private TextField idDimencionesDepartamento;

    @FXML
    private TextField idInternetDepartamento;

    @FXML
    private TextField idNotaExtraDepartamento;

    @FXML
    private TextField idNumeroDeContactoDepartamento;

    @FXML
    private TextField idSemiAmuebladoDepartamento;

    @FXML
    private TextField idUbicacionDepartamento;


    @FXML
    void btnRegistroDepartamentoOnMouseClicked(MouseEvent event) {
        double dimensiones = Double.valueOf(idDimencionesDepartamento.getText());
        String baños = idBañosDepartamento.getText();
        String internet = idInternetDepartamento.getText();
        String semiamublado = idSemiAmuebladoDepartamento.getText();
        byte limiteDePersonas = Byte.valueOf(idCapacidadMaximaDepartamento.getText());
        String clima = idClimaDepartamento.getText();
        String ubicacion = idUbicacionDepartamento.getText();
        String notaExtra = idNotaExtraDepartamento.getText();
        String numeroCotacto = idNumeroDeContactoDepartamento.getText();
        Departamento departamento = new Departamento(dimensiones,baños,internet,semiamublado,limiteDePersonas,clima,ubicacion,notaExtra,numeroCotacto);
        Almacenamiento.departamentos.add(departamento);
        main.setFXML("home-page-view","homeByDamo - menu principal");
        for (int i=0; i<Almacenamiento.departamentos.size();i++){
            System.out.println(Almacenamiento.departamentos.get(i).toString());
        }

    }

    @FXML
    void btnSalidaRegistroDepartamentoOnMouseClicked(MouseEvent event) {
        main.setFXML("home-page-view","homeByDamo - Home Page");
    }


}
