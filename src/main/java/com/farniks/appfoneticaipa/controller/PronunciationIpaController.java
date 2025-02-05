package com.farniks.appfoneticaipa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class PronunciationIpaController {
    @FXML
    private Button btnHome, btnPreview,btnGithub,btnMode,
            btnSoundExample;

    @FXML
    private Label lbSentenceExample,lbSymbol;

    @FXML
    private TextArea taInformationPronunciation;

    public PronunciationIpaController() {
    }

    public void evenSoundExample(MouseEvent mouseEvent) {
    }

    public void eventMenu(MouseEvent mouseEvent) {

    }
}
