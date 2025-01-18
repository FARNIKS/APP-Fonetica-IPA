package com.farniks.appfoneticaipa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Diptongos {
    @FXML
    Button btnHome,btnMode,btnGithub,
            btnDiphthong1, btnDiphthong2, btnDiphthong3, btnDiphthong4,btnDiphthong5, btnDiphthong6, btnDiphthong7, btnDiphthong8,
            btnMoreInformation1, btnMoreInformation2, btnMoreInformation3, btnMoreInformation4,btnMoreInformation5, btnMoreInformation6,btnMoreInformation7,btnMoreInformation8;

    private final ChangePage changePage = new ChangePage();

    public Diptongos() {

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
    }

    public void eventButtonsMoreInformation(ContextMenuEvent contextMenuEvent) {
    }
}
