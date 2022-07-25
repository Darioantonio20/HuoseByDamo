package com.upchiapas.huosebydamo.controller;


import com.upchiapas.huosebydamo.models.Almacenamiento;
import com.upchiapas.huosebydamo.models.Departamento;
import com.upchiapas.huosebydamo.main;
import com.upchiapas.huosebydamo.models.ValidacionDatos;
import com.upchiapas.huosebydamo.models.ValidateUser;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

public class RegistrarDepartamentoArrendadorController {
    ValidateUser val = new ValidateUser();

    @FXML
    private Button btnRegistroDeDepartamentoArrendador;

    @FXML
    private Button btnSalidaRegistroDepartamentoArrendador;

    @FXML
    private TextField idBañosDepartamentoArrendador;

    @FXML
    private TextField idCapacidadMaximaDepartamentoArrendador;

    @FXML
    private TextField idClimaDepartamentoArrendador;

    @FXML
    private TextField idDimencionesDepartamentoArrendador;

    @FXML
    private TextField idInternetDepartamentoArrendador;

    @FXML
    private TextField idNotaExtraDepartamentoArrendador;

    @FXML
    private TextField idNumeroDeContactoDepartamentoArrendador;

    @FXML
    private TextField idSemiAmuebladoDepartamentoArrendador;

    @FXML
    private TextField idUbicacionDepartamentoArrendador;

    @FXML
    void btnRegistroDepartamentoArrendadorOnMouseClicked(MouseEvent event) {

        double dimensiones = Double.valueOf(idDimencionesDepartamentoArrendador.getText());
        String baños = idBañosDepartamentoArrendador.getText();
        String internet = idInternetDepartamentoArrendador.getText();
        String semiamublado = idSemiAmuebladoDepartamentoArrendador.getText();
        byte limiteDePersonas = Byte.valueOf(idCapacidadMaximaDepartamentoArrendador.getText());
        String clima = idClimaDepartamentoArrendador.getText();
        String ubicacion = idUbicacionDepartamentoArrendador.getText();
        String notaExtra = idNotaExtraDepartamentoArrendador.getText();
        String numeroCotacto = idNumeroDeContactoDepartamentoArrendador.getText();
        String usuarioPropietario = InicioSesionArrendadorController.useringresado;
        if (val.datosVacios(baños,internet,semiamublado,clima,ubicacion,notaExtra,numeroCotacto)==true){
            Departamento departamento = new Departamento(dimensiones,baños,internet,semiamublado,limiteDePersonas,clima,ubicacion,notaExtra,numeroCotacto,usuarioPropietario);
            Almacenamiento.departamentos.add(departamento);
            main.setFXML("arrendador-view","homeByDamo - Arrendador View");

        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("rellene todos los campos");
            alert.showAndWait();
        }

    }

    @FXML
    void btnSalidaRegistroDepartamentoArrendadorOnMouseClicked(MouseEvent event) {

        main.setFXML("arrendador-view","homeByDamo - Vista Arrendador");

    }
}
