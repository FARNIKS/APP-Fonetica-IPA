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
    private Button btnHome,btnMode,btnGithub,
            btnConsonantSin1, btnConsonantSin2, btnConsonantSin3, btnConsonantSin4,btnConsonantSin5,btnConsonantSin6, btnConsonantSin7, btnConsonantSin8,
            btnMoreInformation1, btnMoreInformation2, btnMoreInformation3, btnMoreInformation4, btnMoreInformation5, btnMoreInformation6,btnMoreInformation7,btnMoreInformation8;

    private final ChangePage changePage = new ChangePage();

    private MediaPlayer mediaPlayer;

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
            musicFile = "/media/Unvoiced/Unvoiced1.mp3";
        }else if (sourceButton == btnConsonantSin2) {
            musicFile = "/media/Unvoiced/Unvoiced2.mp3";
        }else if (sourceButton == btnConsonantSin3) {
            musicFile = "/media/Unvoiced/Unvoiced3.mp3";
        }else if (sourceButton == btnConsonantSin4) {
            musicFile = "/media/Unvoiced/Unvoiced4.mp3";
        }else if (sourceButton == btnConsonantSin5) {
            musicFile = "/media/Unvoiced/Unvoiced5.mp3";
        }else if (sourceButton == btnConsonantSin6) {
            musicFile = "/media/Unvoiced/Unvoiced6.mp3";
        }else if (sourceButton == btnConsonantSin7) {
            musicFile = "/media/Unvoiced/Unvoiced7.mp3";
        }else if (sourceButton == btnConsonantSin8) {
            musicFile = "/media/Unvoiced/Unvoiced8.mp3";
        }

        SoundsPhonetics soundsPhonetics = new SoundsPhonetics(musicFile);
    }

    public void eventButtonsMoreInformation(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        // Variables por defecto
        String symbol = "p";
        String soundSymbol = "/media/Unvoiced/Unvoiced1.mp3";
        String sentence = "Paul paints his house blue";
        String soundSentence = "/media/Unvoiced/p/Paul paints his house blue.mp3";
        String example1 = "pen - /pɛn/";
        String soundExample1 = "/media/Unvoiced/p/pen.mp3";
        String example2 = "pencil - /ˈpɛnsɪl/";
        String soundExample2 = "/media/Unvoiced/p/pencil.mp3";
        String example3 = "paper - /ˈpeɪpər/";
        String soundExample3 = "/media/Unvoiced/p/paper.mp3";
        String example4 = "pink - /pɪŋk/";
        String soundExample4 = "/media/Unvoiced/p/pink.mp3";
        String example5 = "park - /pɑːk/";
        String soundExample5 = "/media/Unvoiced/p/park.mp3";
        String example6 = "puppy - /ˈpʌpi/";
        String soundExample6 = "/media/Unvoiced/p/puppy.mp3";
        String selectedUrlPage = "consonants-unvoiced.fxml";

        if (sourceButton == btnMoreInformation1) {
            symbol = "p";
            soundSymbol = "/media/Unvoiced/Unvoiced1.mp3";
            sentence = "Paul paints his house blue";
            soundSentence = "/media/Unvoiced/p/Paul paints his house blue.mp3";
            example1 = "Pen - /pɛn/";
            soundExample1 = "/media/Unvoiced/p/pen.mp3";
            example2 = "Pencil - /ˈpɛnsɪl/";
            soundExample2 = "/media/Unvoiced/p/pencil.mp3";
            example3 = "Paper - /ˈpeɪpər/";
            soundExample3 = "/media/Unvoiced/p/paper.mp3";
            example4 = "Pink - /pɪŋk/";
            soundExample4 = "/media/Unvoiced/p/pink.mp3";
            example5 = "Park - /pɑːk/";
            soundExample5 = "/media/Unvoiced/p/park.mp3";
            example6 = "Puppy - /ˈpʌpi/";
            soundExample6 = "/media/Unvoiced/p/puppy.mp3";

        }else if (sourceButton == btnMoreInformation2) {
            symbol = "p";
            soundSymbol = "/media/Unvoiced/Unvoiced1.mp3";
            sentence = "Paul paints his house blue";
            soundSentence = "/media/Unvoiced/p/Paul paints his house blue.mp3";
            example1 = "Pen - /pɛn/";
            soundExample1 = "/media/Unvoiced/p/pen.mp3";
            example2 = "Pencil - /ˈpɛnsɪl/";
            soundExample2 = "/media/Unvoiced/p/pencil.mp3";
            example3 = "Paper - /ˈpeɪpər/";
            soundExample3 = "/media/Unvoiced/p/paper.mp3";
            example4 = "Pink - /pɪŋk/";
            soundExample4 = "/media/Unvoiced/p/pink.mp3";
            example5 = "Park - /pɑːk/";
            soundExample5 = "/media/Unvoiced/p/park.mp3";
            example6 = "Puppy - /ˈpʌpi/";
            soundExample6 = "/media/Unvoiced/p/puppy.mp3";

        }else if (sourceButton == btnMoreInformation3) {
            symbol = "p";
            soundSymbol = "/media/Unvoiced/Unvoiced1.mp3";
            sentence = "Paul paints his house blue";
            soundSentence = "/media/Unvoiced/p/Paul paints his house blue.mp3";
            example1 = "Pen - /pɛn/";
            soundExample1 = "/media/Unvoiced/p/pen.mp3";
            example2 = "Pencil - /ˈpɛnsɪl/";
            soundExample2 = "/media/Unvoiced/p/pencil.mp3";
            example3 = "Paper - /ˈpeɪpər/";
            soundExample3 = "/media/Unvoiced/p/paper.mp3";
            example4 = "Pink - /pɪŋk/";
            soundExample4 = "/media/Unvoiced/p/pink.mp3";
            example5 = "Park - /pɑːk/";
            soundExample5 = "/media/Unvoiced/p/park.mp3";
            example6 = "Puppy - /ˈpʌpi/";
            soundExample6 = "/media/Unvoiced/p/puppy.mp3";

        }else if (sourceButton == btnMoreInformation4) {
            symbol = "p";
            soundSymbol = "/media/Unvoiced/Unvoiced1.mp3";
            sentence = "Paul paints his house blue";
            soundSentence = "/media/Unvoiced/p/Paul paints his house blue.mp3";
            example1 = "Pen - /pɛn/";
            soundExample1 = "/media/Unvoiced/p/pen.mp3";
            example2 = "Pencil - /ˈpɛnsɪl/";
            soundExample2 = "/media/Unvoiced/p/pencil.mp3";
            example3 = "Paper - /ˈpeɪpər/";
            soundExample3 = "/media/Unvoiced/p/paper.mp3";
            example4 = "Pink - /pɪŋk/";
            soundExample4 = "/media/Unvoiced/p/pink.mp3";
            example5 = "Park - /pɑːk/";
            soundExample5 = "/media/Unvoiced/p/park.mp3";
            example6 = "Puppy - /ˈpʌpi/";
            soundExample6 = "/media/Unvoiced/p/puppy.mp3";

        }else if (sourceButton == btnMoreInformation5) {
            symbol = "p";
            soundSymbol = "/media/Unvoiced/Unvoiced1.mp3";
            sentence = "Paul paints his house blue";
            soundSentence = "/media/Unvoiced/p/Paul paints his house blue.mp3";
            example1 = "Pen - /pɛn/";
            soundExample1 = "/media/Unvoiced/p/pen.mp3";
            example2 = "Pencil - /ˈpɛnsɪl/";
            soundExample2 = "/media/Unvoiced/p/pencil.mp3";
            example3 = "Paper - /ˈpeɪpər/";
            soundExample3 = "/media/Unvoiced/p/paper.mp3";
            example4 = "Pink - /pɪŋk/";
            soundExample4 = "/media/Unvoiced/p/pink.mp3";
            example5 = "Park - /pɑːk/";
            soundExample5 = "/media/Unvoiced/p/park.mp3";
            example6 = "Puppy - /ˈpʌpi/";
            soundExample6 = "/media/Unvoiced/p/puppy.mp3";

        }else if (sourceButton == btnMoreInformation6) {
            symbol = "p";
            soundSymbol = "/media/Unvoiced/Unvoiced1.mp3";
            sentence = "Paul paints his house blue";
            soundSentence = "/media/Unvoiced/p/Paul paints his house blue.mp3";
            example1 = "Pen - /pɛn/";
            soundExample1 = "/media/Unvoiced/p/pen.mp3";
            example2 = "Pencil - /ˈpɛnsɪl/";
            soundExample2 = "/media/Unvoiced/p/pencil.mp3";
            example3 = "Paper - /ˈpeɪpər/";
            soundExample3 = "/media/Unvoiced/p/paper.mp3";
            example4 = "Pink - /pɪŋk/";
            soundExample4 = "/media/Unvoiced/p/pink.mp3";
            example5 = "Park - /pɑːk/";
            soundExample5 = "/media/Unvoiced/p/park.mp3";
            example6 = "Puppy - /ˈpʌpi/";
            soundExample6 = "/media/Unvoiced/p/puppy.mp3";

        }else if (sourceButton == btnMoreInformation7) {
            symbol = "p";
            soundSymbol = "/media/Unvoiced/Unvoiced1.mp3";
            sentence = "Paul paints his house blue";
            soundSentence = "/media/Unvoiced/p/Paul paints his house blue.mp3";
            example1 = "Pen - /pɛn/";
            soundExample1 = "/media/Unvoiced/p/pen.mp3";
            example2 = "Pencil - /ˈpɛnsɪl/";
            soundExample2 = "/media/Unvoiced/p/pencil.mp3";
            example3 = "Paper - /ˈpeɪpər/";
            soundExample3 = "/media/Unvoiced/p/paper.mp3";
            example4 = "Pink - /pɪŋk/";
            soundExample4 = "/media/Unvoiced/p/pink.mp3";
            example5 = "Park - /pɑːk/";
            soundExample5 = "/media/Unvoiced/p/park.mp3";
            example6 = "Puppy - /ˈpʌpi/";
            soundExample6 = "/media/Unvoiced/p/puppy.mp3";

        }else if (sourceButton == btnMoreInformation8) {
            symbol = "p";
            soundSymbol = "/media/Unvoiced/Unvoiced1.mp3";
            sentence = "Paul paints his house blue";
            soundSentence = "/media/Unvoiced/p/Paul paints his house blue.mp3";
            example1 = "Pen - /pɛn/";
            soundExample1 = "/media/Unvoiced/p/pen.mp3";
            example2 = "Pencil - /ˈpɛnsɪl/";
            soundExample2 = "/media/Unvoiced/p/pencil.mp3";
            example3 = "Paper - /ˈpeɪpər/";
            soundExample3 = "/media/Unvoiced/p/paper.mp3";
            example4 = "Pink - /pɪŋk/";
            soundExample4 = "/media/Unvoiced/p/pink.mp3";
            example5 = "Park - /pɑːk/";
            soundExample5 = "/media/Unvoiced/p/park.mp3";
            example6 = "Puppy - /ˈpʌpi/";
            soundExample6 = "/media/Unvoiced/p/puppy.mp3";

        }

        OpenInformation openInformation = new OpenInformation(sentence, example1, example2, example3, example4, example5, example6, symbol,
                soundSymbol, soundSentence, soundExample1, soundExample2, soundExample3, soundExample4, soundExample5, soundExample6,selectedUrlPage , mouseEvent);

    }
}
