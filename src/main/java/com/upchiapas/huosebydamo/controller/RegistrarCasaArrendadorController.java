package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.models.Almacenamiento;
import com.upchiapas.huosebydamo.models.Casa;
import com.upchiapas.huosebydamo.main;
import com.upchiapas.huosebydamo.models.ValidateUser;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

public class RegistrarCasaArrendadorController {

    ValidateUser val = new ValidateUser();

    @FXML
    private Button btnRegistroDeCasaArrendador;

    @FXML
    private Button btnSalidaRegistroCasaArrendador;

    @FXML
    private TextField idAreaDeLavadoCasaArrendador;

    @FXML
    private TextField idCantidadDeBañosCasaArrendador;

    @FXML
    private TextField idCocheraCasaArrendador;

    @FXML
    private TextField idDimencionesCasaArrendadoir;

    @FXML
    private TextField idNotaExtraCasaArrendador;

    @FXML
    private TextField idNumeroDeContactoCasaArrendador;

    @FXML
    private TextField idNumeroDeCuartosCasaArrendador;

    @FXML
    private TextField idNumeroDePisosCasaArrendador;

    @FXML
    private TextField idUbicacionCasaArrendador;

    @FXML
    void btnRegistroCasaArrendadorOnMouseClicked(MouseEvent event) {

        double dimensiones = Double.valueOf(idDimencionesCasaArrendadoir.getText());
        byte pisos = Byte.valueOf(idNumeroDePisosCasaArrendador.getText());
        byte cuartos = Byte.valueOf(idNumeroDeCuartosCasaArrendador.getText());
        byte baños = Byte.valueOf(idCantidadDeBañosCasaArrendador.getText());
        String arealavado = idAreaDeLavadoCasaArrendador.getText();
        String cochera =idCocheraCasaArrendador.getText();
        String ubicacion = idUbicacionCasaArrendador.getText();
        String notaExtra = idNotaExtraCasaArrendador.getText();
        String numeroContacto = idNumeroDeContactoCasaArrendador.getText();
        String usuarioPropietario = InicioSesionArrendadorController.useringresado;
        if (val.datosVacios(arealavado,cochera,ubicacion,notaExtra,numeroContacto)==true){
            Casa casa = new Casa(dimensiones,pisos,cuartos,baños,arealavado,cochera,ubicacion,notaExtra,numeroContacto,usuarioPropietario);
            Almacenamiento.casas.add(casa);
            main.setFXML("arrendador-view","homeByDamo - menu principal");

        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("rellene todos los campos");
            alert.showAndWait();
        }
    }

    @FXML
    void btnSalidaRegistroCasaArrendadorOnMouseClicked(MouseEvent event) {

        main.setFXML("arrendador-view","homeByDamo - Vista Arrendador");

    }
}
