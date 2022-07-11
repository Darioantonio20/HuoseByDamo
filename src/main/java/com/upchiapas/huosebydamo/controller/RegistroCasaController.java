package com.upchiapas.huosebydamo.controller;

import com.upchiapas.huosebydamo.controller.models.Almacenamiento;
import com.upchiapas.huosebydamo.controller.models.Casa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class RegistroCasaController {

    @FXML
    private Button btnRegistroDeCasa;

    @FXML
    private TextField idAreaDeLavadoCasa;

    @FXML
    private PasswordField idCantidadDeBañosCasa;

    @FXML
    private PasswordField idCocheraCasa;

    @FXML
    private TextField idDimencionesCasa;

    @FXML
    private PasswordField idNotaExtraCasa;

    @FXML
    private PasswordField idNumeroDeContactoCasa;

    @FXML
    private TextField idNumeroDeCuartosCasa;

    @FXML
    private PasswordField idNumeroDePisosCasa;

    @FXML
    private TextField idUbicacionCasa;

    @FXML
    void btnRegistroCasaOnMouseClicked(MouseEvent event) {
        double dimensiones = Double.valueOf(idDimencionesCasa.getText());
        byte pisos = Byte.valueOf(idNumeroDePisosCasa.getText());
        byte cuartos = Byte.valueOf(idNumeroDeCuartosCasa.getText());
        byte baños = Byte.valueOf(idCantidadDeBañosCasa.getText());
        String arealavado = idAreaDeLavadoCasa.getText();
        String cochera =idCocheraCasa.getText();
        String ubicacion = idCocheraCasa.getText();
        String notaExtra = idNotaExtraCasa.getText();
        String numeroContacto = idNumeroDeContactoCasa.getText();
        Casa casa = new Casa(dimensiones,pisos,cuartos,baños,arealavado,cochera,ubicacion,notaExtra,numeroContacto);
        Almacenamiento.casas.add(casa);
        /*for (int i=0; i<Almacenamiento.casas.size();i++){
            System.out.println(Almacenamiento.casas.get(i).toString());
        }*/
    }

    @FXML
    void ingresarHome(ActionEvent event) {

    }

}
