package com.farniks.appfoneticaipa.controller;

import com.farniks.appfoneticaipa.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;

public class VowelsDiphthongsController {
    @FXML
    private Button btnHome,btnMode,btnGithub,
            btnDiphthong1, btnDiphthong2, btnDiphthong3, btnDiphthong4,btnDiphthong5, btnDiphthong6, btnDiphthong7, btnDiphthong8,
            btnMoreInformation1, btnMoreInformation2, btnMoreInformation3, btnMoreInformation4,btnMoreInformation5, btnMoreInformation6,btnMoreInformation7,btnMoreInformation8;

    private final ChangePage changePage = new ChangePage();

    private MediaPlayer mediaPlayer;

    private SoundsPhonetics soundsPhonetics;

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

        soundsPhonetics = new SoundsPhonetics(musicFile);

    }

    public void eventButtonsMoreInformation(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        // Variables por defecto
        String symbol = "ɪ";
        String sentence = "Ejemplo de oración";
        String example1 = "Ejemplo 1";
        String example2 = "Ejemplo 2";
        String example3 = "Ejemplo 3";
        String example4 = "Ejemplo 4";
        String example5 = "Ejemplo 5";
        String example6 = "Ejemplo 6";


        if (sourceButton == btnMoreInformation1) {
            symbol = "ɪ";
            sentence = "corona";
            example1 = "Bit";
            example2 = "Sit";
            example3 = "Fit";
            example4 = "Hit";
            example5 = "Lit";
            example6 = "Mit";

        }else if (sourceButton == btnMoreInformation2) {

        }else if (sourceButton == btnMoreInformation3) {

        }else if (sourceButton == btnMoreInformation4) {

        }else if (sourceButton == btnMoreInformation5) {

        }else if (sourceButton == btnMoreInformation6) {

        }else if (sourceButton == btnMoreInformation7) {

        }else if (sourceButton == btnMoreInformation8) {

        }
        
        abrirVentanaInformacion(sentence, example1, example2, example3, example4, example5, example6, symbol);
    }

    private void abrirVentanaInformacion(
            String sentence, String example1, String example2, String example3,
            String example4, String example5, String example6, String symbol) {

        try {
            FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(Main.class.getResource("information-example-ipa.fxml")));
            Parent root = loader.load();

            // Obtener el controlador y pasar la información
            InformationExampleIpaController controller = loader.getController();
            controller.setInformation(sentence, example1, example2, example3, example4, example5, example6, symbol);

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
