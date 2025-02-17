package com.farniks.appfoneticaipa.controller;

import javafx.application.Platform;
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
    private Button btnHome, btnExit,btnGithub,
            btnDiphthong1, btnDiphthong2, btnDiphthong3, btnDiphthong4,btnDiphthong5, btnDiphthong6, btnDiphthong7, btnDiphthong8,
            btnMoreInformation1, btnMoreInformation2, btnMoreInformation3, btnMoreInformation4,btnMoreInformation5, btnMoreInformation6,btnMoreInformation7,btnMoreInformation8;

    private final ChangePage changePage = new ChangePage();

    protected SoundsPhonetics soundsPhonetics;

    private OpenInformation openInformation;

    public VowelsDiphthongsController() {
        InformationExampleIpaController informationExampleIpaController = new InformationExampleIpaController();
    }

    public void eventMenu(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        if (sourceButton == btnHome) {
            changePage.loadStage("home.fxml", mouseEvent, "Vocales");
        }else if (sourceButton == btnExit) {
            Platform.exit();
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
        String musicFile = "/media/Diptongo8.mp3";

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

        soundsPhonetics = new SoundsPhonetics(musicFile);

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
            symbol = "ɔɪ";
            soundSymbol = "/media/Diphthongs/Diptongo2.mp3";
            sentence = "The boy enjoys his toy";
            soundSentence = "/media/Diphthongs/ɔɪ/The boy enjoys his toy.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Diphthongs/ɔɪ/boy.mp3";
            example2 = "Toy - /tɔɪ/";
            soundExample2 = "/media/Diphthongs/ɔɪ/toy.mp3";
            example3 = "Joy - /dʒɔɪ/";
            soundExample3 = "/media/Diphthongs/ɔɪ/joy.mp3";
            example4 = "Coin - /kɔɪn/";
            soundExample4 = "/media/Diphthongs/ɔɪ/coin.mp3";
            example5 = "Oil - /ɔɪl/";
            soundExample5 = "/media/Diphthongs/ɔɪ/oil.mp3";
            example6 = "Voice - /vɔɪs/";
            soundExample6 = "/media/Diphthongs/ɔɪ/voice.mp3";


        }else if (sourceButton == btnMoreInformation3) {
            symbol = "aɪ";
            soundSymbol = "/media/Diphthongs/Diptongo3.mp3";
            sentence = "I like to ride my bike at night";
            soundSentence = "/media/Diphthongs/aɪ/I like to ride my bike at night.mp3";
            example1 = "I - /aɪ/";
            soundExample1 = "/media/Diphthongs/aɪ/I.mp3";
            example2 = "Like - /laɪk/";
            soundExample2 = "/media/Diphthongs/aɪ/like.mp3";
            example3 = "Bike - /baɪk/";
            soundExample3 = "/media/Diphthongs/aɪ/bike.mp3";
            example4 = "Time - /taɪm/";
            soundExample4 = "/media/Diphthongs/aɪ/time.mp3";
            example5 = "White - /waɪt/";
            soundExample5 = "/media/Diphthongs/aɪ/white.mp3";
            example6 = "Night - /naɪt/";
            soundExample6 = "/media/Diphthongs/aɪ/night.mp3";


        }else if (sourceButton == btnMoreInformation4) {
            symbol = "eə";
            soundSymbol = "/media/Diphthongs/Diptongo4.mp3";
            sentence = "The air is fair in the square";
            soundSentence = "/media/Diphthongs/eə/The air is fair in the square.mp3";
            example1 = "Air - /eə/";
            soundExample1 = "/media/Diphthongs/eə/air.mp3";
            example2 = "Hair - /heə/";
            soundExample2 = "/media/Diphthongs/eə/hair.mp3";
            example3 = "Chair - /tʃeə/";
            soundExample3 = "/media/Diphthongs/eə/chair.mp3";
            example4 = "Fair - /feə/";
            soundExample4 = "/media/Diphthongs/eə/fair.mp3";
            example5 = "Square - /skweə/";
            soundExample5 = "/media/Diphthongs/eə/square.mp3";
            example6 = "Care - /keə/";
            soundExample6 = "/media/Diphthongs/eə/care.mp3";


        }else if (sourceButton == btnMoreInformation5) {
            symbol = "ɪə";
            soundSymbol = "/media/Diphthongs/Diptongo5.mp3";
            sentence = "They stay outside every evening";
            soundSentence = "/media/Diphthongs/ɪə/They stay outside every evening.mp3";
            example1 = "Here - /hɪə/";
            soundExample1 = "/media/Diphthongs/ɪə/here.mp3";
            example2 = "Idea - /aɪˈdɪə/";
            soundExample2 = "/media/Diphthongs/ɪə/idea.mp3";
            example3 = "Career - /kəˈrɪə/";
            soundExample3 = "/media/Diphthongs/ɪə/career.mp3";
            example4 = "Ear - /ɪə/";
            soundExample4 = "/media/Diphthongs/ɪə/ear.mp3";
            example5 = "Clear - /klɪə/";
            soundExample5 = "/media/Diphthongs/ɪə/clear.mp3";
            example6 = "Dear - /dɪə/";
            soundExample6 = "/media/Diphthongs/ɪə/dear.mp3";


        }else if (sourceButton == btnMoreInformation6) {
            symbol = "ʊə";
            soundSymbol = "/media/Diphthongs/Diptongo6.mp3";
            sentence = "The tour was really fun";
            soundSentence = "/media/Diphthongs/ʊə/The tour was really fun.mp3";
            example1 = "Sure - /ʃʊə/";
            soundExample1 = "/media/Diphthongs/ʊə/sure.mp3";
            example2 = "Tour - /tʊə/";
            soundExample2 = "/media/Diphthongs/ʊə/tour.mp3";
            example3 = "Cure - /kjʊə/";
            soundExample3 = "/media/Diphthongs/ʊə/cure.mp3";
            example4 = "Pure - /pjʊə/";
            soundExample4 = "/media/Diphthongs/ʊə/pure.mp3";
            example5 = "Secure - /sɪˈkjʊə/";
            soundExample5 = "/media/Diphthongs/ʊə/secure.mp3";
            example6 = "Endure - /ɪnˈdjʊə/";
            soundExample6 = "/media/Diphthongs/ʊə/endure.mp3";


        }else if (sourceButton == btnMoreInformation7) {
            symbol = "əʊ";
            soundSymbol = "/media/Diphthongs/Diptongo7.mp3";
            sentence = "Go home before the snow falls";
            soundSentence = "/media/Diphthongs/əʊ/Go home before the snow falls.mp3";
            example1 = "Go - /ɡəʊ/";
            soundExample1 = "/media/Diphthongs/əʊ/go.mp3";
            example2 = "Home - /həʊm/";
            soundExample2 = "/media/Diphthongs/əʊ/home.mp3";
            example3 = "No - /nəʊ/";
            soundExample3 = "/media/Diphthongs/əʊ/no.mp3";
            example4 = "Phone - /fəʊn/";
            soundExample4 = "/media/Diphthongs/əʊ/phone.mp3";
            example5 = "Show - /ʃəʊ/";
            soundExample5 = "/media/Diphthongs/əʊ/show.mp3";
            example6 = "Snow - /snəʊ/";
            soundExample6 = "/media/Diphthongs/əʊ/snow.mp3";


        }else if (sourceButton == btnMoreInformation8) {
            symbol = "aʊ";
            soundSymbol = "/media/Diphthongs/Diptongo8.mp3";
            sentence = "The brown cow is loud and proud";
            soundSentence = "/media/Diphthongs/aʊ/The brown cow is loud and proud.mp3";
            example1 = "Now - /naʊ/";
            soundExample1 = "/media/Diphthongs/aʊ/now.mp3";
            example2 = "How - /haʊ/";
            soundExample2 = "/media/Diphthongs/aʊ/how.mp3";
            example3 = "Brown - /braʊn/";
            soundExample3 = "/media/Diphthongs/aʊ/brown.mp3";
            example4 = "Cow - /kaʊ/";
            soundExample4 = "/media/Diphthongs/aʊ/cow.mp3";
            example5 = "Loud - /laʊd/";
            soundExample5 = "/media/Diphthongs/aʊ/loud.mp3";
            example6 = "House - /haʊs/";
            soundExample6 = "/media/Diphthongs/aʊ/house.mp3";

        }

        OpenInformation openInformation = new OpenInformation(sentence, example1, example2, example3, example4, example5, example6, symbol,
                soundSymbol, soundSentence, soundExample1, soundExample2, soundExample3, soundExample4, soundExample5, soundExample6,selectedUrlPage , mouseEvent);

    }
}

