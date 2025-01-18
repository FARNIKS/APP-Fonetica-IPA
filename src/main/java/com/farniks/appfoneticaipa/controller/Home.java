package com.farniks.appfoneticaipa.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.MediaPlayer;

import javax.print.attribute.standard.Media;

public class Home {
    @FXML
    Button btnMode,btnGithub,
            btnVocales,btnDiptongos,btnConsonantesConVoz,btnConsonantesSinVoz;

    private final ChangePage changePage = new ChangePage();

    public Home() {
    }

    public void eventButtonsPageChange(ActionEvent actionEvent) {
        Button sourceButton = (Button) actionEvent.getSource();
        if (sourceButton == btnVocales) {
            changePage.loadStage("vocales.fxml", actionEvent, "Vocales");
        }else if (sourceButton == btnDiptongos) {
            changePage.loadStage("diptongos.fxml", actionEvent, "Diptongos");
        }else if (sourceButton == btnConsonantesConVoz) {
            changePage.loadStage("consonantes-voz.fxml", actionEvent, "Consonantes-Con-Voz");
        }else if (sourceButton == btnConsonantesSinVoz) {
            changePage.loadStage("consonantes-sin-voz.fxml", actionEvent, "Consonantes-Sin-Voz");
        }
    }
}
