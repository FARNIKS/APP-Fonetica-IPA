package com.farniks.appfoneticaipa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class PronunciacionFonetica {
    @FXML
    Button btnHome, btnPreview,btnGithub,btnMode,
            btnSoundExample;

    @FXML
    ImageView imgSymbolIPA;

    @FXML
    Label lbSentenceExample;

    @FXML
    TextArea taInformationPronunciation;

    public PronunciacionFonetica() {
    }

    public void evenSoundExample(MouseEvent mouseEvent) {
    }

    public void eventMenu(MouseEvent mouseEvent) {

    }
}
