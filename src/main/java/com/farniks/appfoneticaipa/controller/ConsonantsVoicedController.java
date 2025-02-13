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

        SoundsPhonetics soundsPhonetics = new SoundsPhonetics(musicFile);
    }

    public void eventButtonsMoreInformationConsonants(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        // Variables por defecto
        String symbol = "b";
        String soundSymbol = "/media/Voiced/Voiced1.mp3";
        String sentence = "Ben bought a new bike";
        String soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
        String example1 = "Boy - /bɔɪ/";
        String soundExample1 = "/media/Voiced/b/boy.mp3";
        String example2 = "Big - /bɪɡ/";
        String soundExample2 = "/media/Voiced/b/big.mp3";
        String example3 = "Bag - /bæɡ/";
        String soundExample3 = "/media/Voiced/b/bag.mp3";
        String example4 = "Book - /bʊk/";
        String soundExample4 = "/media/Voiced/b/book.mp3";
        String example5 = "Baby - /ˈbeɪbi/";
        String soundExample5 = "/media/Voiced/b/baby.mp3";
        String example6 = "Blue - /bluː/";
        String soundExample6 = "/media/Voiced/b/blue.mp3";
        String selectedUrlPage = "consonants-voiced.fxml";

        if (sourceButton == btnMoreInformation1) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/big.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";



        }else if (sourceButton == btnMoreInformation2) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation3) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation4) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation5) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation6) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation7) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation8) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation9) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation10) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation11) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation12) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation13) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation14) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation15) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation16) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/eat.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }

        OpenInformation openInformation = new OpenInformation (sentence, example1, example2, example3, example4, example5, example6, symbol,
                soundSymbol, soundSentence, soundExample1, soundExample2, soundExample3, soundExample4, soundExample5, soundExample6,selectedUrlPage , mouseEvent);

    }
}
