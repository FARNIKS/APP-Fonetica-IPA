package com.farniks.appfoneticaipa.controller;

import com.farniks.appfoneticaipa.Main;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class OpenInformation {

    public OpenInformation() {
    }

    public OpenInformation(
            String sentence, String example1, String example2, String example3, String example4, String example5, String example6, String symbol,
            String selectedSoundSymbol,String selectedSoundSentence, String selectedSoundExample1, String selectedSoundExample2, String selectedSoundExample3, String selectedSoundExample4, String selectedSoundExample5, String selectedSoundExample6, String urlPage,
            MouseEvent event) {


        try {
            Image logo = new Image(Main.class.getResourceAsStream("/img/Logo fonetica.png"));
            FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(Main.class.getResource("information-example-ipa.fxml")));
            Parent root = loader.load();

            // Obtener el controlador y pasar la información
            InformationExampleIpaController controller = loader.getController();
            controller.setInformation(
                    sentence,
                    example1,
                    example2,
                    example3,
                    example4,
                    example5,
                    example6,
                    symbol);

            // Obtener el Stage actual y cerrarlo
            Stage currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
            currentStage.close();

            // Pasar las rutas de los archivos de audio
            controller.setAudioFiles(
                    selectedSoundSymbol,
                    selectedSoundSentence,
                    selectedSoundExample1,
                    selectedSoundExample2,
                    selectedSoundExample3,
                    selectedSoundExample4,
                    selectedSoundExample5,
                    selectedSoundExample6,
                    urlPage

            );

            // Mostrar la nueva ventana
            Stage stage = new Stage();
            stage.getIcons().add(logo);
            stage.setResizable(false);
            stage.setTitle("Información IPA");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
