package com.farniks.appfoneticaipa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class VowelsDiphthongsController {
    @FXML
    Button btnHome,btnMode,btnGithub,
            btnDiphthong1, btnDiphthong2, btnDiphthong3, btnDiphthong4,btnDiphthong5, btnDiphthong6, btnDiphthong7, btnDiphthong8,
            btnMoreInformation1, btnMoreInformation2, btnMoreInformation3, btnMoreInformation4,btnMoreInformation5, btnMoreInformation6,btnMoreInformation7,btnMoreInformation8;

    private final ChangePage changePage = new ChangePage();

    private MediaPlayer mediaPlayer;

    private SoundsPhonetics soundsPhonetics;

    public VowelsDiphthongsController() {

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


    public void eventButtonsDiphthongsSounds(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        String musicFile = "/media/Vocal12.mp3";

        if (sourceButton == btnDiphthong1) {
            musicFile = "/media/Diptongo1.mp3";
        }else if (sourceButton == btnDiphthong2) {
            musicFile = "/media/Diptongo2.mp3";
        }else if (sourceButton == btnDiphthong3) {
            musicFile = "/media/Diptongo3.mp3";
        }else if (sourceButton == btnDiphthong4) {
            musicFile = "/media/Diptongo4.mp3";
        }else if (sourceButton == btnDiphthong5) {
            musicFile = "/media/Diptongo5.mp3";
        }else if (sourceButton == btnDiphthong6) {
            musicFile = "/media/Diptongo6.mp3";
        }else if (sourceButton == btnDiphthong7) {
            musicFile = "/media/Diptongo7.mp3";
        }else if (sourceButton == btnDiphthong8) {
            musicFile = "/media/Diptongo8.mp3";
        }

        soundsPhonetics = new SoundsPhonetics(musicFile);

    }

    public void eventButtonsMoreInformation(ContextMenuEvent contextMenuEvent) {
    }
}
