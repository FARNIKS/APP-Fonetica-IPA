module com.farniks.appfoneticaipa {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.desktop;


    opens com.farniks.appfoneticaipa to javafx.fxml;
    exports com.farniks.appfoneticaipa;
    exports com.farniks.appfoneticaipa.controller;
    opens com.farniks.appfoneticaipa.controller to javafx.fxml;
}