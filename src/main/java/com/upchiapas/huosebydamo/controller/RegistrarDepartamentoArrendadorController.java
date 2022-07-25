package com.upchiapas.huosebydamo.controller;


import com.upchiapas.huosebydamo.models.Almacenamiento;
import com.upchiapas.huosebydamo.models.Departamento;
import com.upchiapas.huosebydamo.main;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

public class RegistrarDepartamentoArrendadorController {

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
        String usuarioPropietario = InicioSesionController.useringresado;
        Departamento departamento = new Departamento(dimensiones,baños,internet,semiamublado,limiteDePersonas,clima,ubicacion,notaExtra,numeroCotacto,usuarioPropietario);
        Almacenamiento.departamentos.add(departamento);
        main.setFXML("arrendador-view","homeByDamo - Arrendador View");
        for (int i=0; i<Almacenamiento.departamentos.size();i++){
            System.out.println(Almacenamiento.departamentos.get(i).toString());
        }
    }

    @FXML
    void btnSalidaRegistroDepartamentoArrendadorOnMouseClicked(MouseEvent event) {

        main.setFXML("arrendador-view","homeByDamo - Vista Arrendador");

    }
}
