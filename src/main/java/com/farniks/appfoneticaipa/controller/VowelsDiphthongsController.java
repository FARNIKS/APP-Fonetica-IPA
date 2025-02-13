package com.farniks.appfoneticaipa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;


import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class VowelsDiphthongsController {
    @FXML
    private Button btnHome,btnMode,btnGithub,
            btnDiphthong1, btnDiphthong2, btnDiphthong3, btnDiphthong4,btnDiphthong5, btnDiphthong6, btnDiphthong7, btnDiphthong8,
            btnMoreInformation1, btnMoreInformation2, btnMoreInformation3, btnMoreInformation4,btnMoreInformation5, btnMoreInformation6,btnMoreInformation7,btnMoreInformation8;

    private final ChangePage changePage = new ChangePage();

    private MediaPlayer mediaPlayer;

    private OpenInformation openInformation;

    public VowelsDiphthongsController() {
        InformationExampleIpaController informationExampleIpaController = new InformationExampleIpaController();
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
            musicFile = "/media/Diphthongs/Diptongo1.mp3";
        }else if (sourceButton == btnDiphthong2) {
            musicFile = "/media/Diphthongs/Diptongo2.mp3";
        }else if (sourceButton == btnDiphthong3) {
            musicFile = "/media/Diphthongs/Diptongo3.mp3";
        }else if (sourceButton == btnDiphthong4) {
            musicFile = "/media/Diphthongs/Diptongo4.mp3";
        }else if (sourceButton == btnDiphthong5) {
            musicFile = "/media/Diphthongs/Diptongo5.mp3";
        }else if (sourceButton == btnDiphthong6) {
            musicFile = "/media/Diphthongs/Diptongo6.mp3";
        }else if (sourceButton == btnDiphthong7) {
            musicFile = "/media/Diphthongs/Diptongo7.mp3";
        }else if (sourceButton == btnDiphthong8) {
            musicFile = "/media/Diphthongs/Diptongo8.mp3";
        }

        SoundsPhonetics soundsPhonetics = new SoundsPhonetics(musicFile);

    }

    public void eventButtonsMoreInformation(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        // Variables por defecto
        String symbol = "eɪ";
        String soundSymbol = "/media/Diphthongs/Diptongo1.mp3";
        String sentence = "They play in the rain every day";
        String soundSentence = "/media/Diphthongs/eɪ/They play in the rain every day.mp3";
        String example1 = "day - /deɪ/";
        String soundExample1 = "/media/Diphthongs/eɪ/day.mp3";
        String example2 = "say - /seɪ/";
        String soundExample2 = "/media/Diphthongs/eɪ/say.mp3";
        String example3 = "way - /weɪ/";
        String soundExample3 = "/media/Diphthongs/eɪ/way.mp3";
        String example4 = "face - /feɪs/";
        String soundExample4 = "/media/Diphthongs/eɪ/face.mp3";
        String example5 = "rain - /reɪn/";
        String soundExample5 = "/media/Diphthongs/eɪ/rain.mp3";
        String example6 = "eight - /eɪt/";
        String soundExample6 = "/media/Diphthongs/eɪ/eight.mp3";
        String selectedUrlPage = "vowels-diphthongs.fxml";

        if (sourceButton == btnMoreInformation1) {
            symbol = "eɪ";
            soundSymbol = "/media/Diphthongs/Diptongo1.mp3";
            sentence = "They play in the rain every day";
            soundSentence = "/media/Diphthongs/eɪ/They play in the rain every day.mp3";
            example1 = "Day - /deɪ/";
            soundExample1 = "/media/Diphthongs/eɪ/day.mp3";
            example2 = "Say - /seɪ/";
            soundExample2 = "/media/Diphthongs/eɪ/say.mp3";
            example3 = "Way - /weɪ/";
            soundExample3 = "/media/Diphthongs/eɪ/way.mp3";
            example4 = "Face - /feɪs/";
            soundExample4 = "/media/Diphthongs/eɪ/face.mp3";
            example5 = "Rain - /reɪn/";
            soundExample5 = "/media/Diphthongs/eɪ/rain.mp3";
            example6 = "Eight - /eɪt/";
            soundExample6 = "/media/Diphthongs/eɪ/eight.mp3";


        }else if (sourceButton == btnMoreInformation2) {
            symbol = "eɪ";
            soundSymbol = "/media/Diphthongs/Diptongo1.mp3";
            sentence = "They play in the rain every day";
            soundSentence = "/media/Diphthongs/eɪ/They play in the rain every day.mp3";
            example1 = "Day - /deɪ/";
            soundExample1 = "/media/Diphthongs/eɪ/day.mp3";
            example2 = "Say - /seɪ/";
            soundExample2 = "/media/Diphthongs/eɪ/say.mp3";
            example3 = "Way - /weɪ/";
            soundExample3 = "/media/Diphthongs/eɪ/way.mp3";
            example4 = "Face - /feɪs/";
            soundExample4 = "/media/Diphthongs/eɪ/face.mp3";
            example5 = "Rain - /reɪn/";
            soundExample5 = "/media/Diphthongs/eɪ/rain.mp3";
            example6 = "Eight - /eɪt/";
            soundExample6 = "/media/Diphthongs/eɪ/eight.mp3";


        }else if (sourceButton == btnMoreInformation3) {
            symbol = "eɪ";
            soundSymbol = "/media/Diphthongs/Diptongo1.mp3";
            sentence = "They play in the rain every day";
            soundSentence = "/media/Diphthongs/eɪ/They play in the rain every day.mp3";
            example1 = "Day - /deɪ/";
            soundExample1 = "/media/Diphthongs/eɪ/day.mp3";
            example2 = "Say - /seɪ/";
            soundExample2 = "/media/Diphthongs/eɪ/say.mp3";
            example3 = "Way - /weɪ/";
            soundExample3 = "/media/Diphthongs/eɪ/way.mp3";
            example4 = "Face - /feɪs/";
            soundExample4 = "/media/Diphthongs/eɪ/face.mp3";
            example5 = "Rain - /reɪn/";
            soundExample5 = "/media/Diphthongs/eɪ/rain.mp3";
            example6 = "Eight - /eɪt/";
            soundExample6 = "/media/Diphthongs/eɪ/eight.mp3";


        }else if (sourceButton == btnMoreInformation4) {
            symbol = "eɪ";
            soundSymbol = "/media/Diphthongs/Diptongo1.mp3";
            sentence = "They play in the rain every day";
            soundSentence = "/media/Diphthongs/eɪ/They play in the rain every day.mp3";
            example1 = "Day - /deɪ/";
            soundExample1 = "/media/Diphthongs/eɪ/day.mp3";
            example2 = "Say - /seɪ/";
            soundExample2 = "/media/Diphthongs/eɪ/say.mp3";
            example3 = "Way - /weɪ/";
            soundExample3 = "/media/Diphthongs/eɪ/way.mp3";
            example4 = "Face - /feɪs/";
            soundExample4 = "/media/Diphthongs/eɪ/face.mp3";
            example5 = "Rain - /reɪn/";
            soundExample5 = "/media/Diphthongs/eɪ/rain.mp3";
            example6 = "Eight - /eɪt/";
            soundExample6 = "/media/Diphthongs/eɪ/eight.mp3";


        }else if (sourceButton == btnMoreInformation5) {
            symbol = "eɪ";
            soundSymbol = "/media/Diphthongs/Diptongo1.mp3";
            sentence = "They play in the rain every day";
            soundSentence = "/media/Diphthongs/eɪ/They play in the rain every day.mp3";
            example1 = "Day - /deɪ/";
            soundExample1 = "/media/Diphthongs/eɪ/day.mp3";
            example2 = "Say - /seɪ/";
            soundExample2 = "/media/Diphthongs/eɪ/say.mp3";
            example3 = "Way - /weɪ/";
            soundExample3 = "/media/Diphthongs/eɪ/way.mp3";
            example4 = "Face - /feɪs/";
            soundExample4 = "/media/Diphthongs/eɪ/face.mp3";
            example5 = "Rain - /reɪn/";
            soundExample5 = "/media/Diphthongs/eɪ/rain.mp3";
            example6 = "Eight - /eɪt/";
            soundExample6 = "/media/Diphthongs/eɪ/eight.mp3";


        }else if (sourceButton == btnMoreInformation6) {
            symbol = "eɪ";
            soundSymbol = "/media/Diphthongs/Diptongo1.mp3";
            sentence = "They play in the rain every day";
            soundSentence = "/media/Diphthongs/eɪ/They play in the rain every day.mp3";
            example1 = "Day - /deɪ/";
            soundExample1 = "/media/Diphthongs/eɪ/day.mp3";
            example2 = "Say - /seɪ/";
            soundExample2 = "/media/Diphthongs/eɪ/say.mp3";
            example3 = "Way - /weɪ/";
            soundExample3 = "/media/Diphthongs/eɪ/way.mp3";
            example4 = "Face - /feɪs/";
            soundExample4 = "/media/Diphthongs/eɪ/face.mp3";
            example5 = "Rain - /reɪn/";
            soundExample5 = "/media/Diphthongs/eɪ/rain.mp3";
            example6 = "Eight - /eɪt/";
            soundExample6 = "/media/Diphthongs/eɪ/eight.mp3";


        }else if (sourceButton == btnMoreInformation7) {
            symbol = "eɪ";
            soundSymbol = "/media/Diphthongs/Diptongo1.mp3";
            sentence = "They play in the rain every day";
            soundSentence = "/media/Diphthongs/eɪ/They play in the rain every day.mp3";
            example1 = "Day - /deɪ/";
            soundExample1 = "/media/Diphthongs/eɪ/day.mp3";
            example2 = "Say - /seɪ/";
            soundExample2 = "/media/Diphthongs/eɪ/say.mp3";
            example3 = "Way - /weɪ/";
            soundExample3 = "/media/Diphthongs/eɪ/way.mp3";
            example4 = "Face - /feɪs/";
            soundExample4 = "/media/Diphthongs/eɪ/face.mp3";
            example5 = "Rain - /reɪn/";
            soundExample5 = "/media/Diphthongs/eɪ/rain.mp3";
            example6 = "Eight - /eɪt/";
            soundExample6 = "/media/Diphthongs/eɪ/eight.mp3";


        }else if (sourceButton == btnMoreInformation8) {
            symbol = "eɪ";
            soundSymbol = "/media/Diphthongs/Diptongo1.mp3";
            sentence = "They play in the rain every day";
            soundSentence = "/media/Diphthongs/eɪ/They play in the rain every day.mp3";
            example1 = "Day - /deɪ/";
            soundExample1 = "/media/Diphthongs/eɪ/day.mp3";
            example2 = "Say - /seɪ/";
            soundExample2 = "/media/Diphthongs/eɪ/say.mp3";
            example3 = "Way - /weɪ/";
            soundExample3 = "/media/Diphthongs/eɪ/way.mp3";
            example4 = "Face - /feɪs/";
            soundExample4 = "/media/Diphthongs/eɪ/face.mp3";
            example5 = "Rain - /reɪn/";
            soundExample5 = "/media/Diphthongs/eɪ/rain.mp3";
            example6 = "Eight - /eɪt/";
            soundExample6 = "/media/Diphthongs/eɪ/eight.mp3";

        }

        OpenInformation openInformation = new OpenInformation(sentence, example1, example2, example3, example4, example5, example6, symbol,
                soundSymbol, soundSentence, soundExample1, soundExample2, soundExample3, soundExample4, soundExample5, soundExample6,selectedUrlPage , mouseEvent);

    }
}

