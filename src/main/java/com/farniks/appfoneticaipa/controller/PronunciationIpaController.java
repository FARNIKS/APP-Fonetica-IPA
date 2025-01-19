package com.farniks.appfoneticaipa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class PronunciationIpaController {
    @FXML
    Button btnHome, btnPreview,btnGithub,btnMode,
            btnSoundExample;

    @FXML
    Label lbSentenceExample,lbSymbol;

    @FXML
    TextArea taInformationPronunciation;

    public PronunciationIpaController() {
    }

    public void evenSoundExample(MouseEvent mouseEvent) {
    }

    public void eventMenu(MouseEvent mouseEvent) {

    }
}
