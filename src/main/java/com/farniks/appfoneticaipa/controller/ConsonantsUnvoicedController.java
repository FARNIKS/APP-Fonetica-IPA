package com.farniks.appfoneticaipa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ConsonantsUnvoicedController {
    @FXML
    Button btnHome,btnMode,btnGithub,
            btnConsonantSin1, btnConsonantSin2, btnConsonantSin3, btnConsonantSin4,btnConsonantSin5,btnConsonantSin6, btnConsonantSin7, btnConsonantSin8,
            btnMoreInformation1, btnMoreInformation2, btnMoreInformation3, btnMoreInformation4, btnMoreInformation5, btnMoreInformation6,btnMoreInformation7,btnMoreInformation8;

    private final ChangePage changePage = new ChangePage();

    private MediaPlayer mediaPlayer;

    private SoundsPhonetics soundsPhonetics;

    public ConsonantsUnvoicedController() {
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

    public void eventButtonConsonantsSinSounds(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        String musicFile = "/media/Vocal12.mp3";

        if (sourceButton == btnConsonantSin1) {
            musicFile = "/media/Unvoiced1.mp3";
        }else if (sourceButton == btnConsonantSin2) {
            musicFile = "/media/Unvoiced2.mp3";
        }else if (sourceButton == btnConsonantSin3) {
            musicFile = "/media/Unvoiced3.mp3";
        }else if (sourceButton == btnConsonantSin4) {
            musicFile = "/media/Unvoiced4.mp3";
        }else if (sourceButton == btnConsonantSin5) {
            musicFile = "/media/Unvoiced5.mp3";
        }else if (sourceButton == btnConsonantSin6) {
            musicFile = "/media/Unvoiced6.mp3";
        }else if (sourceButton == btnConsonantSin7) {
            musicFile = "/media/Unvoiced7.mp3";
        }else if (sourceButton == btnConsonantSin8) {
            musicFile = "/media/Unvoiced8.mp3";
        }

        soundsPhonetics = new SoundsPhonetics(musicFile);
    }

    public void eventButtonsMoreInformation(MouseEvent mouseEvent) {

    }
}
