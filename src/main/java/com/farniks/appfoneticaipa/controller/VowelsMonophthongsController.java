package com.farniks.appfoneticaipa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;


import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;



public class VowelsMonophthongsController{
    @FXML
    Button btnHome, btnMode, btnGithub,
            btnSoundVocal1, btnSoundVocal2, btnSoundVocal3, btnSoundVocal4, btnSoundVocal5, btnSoundVocal6,btnSoundVocal7,btnSoundVocal8,btnSoundVocal9,btnSoundVocal10,btnSoundVocal11,btnSoundVocal12,
            btnMoreInformation1,btnMoreInformation2,btnMoreInformation3,btnMoreInformation4,btnMoreInformation5,btnMoreInformation6,btnMoreInformation7,btnMoreInformation8,btnMoreInformation9,btnMoreInformation10,btnMoreInformation11,btnMoreInformation12;

    private final ChangePage changePage = new ChangePage();

    private MediaPlayer mediaPlayer;

    public VowelsMonophthongsController() {
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
        String musicFile = "/media/Vowels/Vocal12.mp3";

        if (sourceButton == btnSoundVocal1) {
            musicFile = "/media/Vowels/Vocal1.mp3";
        }else if (sourceButton == btnSoundVocal2) {
            musicFile = "/media/Vowels/Vocal2.mp3";
        }else if (sourceButton == btnSoundVocal3) {
            musicFile = "/media/Vowels/Vocal3.mp3";
        }else if (sourceButton == btnSoundVocal4) {
            musicFile = "/media/Vowels/Vocal4.mp3";
        }else if (sourceButton == btnSoundVocal5) {
            musicFile = "/media/Vowels/Vocal5.mp3";
        }else if (sourceButton == btnSoundVocal6) {
            musicFile = "/media/Vowels/Vocal6.mp3";
        }else if (sourceButton == btnSoundVocal7) {
            musicFile = "/media/Vowels/Vocal7.mp3";
        }else if (sourceButton == btnSoundVocal8) {
            musicFile = "/media/Vowels/Vocal8.mp3";
        }else if (sourceButton == btnSoundVocal9) {
            musicFile = "/media/Vowels/Vocal9.mp3";
        }else if (sourceButton == btnSoundVocal10) {
            musicFile = "/media/Vowels/Vocal10.mp3";
        }else if (sourceButton == btnSoundVocal11) {
            musicFile = "/media/Vowels/Vocal11.mp3";
        }else if (sourceButton == btnSoundVocal12) {
            musicFile = "/media/Vowels/Vocal12.mp3";
        }

        SoundsPhonetics soundsPhonetics = new SoundsPhonetics(musicFile);


    }

    public void eventButtonsMoreInformation(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        // Variables por defecto
        String symbol = "iː";
        String soundSymbol = "/media/Vowels/Vocal1.mp3";
        String sentence = "She needs a new seat";
        String soundSentence = "/media/Vowels/iː/She needs a new seat.mp3";
        String example1 = "Feet - /fiːt/";
        String soundExample1 = "/media/Vowels/iː/Feet.mp3";
        String example2 = "Eat - /iːt/";
        String soundExample2 = "/media/Vowels/iː/Eat.mp3";
        String example3 = "Leave - /liːv/";
        String soundExample3 = "/media/Vowels/iː/Leave.mp3";
        String example4 = "Green - /ɡriːn/";
        String soundExample4 = "/media/Vowels/iː/Green.mp3";
        String example5 = "Tree - /triː/";
        String soundExample5 = "/media/Vowels/iː/Tree.mp3";
        String example6 = "See - /siː/";
        String soundExample6 = "/media/Vowels/iː/See.mp3";
        String selectedUrlPage = "vowels-monophthongs.fxml";

        if (sourceButton == btnMoreInformation1) {
            symbol = "iː";
            soundSymbol = "/media/Vowels/Vocal1.mp3";
            sentence = "She needs a new seat";
            soundSentence = "/media/Vowels/iː/She needs a new seat.mp3";
            example1 = "Feet - /fiːt/";
            soundExample1 = "/media/Vowels/iː/Feet.mp3";
            example2 = "Eat - /iːt/";
            soundExample2 = "/media/Vowels/iː/Eat.mp3";
            example3 = "Leave - /liːv/";
            soundExample3 = "/media/Vowels/iː/Leave.mp3";
            example4 = "Green - /ɡriːn/";
            soundExample4 = "/media/Vowels/iː/Green.mp3";
            example5 = "Tree - /triː/";
            soundExample5 = "/media/Vowels/iː/Tree.mp3";
            example6 = "See - /siː/";
            soundExample6 = "/media/Vowels/iː/See.mp3";



        }else if (sourceButton == btnMoreInformation2) {
            symbol = "ɪ";
            soundSymbol = "/media/Vowels/Vocal2.mp3";
            sentence = "This is a big fish";
            soundSentence = "/media/Vowels/ɪ/This is a big fish.mp3";
            example1 = "Big - /bɪɡ/";
            soundExample1 = "/media/Vowels/ɪ/Big.mp3";
            example2 = "Fish - /fɪʃ/";
            soundExample2 = "/media/Vowels/ɪ/Fish.mp3";
            example3 = "Sit - /sɪt/";
            soundExample3 = "/media/Vowels/ɪ/Sit.mp3";
            example4 = "Milk - /mɪlk/";
            soundExample4 = "/media/Vowels/ɪ/Milk.mp3";
            example5 = "Tip - /tɪp/";
            soundExample5 = "/media/Vowels/ɪ/Tip.mp3";
            example6 = "Hill - /hɪl/";
            soundExample6 = "/media/Vowels/ɪ/Hill.mp3";

        }else if (sourceButton == btnMoreInformation3) {
            symbol = "ʊ";
            soundSymbol = "/media/Vowels/Vocal3.mp3";
            sentence = "He took a book from the shelf";
            soundSentence = "/media/Vowels/ʊ/He took a book from the shelf.mp3";
            example1 = "Book - /bʊk/";
            soundExample1 = "/media/Vowels/ʊ/book.mp3";
            example2 = "Look - /lʊk/";
            soundExample2 = "/media/Vowels/ʊ/look.mp3";
            example3 = "Foot - /fʊt/";
            soundExample3 = "/media/Vowels/ʊ/foot.mp3";
            example4 = "Push - /pʊʃ/";
            soundExample4 = "/media/Vowels/ʊ/push.mp3";
            example5 = "Wood - /wʊd/";
            soundExample5 = "/media/Vowels/ʊ/wood.mp3";
            example6 = "Good - /ɡʊd/";
            soundExample6 = "/media/Vowels/ʊ/good.mp3";

        }else if (sourceButton == btnMoreInformation4) {
            symbol = "uː";
            soundSymbol = "/media/Vowels/Vocal4.mp3";
            sentence = "Luke moved to a new school";
            soundSentence = "/media/Vowels/uː/Luke moved to a new school.mp3";
            example1 = "Moon - /muːn/";
            soundExample1 = "/media/Vowels/uː/moon.mp3";
            example2 = "Food - /fuːd/";
            soundExample2 = "/media/Vowels/uː/food.mp3";
            example3 = "School - /skuːl/";
            soundExample3 = "/media/Vowels/uː/school.mp3";
            example4 = "Room - /ruːm/";
            soundExample4 = "/media/Vowels/uː/room.mp3";
            example5 = "Blue - /bluː/";
            soundExample5 = "/media/Vowels/uː/blue.mp3";
            example6 = "True - /truː/";
            soundExample6 = "/media/Vowels/uː/true.mp3";

        }else if (sourceButton == btnMoreInformation5) {
            symbol = "e";
            soundSymbol="/media/Vowels/Vocal5.mp3";
            sentence = "The red pen is on the desk";
            soundSentence = "/media/Vowels/e/The red pen is on the desk.mp3";
            example1 = "Pen - /pen/";
            soundExample1 = "/media/Vowels/e/pen.mp3";
            example2 = "Bed - /bed/";
            soundExample2 = "/media/Vowels/e/bed.mp3";
            example3 = "Set - /set/";
            soundExample3 = "/media/Vowels/e/set.mp3";
            example4 = "Net - /net/";
            soundExample4 = "/media/Vowels/e/net.mp3";
            example5 = "Ten - /ten/";
            soundExample5 = "/media/Vowels/e/ten.mp3";
            example6 = "Yes - /jes/";
            soundExample6 = "/media/Vowels/e/yes.mp3";

        }else if (sourceButton == btnMoreInformation6) {
            symbol = "ɜː";
            soundSymbol="/media/Vowels/Vocal6.mp3";
            sentence = "The bird heard a word";
            soundSentence = "/media/Vowels/ɜː/The bird heard a word.mp3";
            example1 = "Bird - /bɜːd/";
            soundExample1 = "/media/Vowels/ɜː/bird.mp3";
            example2 = "Word - /wɜːd/";
            soundExample2 = "/media/Vowels/ɜː/word.mp3";
            example3 = "Third - /θɜːd/";
            soundExample3 = "/media/Vowels/ɜː/third.mp3";
            example4 = "Learn - /lɜːn/";
            soundExample4 = "/media/Vowels/ɜː/learn.mp3";
            example5 = "Nurse - /nɜːs/";
            soundExample5 = "/media/Vowels/ɜː/nurse.mp3";
            example6 = "Early - /ˈɜːli/";
            soundExample6 = "/media/Vowels/ɜː/early.mp3";

        }else if (sourceButton == btnMoreInformation7) {
            symbol = "ə";
            soundSymbol="/media/Vowels/Vocal7.mp3";
            sentence = "The teacher is in the cinema";
            soundSentence = "/media/Vowels/ə/The teacher is in the cinema.mp3";
            example1 = "Sofa - /ˈsəʊfə/";
            soundExample1 = "/media/Vowels/ə/sofa.mp3";
            example2 = "Banana - /bəˈnænə/";
            soundExample2 = "/media/Vowels/ə/banana.mp3";
            example3 = "About - /əˈbaʊt/";
            soundExample3 = "/media/Vowels/ə/about.mp3";
            example4 = "Camera - /ˈkæmrə/";
            soundExample4 = "/media/Vowels/ə/camera.mp3";
            example5 = "Elephant - /ˈɛlɪfənt/";
            soundExample5 = "/media/Vowels/ə/elephant.mp3";
            example6 = "Doctor - /ˈdɒktə/";
            soundExample6 = "/media/Vowels/ə/doctor.mp3";

        }else if (sourceButton == btnMoreInformation8) {
            symbol = "ɔː";
            soundSymbol="/media/Vowels/Vocal8.mp3";
            sentence = "He bought more food";
            soundSentence = "/media/Vowels/ɔː/He bought more food.mp3";
            example1 = "Door - /dɔː/";
            soundExample1 = "/media/Vowels/ɔː/door.mp3";
            example2 = "Floor - /flɔː/";
            soundExample2 = "/media/Vowels/ɔː/floor.mp3";
            example3 = "Law - /lɔː/";
            soundExample3 = "/media/Vowels/ɔː/law.mp3";
            example4 = "More - /mɔː/";
            soundExample4 = "/media/Vowels/ɔː/more.mp3";
            example5 = "Saw - /sɔː/";
            soundExample5 = "/media/Vowels/ɔː/saw.mp3";
            example6 = "Call - /kɔːl/";
            soundExample6 = "/media/Vowels/ɔː/call.mp3";

        }else if (sourceButton == btnMoreInformation9) {
            symbol = "æ";
            soundSymbol="/media/Vowels/Vocal9.mp3";
            sentence = "A cat sat on a black mat";
            soundSentence = "/media/Vowels/æ/A cat sat on a black mat.mp3";
            example1 = "Cat - /kæt/";
            soundExample1 = "/media/Vowels/æ/cat.mp3";
            example2 = "Hat - /hæt/";
            soundExample2 = "/media/Vowels/æ/hat.mp3";
            example3 = "Black - /blæk/";
            soundExample3 = "/media/Vowels/æ/black.mp3";
            example4 = "Apple - /ˈæpəl/";
            soundExample4 = "/media/Vowels/æ/apple.mp3";
            example5 = "Bat - /bæt/";
            soundExample5 = "/media/Vowels/æ/bat.mp3";
            example6 = "Sad - /sæd/";
            soundExample6 = "/media/Vowels/æ/sad.mp3";

        }else if (sourceButton == btnMoreInformation10) {
            symbol = "ʌ";
            soundSymbol="/media/Vowels/Vocal10.mp3";
            sentence = "The sun is hot";
            soundSentence = "/media/Vowels/ʌ/The sun is hot.mp3";
            example1 = "Cup - /kʌp/";
            soundExample1 = "/media/Vowels/ʌ/cup.mp3";
            example2 = "Love - /lʌv/";
            soundExample2 = "/media/Vowels/ʌ/love.mp3";
            example3 = "Sun - /sʌn/";
            soundExample3 = "/media/Vowels/ʌ/sun.mp3";
            example4 = "Run - /rʌn/";
            soundExample4 = "/media/Vowels/ʌ/run.mp3";
            example5 = "Fun - /fʌn/";
            soundExample5 = "/media/Vowels/ʌ/fun.mp3";
            example6 = "Mud - /mʌd/";
            soundExample6 = "/media/Vowels/ʌ/mud.mp3";

        }else if (sourceButton == btnMoreInformation11) {
            symbol = "ɒ";
            soundSymbol="/media/Vowels/Vocal11.mp3";
            sentence = "Tom got a new job";
            soundSentence = "/media/Vowels/ɒ/Tom got a new job.mp3";
            example1 = "Dog - /dɒɡ/";
            soundExample1 = "/media/Vowels/ɒ/dog.mp3";
            example2 = "Log - /lɒɡ/";
            soundExample2 = "/media/Vowels/ɒ/log.mp3";
            example3 = "Hot - /hɒt/";
            soundExample3 = "/media/Vowels/ɒ/hot.mp3";
            example4 = "Fog - /fɒɡ/";
            soundExample4 = "/media/Vowels/ɒ/fog.mp3";
            example5 = "Pot - /pɒt/";
            soundExample5 = "/media/Vowels/ɒ/pot.mp3";
            example6 = "Boss - /bɒs/";
            soundExample6 = "/media/Vowels/ɒ/boss.mp3";

        }else if (sourceButton == btnMoreInformation12) {
            symbol = "ɑː";
            soundSymbol="/media/Vowels/Vocal12.mp3";
            sentence = "Mark’s car is very fast";
            soundSentence = "/media/Vowels/ɑː/Mark’s car is very fast.mp3";
            example1 = "Car - /kɑː/";
            soundExample1 = "/media/Vowels/ɑː/car.mp3";
            example2 = "Park - /pɑːk/";
            soundExample2 = "/media/Vowels/ɑː/park.mp3";
            example3 = "Hard - /hɑːd/";
            soundExample3 = "/media/Vowels/ɑː/hard.mp3";
            example4 = "Dark - /dɑːk/";
            soundExample4 = "/media/Vowels/ɑː/dark.mp3";
            example5 = "Start - /stɑːt/";
            soundExample5 = "/media/Vowels/ɑː/start.mp3";
            example6 = "Far - /fɑː/";
            soundExample6 = "/media/Vowels/ɑː/far.mp3";

        }

        OpenInformation openInformation = new OpenInformation (sentence, example1, example2, example3, example4, example5, example6, symbol,
                soundSymbol, soundSentence, soundExample1, soundExample2, soundExample3, soundExample4, soundExample5, soundExample6,selectedUrlPage , mouseEvent);

    }


}