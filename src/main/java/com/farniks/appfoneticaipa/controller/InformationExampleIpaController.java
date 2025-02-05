package com.farniks.appfoneticaipa.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class InformationExampleIpaController {
    @FXML
    Button btnHome, btnMenu, btnMode, btnGithub,
            btnMoreInformation,
            btnSentenceSound,
            btnExampleSound1, btnExampleSound2, btnExampleSound3, btnExampleSound4, btnExampleSound5, btnExampleSound6,
            btnSymbolSound;
    @FXML
    private Label lbSentence, lbExample1, lbExample2, lbExample3, lbExample4, lbExample5, lbExample6, lbSymbol;

    private final ChangePage changePage = new ChangePage();

    private SoundsPhonetics soundsPhonetics;

    // Atributos para las rutas de los archivos de audio
    private String symbolSound;
    private String sentenceSound;
    private String exampleSound1;
    private String exampleSound2;
    private String exampleSound3;
    private String exampleSound4;
    private String exampleSound5;
    private String exampleSound6;

    public InformationExampleIpaController() {

    }

    public void eventMenu(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        if (sourceButton == btnHome) {
            changePage.loadStage("home.fxml", mouseEvent, "Vocales");
        }else if (sourceButton == btnMode) {
            System.out.println("Mode");
        }else if (sourceButton == btnMenu) {
            System.out.println();
        }else if (sourceButton == btnGithub){
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/FARNIKS/APP-Fonetica-IPA"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    public void eventScroll(MouseEvent mouseEvent) {

    }
    public void eventSoundsExamplesSentences(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        String musicFile = "";

        if (sourceButton == btnSymbolSound) {
            musicFile = symbolSound;
        } else if (sourceButton == btnSentenceSound) {
            musicFile = sentenceSound;
        } else if (sourceButton == btnExampleSound1) {
            musicFile = exampleSound1;
        } else if (sourceButton == btnExampleSound2) {
            musicFile = exampleSound2;
        } else if (sourceButton == btnExampleSound3) {
            musicFile = exampleSound3;
        } else if (sourceButton == btnExampleSound4) {
            musicFile = exampleSound4;
        } else if (sourceButton == btnExampleSound5) {
            musicFile = exampleSound5;
        } else if (sourceButton == btnExampleSound6) {
            musicFile = exampleSound6;
        }
        soundsPhonetics = new SoundsPhonetics(musicFile);
    }

    public void eventButtonInformation(MouseEvent mouseEvent) {
    }

    public void setInformation(
            String sentence, String example1, String example2, String example3,
            String example4, String example5, String example6, String symbol) {

        if (lbSentence != null) {
            lbSentence.setText(sentence);
        }
        if (lbExample1 != null) {
            lbExample1.setText(example1);
        }
        if (lbExample2 != null) {
            lbExample2.setText(example2);
        }
        if (lbExample3 != null) {
            lbExample3.setText(example3);
        }
        if (lbExample4 != null) {
            lbExample4.setText(example4);
        }
        if (lbExample5 != null) {
            lbExample5.setText(example5);
        }
        if (lbExample6 != null) {
            lbExample6.setText(example6);
        }
        if (lbSymbol != null) {
            lbSymbol.setText(symbol);
        }
    }

    // Métodos setters para las rutas de los sonidos
    public void setSymbolSound(String path) {
        this.symbolSound = path;
    }

    public void setSentenceSound(String path) {
        this.sentenceSound = path;
    }

    public void setExampleSound1(String path) {
        this.exampleSound1 = path;
    }

    public void setExampleSound2(String path) {
        this.exampleSound2 = path;
    }

    public void setExampleSound3(String path) {
        this.exampleSound3 = path;
    }

    public void setExampleSound4(String path) {
        this.exampleSound4 = path;
    }

    public void setExampleSound5(String path) {
        this.exampleSound5 = path;
    }

    public void setExampleSound6(String path) {
        this.exampleSound6 = path;
    }


}