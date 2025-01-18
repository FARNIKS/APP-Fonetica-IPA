package com.farniks.appfoneticaipa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Vocales {
    @FXML
    Button btnHome, btnMode, btnGithub,
            btnSoundVocal1, btnSoundVocal2, btnSoundVocal3, btnSoundVocal4, btnSoundVocal5, btnSoundVocal6,btnSoundVocal7,btnSoundVocal8,btnSoundVocal9,btnSoundVocal10,btnSoundVocal11,btnSoundVocal12,
            btnMoreInformation1,btnMoreInformation2,btnMoreInformation3,btnMoreInformation4,btnMoreInformation5,btnMoreInformation6,btnMoreInformation7,btnMoreInformation8,btnMoreInformation9,btnMoreInformation10,btnMoreInformation11,btnMoreInformation12;

    private final ChangePage changePage = new ChangePage();

    private MediaPlayer mediaPlayer;

    public Vocales() {

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
    public void eventButtonsVocalSounds(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        String musicFile = "/media/Vocal12.mp3";

        if (sourceButton == btnSoundVocal1) {
            musicFile = "/media/Vocal1.mp3";
        }else if (sourceButton == btnSoundVocal2) {
            musicFile = "/media/Vocal2.mp3";
        }else if (sourceButton == btnSoundVocal3) {
            musicFile = "/media/Vocal3.mp3";
        }else if (sourceButton == btnSoundVocal4) {
            musicFile = "/media/Vocal4.mp3";
        }else if (sourceButton == btnSoundVocal5) {
            musicFile = "/media/Vocal5.mp3";
        }else if (sourceButton == btnSoundVocal6) {
            musicFile = "/media/Vocal6.mp3";
        }else if (sourceButton == btnSoundVocal7) {
            musicFile = "/media/Vocal7.mp3";
        }else if (sourceButton == btnSoundVocal8) {
            musicFile = "/media/Vocal8.mp3";
        }else if (sourceButton == btnSoundVocal9) {
            musicFile = "/media/Vocal9.mp3";
        }else if (sourceButton == btnSoundVocal10) {
            musicFile = "/media/Vocal10.mp3";
        }else if (sourceButton == btnSoundVocal11) {
            musicFile = "/media/Vocal11.mp3";
        }else if (sourceButton == btnSoundVocal12) {
            musicFile = "/media/Vocal12.mp3";
        }

        URL resource = getClass().getResource(musicFile);
        if (resource != null) {
            Media sound = new Media(((URL) resource).toString());
            mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.setVolume(0.1);
            // Play the music when you start the driver instance
            mediaPlayer.play();
        } else {
            System.err.println("No se pudo encontrar el archivo de música.");
        }


    }

    public void eventButtonsMoreInformation(MouseEvent mouseEvent) {
    }
}
