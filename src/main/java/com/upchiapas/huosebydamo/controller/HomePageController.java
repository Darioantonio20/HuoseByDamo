package com.upchiapas.huosebydamo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePageController {

    @FXML
    private Button btnRegistrarCasa;

    @FXML
    private Button btnRegistrarDepartamento;

    @FXML
    private Button btnVisualizarCasa;

    @FXML
    private Button btnVisualizarDepartamento;

    @FXML
    private Pane idCasa;

    @FXML
    private Pane idDepartamento;

    @FXML
    void registrarCasa(ActionEvent event) throws IOException {

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/upchiapas/huosebydamo/registrar-casa-view.fxml"));

        primaryStage.setTitle("Inmoviliaria DAMO");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    void registrarDepartamento(ActionEvent event) throws IOException {

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/upchiapas/huosebydamo/registrar-departamento-view.fxml"));

        primaryStage.setTitle("Inmoviliaria DAMO");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    void visualizacionCasa(ActionEvent event) throws IOException {

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/upchiapas/huosebydamo/casa-view.fxml"));

        primaryStage.setTitle("Inmoviliaria DAMO");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    void visualizacionDepartamentos(ActionEvent event) throws IOException {

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/upchiapas/huosebydamo/departamento-view.fxml"));

        primaryStage.setTitle("Inmoviliaria DAMO");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

}




  /*  @FXML
    void infoCasa(ActionEvent event) throws IOException {

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource(""));

        primaryStage.setTitle("Inmoviliaria DAMO");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }

    @FXML
    void infoDepartamentos(ActionEvent event) throws IOException {

        Stage primaryStage= new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/com/upchiapas/huosebydamo/casa-view.fxml"));

        primaryStage.setTitle("Inmoviliaria DAMO");

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
*/