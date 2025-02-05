package com.farniks.appfoneticaipa.controller;

import com.farniks.appfoneticaipa.Main;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;


public class VowelsMonophthongsController{
    @FXML
    Button btnHome, btnMode, btnGithub,
            btnSoundVocal1, btnSoundVocal2, btnSoundVocal3, btnSoundVocal4, btnSoundVocal5, btnSoundVocal6,btnSoundVocal7,btnSoundVocal8,btnSoundVocal9,btnSoundVocal10,btnSoundVocal11,btnSoundVocal12,
            btnMoreInformation1,btnMoreInformation2,btnMoreInformation3,btnMoreInformation4,btnMoreInformation5,btnMoreInformation6,btnMoreInformation7,btnMoreInformation8,btnMoreInformation9,btnMoreInformation10,btnMoreInformation11,btnMoreInformation12;

    private final ChangePage changePage = new ChangePage();

    private MediaPlayer mediaPlayer;

    private SoundsPhonetics soundsPhonetics;

    public VowelsMonophthongsController() {
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

        soundsPhonetics = new SoundsPhonetics(musicFile);


    }

    public void eventButtonsMoreInformation(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        // Variables por defecto
        String symbol = "iː";
        String sentence = "She needs a new seat";
        String example1 = "Feet - /fiːt/";
        String example2 = "Eat - /iːt/";
        String example3 = "Leave - /liːv/";
        String example4 = "Green - /ɡriːn/";
        String example5 = "Tree - /triː/";
        String example6 = "See - /siː/";


        if (sourceButton == btnMoreInformation1) {
            symbol = "iː";
            sentence = "She needs a new seat";
            example1 = "Feet - /fiːt/";
            example2 = "Eat - /iːt/";
            example3 = "Leave - /liːv/";
            example4 = "Green - /ɡriːn/";
            example5 = "Tree - /triː/";
            example6 = "See - /siː/";



        }else if (sourceButton == btnMoreInformation2) {
            symbol = "ɪ";
            sentence = "This is a big fish";
            example1 = "Big - /bɪɡ/";
            example2 = "Fish - /fɪʃ/";
            example3 = "Sit - /sɪt/";
            example4 = "Milk - /mɪlk/";
            example5 = "Tip - /tɪp/";
            example6 = "Hill - /hɪl/";

        }else if (sourceButton == btnMoreInformation3) {
            symbol = "ʊ";
            sentence = "He took a book from the shelf";
            example1 = "book - /bʊk/";
            example2 = "look - /lʊk/";
            example3 = "foot - /fʊt/";
            example4 = "push - /pʊʃ/";
            example5 = "wood - /wʊd/";
            example6 = "good - /ɡʊd/";

        }else if (sourceButton == btnMoreInformation4) {
            symbol = "uː";
            sentence = "Luke moved to a new school";
            example1 = "moon - /muːn/";
            example2 = "food - /fuːd/";
            example3 = "school - /skuːl/";
            example4 = "room - /ruːm/";
            example5 = "blue - /bluː/";
            example6 = "true - /truː/";

        }else if (sourceButton == btnMoreInformation5) {
            symbol = "e";
            sentence = "The red pen is on the desk";
            example1 = "pen - /pen/";
            example2 = "bed - /bed/";
            example3 = "set - /set/";
            example4 = "net - /net/";
            example5 = "ten - /ten/";
            example6 = "yes - /jes/";

        }else if (sourceButton == btnMoreInformation6) {
            symbol = "ɜː";
            sentence = "The bird heard a word";
            example1 = "bird - /bɜːd/";
            example2 = "word - /wɜːd/";
            example3 = "third - /θɜːd/";
            example4 = "learn - /lɜːn/";
            example5 = "nurse - /nɜːs/";
            example6 = "early - /ˈɜːli/";

        }else if (sourceButton == btnMoreInformation7) {
            symbol = "ɪ";
            sentence = "She needs a new seat";
            example1 = "Big";
            example2 = "Fish";
            example3 = "Sit";
            example4 = "Milk";
            example5 = "Tip";
            example6 = "Hill";

        }else if (sourceButton == btnMoreInformation8) {
            symbol = "iː";
            sentence = "She needs a new seat";
            example1 = "Feet";
            example2 = "Eat";
            example3 = "Leave";
            example4 = "Green";
            example5 = "Tree";
            example6 = "See";

        }else if (sourceButton == btnMoreInformation9) {
            symbol = "iː";
            sentence = "She needs a new seat";
            example1 = "Feet";
            example2 = "Eat";
            example3 = "Leave";
            example4 = "Green";
            example5 = "Tree";
            example6 = "See";

        }else if (sourceButton == btnMoreInformation10) {
            symbol = "iː";
            sentence = "She needs a new seat";
            example1 = "Feet";
            example2 = "Eat";
            example3 = "Leave";
            example4 = "Green";
            example5 = "Tree";
            example6 = "See";

        }else if (sourceButton == btnMoreInformation11) {
            symbol = "iː";
            sentence = "She needs a new seat";
            example1 = "Feet";
            example2 = "Eat";
            example3 = "Leave";
            example4 = "Green";
            example5 = "Tree";
            example6 = "See";

        }else if (sourceButton == btnMoreInformation12) {
            symbol = "iː";
            sentence = "She needs a new seat";
            example1 = "Feet";
            example2 = "Eat";
            example3 = "Leave";
            example4 = "Green";
            example5 = "Tree";
            example6 = "See";

        }

        abrirVentanaInformacion(sentence, example1, example2, example3, example4, example5, example6, symbol, mouseEvent);

    }

    private void abrirVentanaInformacion(
            String sentence, String example1, String example2, String example3,
            String example4, String example5, String example6, String symbol, MouseEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(Main.class.getResource("information-example-ipa.fxml")));
            Parent root = loader.load();

            // Obtener el controlador y pasar la información
            InformationExampleIpaController controller = loader.getController();
            controller.setInformation(sentence, example1, example2, example3, example4, example5, example6, symbol);

            // Obtener el Stage actual y cerrarlo
            Stage currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Mostrar la nueva ventana
            Stage stage = new Stage();
            stage.setTitle("Información IPA");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}