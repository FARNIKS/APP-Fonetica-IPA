package com.farniks.appfoneticaipa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class InformationExampleIpaController {
    @FXML
    Button btnHome, btnMenu, btnMode, btnGithub,
            btnMoreInformation,
            btnSentenceSound,
            btnExampleSound1, btnExampleSound2, btnExampleSound3, btnExampleSound4, btnExampleSound5, btnExampleSound6,
            btnPrevious, btnNext;
    @FXML
    Label lbSentence, lbExample1, lbExample2, lbExample3, lbExample4, lbExample5, lbExample6, lbSymbol;

    private final ChangePage changePage = new ChangePage();

    public InformationExampleIpaController() {
    }

    public void eventMenu(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        if (sourceButton == btnHome) {
            changePage.loadStage("home.fxml", mouseEvent, "Vocales");
        }else if (sourceButton == btnMode) {
            System.out.println("Mode");
        }else if (sourceButton == btnGithub){
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/FARNIKS/APP-Fonetica-IPA"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    public void eventScroll(MouseEvent mouseEvent) {
    }

    public void eventSoundsExamplesSentences(MouseEvent mouseEvent) {
    }

    public void eventButtonInformation(MouseEvent mouseEvent) {
    }

}
