module com.upchiapas.huosebydamo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.upchiapas.huosebydamo to javafx.fxml;
    exports com.upchiapas.huosebydamo;
    exports com.upchiapas.huosebydamo.controller;
    opens com.upchiapas.huosebydamo.controller to javafx.fxml;
}