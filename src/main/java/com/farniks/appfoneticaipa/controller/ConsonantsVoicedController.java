package com.farniks.appfoneticaipa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ConsonantsVoicedController {
    @FXML
    private Button btnHome,btnMode,btnGithub,
            btnConsonant1, btnConsonant2, btnConsonant3, btnConsonant4, btnConsonant5, btnConsonant6, btnConsonant7, btnConsonant8, btnConsonant9, btnConsonant10, btnConsonant11, btnConsonant12, btnConsonant13, btnConsonant14, btnConsonant15,btnConsonant16,
            btnMoreInformation1, btnMoreInformation2, btnMoreInformation3, btnMoreInformation4, btnMoreInformation5, btnMoreInformation6,btnMoreInformation7,btnMoreInformation8,btnMoreInformation9,btnMoreInformation10, btnMoreInformation11,btnMoreInformation12,btnMoreInformation13,btnMoreInformation14,btnMoreInformation15,btnMoreInformation16;

    private final ChangePage changePage = new ChangePage();

    private MediaPlayer mediaPlayer;

    private SoundsPhonetics soundsPhonetics;

    public ConsonantsVoicedController() {
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
        Button sourceButton = (Button) mouseEvent.getSource();
        String musicFile = "/media/Voiced/Voiced16.mp3";

        if (sourceButton == btnConsonant1) {
            musicFile = "/media/Voiced/Voiced1.mp3";
        }else if (sourceButton == btnConsonant2) {
            musicFile = "/media/Voiced/Voiced2.mp3";
        }else if (sourceButton == btnConsonant3) {
            musicFile = "/media/Voiced/Voiced3.mp3";
        }else if (sourceButton == btnConsonant4) {
            musicFile = "/media/Voiced/Voiced4.mp3";
        }else if (sourceButton == btnConsonant5) {
            musicFile = "/media/Voiced/Voiced5.mp3";
        }else if (sourceButton == btnConsonant6) {
            musicFile = "/media/Voiced/Voiced6.mp3";
        }else if (sourceButton == btnConsonant7) {
            musicFile = "/media/Voiced/Voiced7.mp3";
        }else if (sourceButton == btnConsonant8) {
            musicFile = "/media/Voiced/Voiced8.mp3";
        }else if (sourceButton == btnConsonant9) {
            musicFile = "/media/Voiced/Voiced9.mp3";
        }else if (sourceButton == btnConsonant10) {
            musicFile = "/media/Voiced/Voiced10.mp3";
        }else if (sourceButton == btnConsonant11) {
            musicFile = "/media/Voiced/Voiced11.mp3";
        }else if (sourceButton == btnConsonant12) {
            musicFile = "/media/Voiced/Voiced12.mp3";
        }else if (sourceButton == btnConsonant13) {
            musicFile = "/media/Voiced/Voiced13.mp3";
        }else if (sourceButton == btnConsonant14) {
            musicFile = "/media/Voiced/Voiced14.mp3";
        }else if (sourceButton == btnConsonant15) {
            musicFile = "/media/Voiced/Voiced15.mp3";
        }else if (sourceButton == btnConsonant16) {
            musicFile = "/media/Voiced/Voiced16.mp3";
        }

        soundsPhonetics = new SoundsPhonetics(musicFile);
    }

    public void eventButtonsMoreInformationConsonants(MouseEvent mouseEvent) {
    }
}
