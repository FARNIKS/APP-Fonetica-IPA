package com.farniks.appfoneticaipa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ConsonantesConVoz {
    @FXML
    Button btnHome,btnMode,btnGithub;

    @FXML
    Button btnConsonant1, btnConsonant2, btnConsonant3, btnConsonant4, btnConsonant5,
            btnConsonant6, btnConsonant7, btnConsonant8, btnConsonant9, btnConsonant10,
            btnConsonant11, btnConsonant12, btnConsonant13, btnConsonant14, btnConsonant15;

    @FXML
    Button btnMoreInformation1, btnMoreInformation2, btnMoreInformation3, btnMoreInformation4, btnMoreInformation5,
            btnMoreInformation6,btnMoreInformation7,btnMoreInformation8,btnMoreInformation9,btnMoreInformation10,
            btnMoreInformation11,btnMoreInformation12,btnMoreInformation13,btnMoreInformation14,btnMoreInformation15;


    private final ChangePage changePage = new ChangePage();

    public ConsonantesConVoz() {
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

    public void eventButtonConsonantsSounds(MouseEvent mouseEvent) {
    }

    public void eventButtonsMoreInformationConsonants(MouseEvent mouseEvent) {
    }
}
