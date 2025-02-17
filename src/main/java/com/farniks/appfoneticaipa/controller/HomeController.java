
package com.farniks.appfoneticaipa.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HomeController {
    @FXML
    Button btnExit,btnGithub,
            btnVocales,btnDiptongos,btnConsonantesConVoz,btnConsonantesSinVoz;

    private final ChangePage changePage = new ChangePage();

    public HomeController() {
    }

    public void eventMenu(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        if (sourceButton == btnExit) {
            Platform.exit();
        }else if (sourceButton == btnGithub){
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/FARNIKS/APP-Fonetica-IPA"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    public void eventButtonsPageChange(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        if (sourceButton == btnVocales) {
            changePage.loadStage("vowels-monophthongs.fxml", mouseEvent, "Vocales");
        }else if (sourceButton == btnDiptongos) {
            changePage.loadStage("vowels-diphthongs.fxml", mouseEvent, "Diptongos");
        }else if (sourceButton == btnConsonantesConVoz) {
            changePage.loadStage("consonants-voiced.fxml", mouseEvent, "Consonantes-Con-Voz");
        }else if (sourceButton == btnConsonantesSinVoz) {
            changePage.loadStage("consonants-unvoiced.fxml", mouseEvent, "Consonantes-Sin-Voz");
        }
    }
}
