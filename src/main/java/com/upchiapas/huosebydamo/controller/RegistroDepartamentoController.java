package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.controller.models.Almacenamiento;
import com.upchiapas.huosebydamo.controller.models.Departamento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RegistroDepartamentoController {

    @FXML
    private Button btnRegistroDeDepartamento;

    @FXML
    private PasswordField idBañosDepartamento;

    @FXML
    private TextField idCapacidadMaximaDepartamento;

    @FXML
    private PasswordField idClimaDepartamento;

    @FXML
    private TextField idDimencionesDepartamento;

    @FXML
    private TextField idInternetDepartamento;

    @FXML
    private PasswordField idNotaExtraDepartamento;

    @FXML
    private PasswordField idNumeroDeContactoDepartamento;

    @FXML
    private PasswordField idSemiAmuebladoDepartamento;

    @FXML
    private TextField idUbicacionDepartamento;

    @FXML
    void btnRegistroDepartamentoOnMouseClicked(MouseEvent event) {
        double dimensiones = Double.valueOf(idDimencionesDepartamento.getText());
        String baños = idBañosDepartamento.getText();
        String internet = idInternetDepartamento.getText();
        String semiamublado = idSemiAmuebladoDepartamento.getText();
        byte limiteDePersonas = Byte.valueOf(idClimaDepartamento.getText());
        String clima = idClimaDepartamento.getText();
        String ubicacion = idUbicacionDepartamento.getText();
        String notaExtra = idNotaExtraDepartamento.getText();
        String numeroCotacto = idNumeroDeContactoDepartamento.getText();
        Departamento departamento = new Departamento(dimensiones,baños,internet,semiamublado,limiteDePersonas,clima,ubicacion,notaExtra,numeroCotacto);
        Almacenamiento.departamentos.add(departamento);
    }

    @FXML
    void ingresarHome(ActionEvent event) {

    }

}
