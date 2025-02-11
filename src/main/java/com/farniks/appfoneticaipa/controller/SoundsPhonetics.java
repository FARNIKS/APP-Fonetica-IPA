package com.farniks.appfoneticaipa.controller;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.net.URL;

public class SoundsPhonetics {
    private MediaPlayer mediaPlayer;

    public SoundsPhonetics() {
    }

    public SoundsPhonetics (String musicFile) {
        URL resource = getClass().getResource(musicFile);
        if (resource != null) {
            Media sound = new Media(((URL) resource).toString());
            mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.setVolume(0.2);
            // Play the music when you start the driver instance
            mediaPlayer.play();
        } else {
            System.err.println("No se pudo encontrar el archivo de música.");
        }
    }
    public void soundsExamples(String musicFile){
        URL resource = getClass().getResource(musicFile);
        if (resource != null) {
            Media sound = new Media(((URL) resource).toString());
            mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.setVolume(0.5);
            // Play the music when you start the driver instance
            mediaPlayer.play();
        } else {
            System.err.println("No se pudo encontrar el archivo de música.");
        }
    }
}
