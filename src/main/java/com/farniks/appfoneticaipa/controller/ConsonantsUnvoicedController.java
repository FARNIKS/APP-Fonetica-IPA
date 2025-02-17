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

public class ConsonantsUnvoicedController {
    @FXML
    private Button btnHome, btnExit,btnGithub,
            btnConsonantSin1, btnConsonantSin2, btnConsonantSin3, btnConsonantSin4,btnConsonantSin5,btnConsonantSin6, btnConsonantSin7, btnConsonantSin8,
            btnMoreInformation1, btnMoreInformation2, btnMoreInformation3, btnMoreInformation4, btnMoreInformation5, btnMoreInformation6,btnMoreInformation7,btnMoreInformation8;

    private final ChangePage changePage = new ChangePage();

    protected SoundsPhonetics soundsPhonetics;

    public ConsonantsUnvoicedController() {
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

    public void eventButtonConsonantsSinSounds(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        String musicFile = "/media/Unvoiced12.mp3";

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

        soundsPhonetics = new SoundsPhonetics(musicFile);
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
            symbol = "f";
            soundSymbol = "/media/Unvoiced/Unvoiced2.mp3";
            sentence = "The coffee is very hot";
            soundSentence = "/media/Unvoiced/f/The coffee is very hot.mp3";
            example1 = "Fish - /fɪʃ/";
            soundExample1 = "/media/Unvoiced/f/fish.mp3";
            example2 = "Fun - /fʌn/";
            soundExample2 = "/media/Unvoiced/f/fun.mp3";
            example3 = "Five - /faɪv/";
            soundExample3 = "/media/Unvoiced/f/five.mp3";
            example4 = "Flower - /ˈflaʊər/";
            soundExample4 = "/media/Unvoiced/f/flower.mp3";
            example5 = "Fast - /fæst/";
            soundExample5 = "/media/Unvoiced/f/fast.mp3";
            example6 = "Forest - /ˈfɒrɪst/";
            soundExample6 = "/media/Unvoiced/f/forest.mp3";

        }else if (sourceButton == btnMoreInformation3) {
            symbol = "θ";
            soundSymbol = "/media/Unvoiced/Unvoiced3.mp3";
            sentence = "I think it’s a good idea";
            soundSentence = "/media/Unvoiced/θ/I think it’s a good idea.mp3";
            example1 = "Think - /θɪŋk/";
            soundExample1 = "/media/Unvoiced/θ/think.mp3";
            example2 = "Three - /θriː/";
            soundExample2 = "/media/Unvoiced/θ/three.mp3";
            example3 = "Thick - /θɪk/";
            soundExample3 = "/media/Unvoiced/θ/thick.mp3";
            example4 = "Thief - /θiːf/";
            soundExample4 = "/media/Unvoiced/θ/thief.mp3";
            example5 = "Thirsty - /ˈθɜːsti/";
            soundExample5 = "/media/Unvoiced/θ/thirsty.mp3";
            example6 = "Thank - /θæŋk/";
            soundExample6 = "/media/Unvoiced/θ/thank.mp3";

        }else if (sourceButton == btnMoreInformation4) {
            symbol = "t";
            soundSymbol = "/media/Unvoiced/Unvoiced4.mp3";
            sentence = "Tim took a bus home";
            soundSentence = "/media/Unvoiced/t/Tim took a bus home.mp3";
            example1 = "Top - /tɒp/";
            soundExample1 = "/media/Unvoiced/t/top.mp3";
            example2 = "Time - /taɪm/";
            soundExample2 = "/media/Unvoiced/t/time.mp3";
            example3 = "Table - /ˈteɪbəl/";
            soundExample3 = "/media/Unvoiced/t/table.mp3";
            example4 = "Ten - /tɛn/";
            soundExample4 = "/media/Unvoiced/t/ten.mp3";
            example5 = "Tiger - /ˈtaɪɡər/";
            soundExample5 = "/media/Unvoiced/t/tiger.mp3";
            example6 = "Train - /treɪn/";
            soundExample6 = "/media/Unvoiced/t/train.mp3";

        }else if (sourceButton == btnMoreInformation5) {
            symbol = "s";
            soundSymbol = "/media/Unvoiced/Unvoiced5.mp3";
            sentence = "Sarah studies every day";
            soundSentence = "/media/Unvoiced/s/Sarah studies every day.mp3";
            example1 = "Sun - /sʌn/";
            soundExample1 = "/media/Unvoiced/s/sun.mp3";
            example2 = "Sea - /siː/";
            soundExample2 = "/media/Unvoiced/s/sea.mp3";
            example3 = "Sand - /sænd/";
            soundExample3 = "/media/Unvoiced/s/sand.mp3";
            example4 = "School - /skuːl/";
            soundExample4 = "/media/Unvoiced/s/school.mp3";
            example5 = "Sock - /sɒk/";
            soundExample5 = "/media/Unvoiced/s/sock.mp3";
            example6 = "Sugar - /ˈʃʊɡər/";
            soundExample6 = "/media/Unvoiced/s/sugar.mp3";

        }else if (sourceButton == btnMoreInformation6) {
            symbol = "ʃ";
            soundSymbol = "/media/Unvoiced/Unvoiced6.mp3";
            sentence = "She bought new shoes";
            soundSentence = "/media/Unvoiced/ʃ/She bought new shoes.mp3";
            example1 = "She - /ʃiː/";
            soundExample1 = "/media/Unvoiced/ʃ/she.mp3";
            example2 = "Shop - /ʃɒp/";
            soundExample2 = "/media/Unvoiced/ʃ/shop.mp3";
            example3 = "Shoe - /ʃuː/";
            soundExample3 = "/media/Unvoiced/ʃ/shoe.mp3";
            example4 = "Shirt - /ʃɜːt/";
            soundExample4 = "/media/Unvoiced/ʃ/shirt.mp3";
            example5 = "Short - /ʃɔːt/";
            soundExample5 = "/media/Unvoiced/ʃ/short.mp3";
            example6 = "Shower - /ˈʃaʊər/";
            soundExample6 = "/media/Unvoiced/ʃ/shower.mp3";

        }else if (sourceButton == btnMoreInformation7) {
            symbol = "tʃ";
            soundSymbol = "/media/Unvoiced/Unvoiced7.mp3";
            sentence = "Charlie chose a red shirt";
            soundSentence = "/media/Unvoiced/tʃ/Charlie chose a red shirt.mp3";
            example1 = "Chip - /tʃɪp/";
            soundExample1 = "/media/Unvoiced/tʃ/chip.mp3";
            example2 = "Cheese - /tʃiːz/";
            soundExample2 = "/media/Unvoiced/tʃ/cheese.mp3";
            example3 = "Chair - /tʃeər/";
            soundExample3 = "/media/Unvoiced/tʃ/chair.mp3";
            example4 = "Child - /tʃaɪld/";
            soundExample4 = "/media/Unvoiced/tʃ/child.mp3";
            example5 = "Chicken - /ˈtʃɪkɪn/";
            soundExample5 = "/media/Unvoiced/tʃ/chicken.mp3";
            example6 = "chocolate - /ˈtʃɒklɪt/";
            soundExample6 = "/media/Unvoiced/tʃ/chocolate.mp3";

        }else if (sourceButton == btnMoreInformation8) {
            symbol = "k";
            soundSymbol = "/media/Unvoiced/Unvoiced8.mp3";
            sentence = "Kevin cooked dinner";
            soundSentence = "/media/Unvoiced/k/Kevin cooked dinner.mp3";
            example1 = "Cat - /kæt/";
            soundExample1 = "/media/Unvoiced/k/cat.mp3";
            example2 = "Car - /kɑːr/";
            soundExample2 = "/media/Unvoiced/k/car.mp3";
            example3 = "King - /kɪŋ/";
            soundExample3 = "/media/Unvoiced/k/king.mp3";
            example4 = "Cake - /keɪk/";
            soundExample4 = "/media/Unvoiced/k/cake.mp3";
            example5 = "Cold - /kəʊld/";
            soundExample5 = "/media/Unvoiced/k/cold.mp3";
            example6 = "Clock - /klɒk/";
            soundExample6 = "/media/Unvoiced/k/clock.mp3";

        }

        OpenInformation openInformation = new OpenInformation(sentence, example1, example2, example3, example4, example5, example6, symbol,
                soundSymbol, soundSentence, soundExample1, soundExample2, soundExample3, soundExample4, soundExample5, soundExample6,selectedUrlPage , mouseEvent);

    }
}
