package com.farniks.appfoneticaipa.controller;

import javafx.application.Platform;
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
    Button btnHome, btnMenu, btnGithub, btnExit,
            btnSentenceSound,
            btnExampleSound1, btnExampleSound2, btnExampleSound3, btnExampleSound4, btnExampleSound5, btnExampleSound6,
            btnSymbolSound;
    @FXML
    private Label lbSentence, lbExample1, lbExample2, lbExample3, lbExample4, lbExample5, lbExample6, lbSymbol;

    private final ChangePage changePage = new ChangePage();

    protected SoundsPhonetics soundsPhonetics;

    private String audioSymbol, audioSentence, audioExample1, audioExample2, audioExample3, audioExample4, audioExample5, audioExample6, urlPage;

    public InformationExampleIpaController() {
        this.soundsPhonetics = new SoundsPhonetics(); // Inicializa la instancia
    }

    public void eventMenu(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        if (sourceButton == btnHome) {
            changePage.loadStage("home.fxml", mouseEvent, "Vocales");
        }else if (sourceButton == btnExit) {
            Platform.exit();
        }else if (sourceButton == btnMenu) {
            changePage.loadStage(urlPage, mouseEvent, "Vocales");
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
        Button sourceButton = (Button) mouseEvent.getSource();
        String musicFile = "";

        if (sourceButton == btnSymbolSound) {
            musicFile = audioSymbol;
            soundsPhonetics = new SoundsPhonetics(musicFile);
        }else {
            if (sourceButton == btnSentenceSound) {
                musicFile = audioSentence;
            } else if (sourceButton == btnExampleSound1) {
                musicFile = audioExample1;
            } else if (sourceButton == btnExampleSound2) {
                musicFile = audioExample2;
            } else if (sourceButton == btnExampleSound3) {
                musicFile = audioExample3;
            } else if (sourceButton == btnExampleSound4) {
                musicFile = audioExample4;
            } else if (sourceButton == btnExampleSound5) {
                musicFile = audioExample5;
            } else if (sourceButton == btnExampleSound6) {
                musicFile = audioExample6;
            }

            if (!musicFile.isEmpty()) {
                soundsPhonetics.soundsExamples(musicFile);
            }
        }
    }

    public void eventButtonInformation(MouseEvent mouseEvent) {
    }

    public void setAudioFiles(String symbolAudio, String sentenceAudio, String example1Audio,
                              String example2Audio, String example3Audio, String example4Audio,
                              String example5Audio, String example6Audio, String urlPage) {
        this.audioSymbol = symbolAudio;
        this.audioSentence = sentenceAudio;
        this.audioExample1 = example1Audio;
        this.audioExample2 = example2Audio;
        this.audioExample3 = example3Audio;
        this.audioExample4 = example4Audio;
        this.audioExample5 = example5Audio;
        this.audioExample6 = example6Audio;
        this.urlPage = urlPage;
    }

    public void setInformation(
            String sentence, String example1, String example2, String example3,
            String example4, String example5, String example6, String symbol) {

        if (lbSentence != null) {
            lbSentence.setText(sentence);
        }
        if (lbExample1 != null) {
            lbExample1.setText(example1);
        }
        if (lbExample2 != null) {
            lbExample2.setText(example2);
        }
        if (lbExample3 != null) {
            lbExample3.setText(example3);
        }
        if (lbExample4 != null) {
            lbExample4.setText(example4);
        }
        if (lbExample5 != null) {
            lbExample5.setText(example5);
        }
        if (lbExample6 != null) {
            lbExample6.setText(example6);
        }
        if (lbSymbol != null) {
            lbSymbol.setText(symbol);
        }
    }

}