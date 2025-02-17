package com.farniks.appfoneticaipa.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.MediaPlayer;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ConsonantsVoicedController {
    @FXML
    private Button btnHome,btnExit,btnGithub,
            btnConsonant1, btnConsonant2, btnConsonant3, btnConsonant4, btnConsonant5, btnConsonant6, btnConsonant7, btnConsonant8, btnConsonant9, btnConsonant10, btnConsonant11, btnConsonant12, btnConsonant13, btnConsonant14, btnConsonant15,btnConsonant16,
            btnMoreInformation1, btnMoreInformation2, btnMoreInformation3, btnMoreInformation4, btnMoreInformation5, btnMoreInformation6,btnMoreInformation7,btnMoreInformation8,btnMoreInformation9,btnMoreInformation10, btnMoreInformation11,btnMoreInformation12,btnMoreInformation13,btnMoreInformation14,btnMoreInformation15,btnMoreInformation16;

    private final ChangePage changePage = new ChangePage();

    protected SoundsPhonetics soundsPhonetics;

    public ConsonantsVoicedController() {
    }

    public void eventMenu(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        if (sourceButton == btnHome) {
            changePage.loadStage("home.fxml", mouseEvent, "Vocales");
        }else if (sourceButton == btnExit) {
            Platform.exit();
        }else if (sourceButton == btnGithub){
            try {
                Desktop.getDesktop().browse(new URI("https://github.com/FARNIKS/APP-Fonetica-IPA"));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }
    }

    public void eventButtonConsonantsSounds(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        String musicFile = "/media/Voiced/Voiced16.mp3";

        if (sourceButton == btnConsonant1) {
            musicFile = "/media/Voiced/Voiced1.mp3";
        }else if (sourceButton == btnConsonant2) {
            musicFile = "/media/Voiced/Voiced2.mp3";
        }else if (sourceButton == btnConsonant3) {
            musicFile = "/media/Voiced/Voiced3.mp3";
        }else if (sourceButton == btnConsonant4) {
            musicFile = "/media/Voiced/Voiced4.mp3";
        }else if (sourceButton == btnConsonant5) {
            musicFile = "/media/Voiced/Voiced5.mp3";
        }else if (sourceButton == btnConsonant6) {
            musicFile = "/media/Voiced/Voiced6.mp3";
        }else if (sourceButton == btnConsonant7) {
            musicFile = "/media/Voiced/Voiced7.mp3";
        }else if (sourceButton == btnConsonant8) {
            musicFile = "/media/Voiced/Voiced8.mp3";
        }else if (sourceButton == btnConsonant9) {
            musicFile = "/media/Voiced/Voiced9.mp3";
        }else if (sourceButton == btnConsonant10) {
            musicFile = "/media/Voiced/Voiced10.mp3";
        }else if (sourceButton == btnConsonant11) {
            musicFile = "/media/Voiced/Voiced11.mp3";
        }else if (sourceButton == btnConsonant12) {
            musicFile = "/media/Voiced/Voiced12.mp3";
        }else if (sourceButton == btnConsonant13) {
            musicFile = "/media/Voiced/Voiced13.mp3";
        }else if (sourceButton == btnConsonant14) {
            musicFile = "/media/Voiced/Voiced14.mp3";
        }else if (sourceButton == btnConsonant15) {
            musicFile = "/media/Voiced/Voiced15.mp3";
        }else if (sourceButton == btnConsonant16) {
            musicFile = "/media/Voiced/Voiced16.mp3";
        }

        soundsPhonetics = new SoundsPhonetics(musicFile);
    }

    public void eventButtonsMoreInformationConsonants(MouseEvent mouseEvent) {
        Button sourceButton = (Button) mouseEvent.getSource();
        // Variables por defecto
        String symbol = "b";
        String soundSymbol = "/media/Voiced/Voiced1.mp3";
        String sentence = "Ben bought a new bike";
        String soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
        String example1 = "Boy - /bɔɪ/";
        String soundExample1 = "/media/Voiced/b/boy.mp3";
        String example2 = "Big - /bɪɡ/";
        String soundExample2 = "/media/Voiced/b/big.mp3";
        String example3 = "Bag - /bæɡ/";
        String soundExample3 = "/media/Voiced/b/bag.mp3";
        String example4 = "Book - /bʊk/";
        String soundExample4 = "/media/Voiced/b/book.mp3";
        String example5 = "Baby - /ˈbeɪbi/";
        String soundExample5 = "/media/Voiced/b/baby.mp3";
        String example6 = "Blue - /bluː/";
        String soundExample6 = "/media/Voiced/b/blue.mp3";
        String selectedUrlPage = "consonants-voiced.fxml";

        if (sourceButton == btnMoreInformation1) {
            symbol = "b";
            soundSymbol = "/media/Voiced/Voiced1.mp3";
            sentence = "Ben bought a new bike";
            soundSentence = "/media/Voiced/b/Ben bought a new bike.mp3";
            example1 = "Boy - /bɔɪ/";
            soundExample1 = "/media/Voiced/b/boy.mp3";
            example2 = "Big - /bɪɡ/";
            soundExample2 = "/media/Voiced/b/big.mp3";
            example3 = "Bag - /bæɡ/";
            soundExample3 = "/media/Voiced/b/bag.mp3";
            example4 = "Book - /bʊk/";
            soundExample4 = "/media/Voiced/b/book.mp3";
            example5 = "Baby - /ˈbeɪbi/";
            soundExample5 = "/media/Voiced/b/baby.mp3";
            example6 = "Blue - /bluː/";
            soundExample6 = "/media/Voiced/b/blue.mp3";

        }else if (sourceButton == btnMoreInformation2) {
            symbol = "v";
            soundSymbol = "/media/Voiced/Voiced2.mp3";
            sentence = "She visited her grandmother";
            soundSentence = "/media/Voiced/v/She visited her grandmother.mp3";
            example1 = "Van - /væn/";
            soundExample1 = "/media/Voiced/v/van.mp3";
            example2 = "Vase - /veɪs/";
            soundExample2 = "/media/Voiced/v/vase.mp3";
            example3 = "Very - /ˈvɛri/";
            soundExample3 = "/media/Voiced/v/very.mp3";
            example4 = "Vote - /vəʊt/";
            soundExample4 = "/media/Voiced/v/vote.mp3";
            example5 = "Victory - /ˈvɪktəri/";
            soundExample5 = "/media/Voiced/v/victory.mp3";
            example6 = "Voice - /vɔɪs/";
            soundExample6 = "/media/Voiced/v/voice.mp3";

        }else if (sourceButton == btnMoreInformation3) {
            symbol = "ð";
            soundSymbol = "/media/Voiced/Voiced3.mp3";
            sentence = "The book is on the table";
            soundSentence = "/media/Voiced/ð/The book is on the table.mp3";
            example1 = "This - /ðɪs/";
            soundExample1 = "/media/Voiced/ð/this.mp3";
            example2 = "That - /ðæt/";
            soundExample2 = "/media/Voiced/ð/that.mp3";
            example3 = "The - /ðə/";
            soundExample3 = "/media/Voiced/ð/the.mp3";
            example4 = "They - /ðeɪ/";
            soundExample4 = "/media/Voiced/ð/they.mp3";
            example5 = "There - /ðeə/";
            soundExample5 = "/media/Voiced/ð/there.mp3";
            example6 = "Though - /ðəʊ/";
            soundExample6 = "/media/Voiced/ð/though.mp3";

        }else if (sourceButton == btnMoreInformation4) {
            symbol = "d";
            soundSymbol = "/media/Voiced/Voiced4.mp3";
            sentence = "David opened the door";
            soundSentence = "/media/Voiced/d/David opened the door.mp3";
            example1 = "Dog - /dɒɡ/";
            soundExample1 = "/media/Voiced/d/dog.mp3";
            example2 = "Day - /deɪ/";
            soundExample2 = "/media/Voiced/d/day.mp3";
            example3 = "Door - /dɔː/";
            soundExample3 = "/media/Voiced/d/door.mp3";
            example4 = "Dark - /dɑːk/";
            soundExample4 = "/media/Voiced/d/dark.mp3";
            example5 = "Dollar - /ˈdɒlər/";
            soundExample5 = "/media/Voiced/d/dollar.mp3";
            example6 = "Deep - /diːp/";
            soundExample6 = "/media/Voiced/d/deep.mp3";

        }else if (sourceButton == btnMoreInformation5) {
            symbol = "z";
            soundSymbol = "/media/Voiced/Voiced5.mp3";
            sentence = "The zoo closes at five";
            soundSentence = "/media/Voiced/z/The zoo closes at five.mp3";
            example1 = "Zebra - /ˈziːbrə/";
            soundExample1 = "/media/Voiced/z/zebra.mp3";
            example2 = "Zero - /ˈzɪərəʊ/";
            soundExample2 = "/media/Voiced/z/zero.mp3";
            example3 = "Zoo - /zuː/";
            soundExample3 = "/media/Voiced/z/zoo.mp3";
            example4 = "Buzz - /bʌz/";
            soundExample4 = "/media/Voiced/z/buzz.mp3";
            example5 = "Crazy - /ˈkreɪzi/";
            soundExample5 = "/media/Voiced/z/crazy.mp3";
            example6 = "Lazy - /ˈleɪzi/";
            soundExample6 = "/media/Voiced/z/lazy.mp3";

        }else if (sourceButton == btnMoreInformation6) {
            symbol = "ʒ";
            soundSymbol = "/media/Voiced/Voiced6.mp3";
            sentence = "They watched a television show";
            soundSentence = "/media/Voiced/ʒ/They watched a television show.mp3";
            example1 = "Measure - /ˈmɛʒər/";
            soundExample1 = "/media/Voiced/ʒ/measure.mp3";
            example2 = "Treasure - /ˈtrɛʒər/";
            soundExample2 = "/media/Voiced/ʒ/treasure.mp3";
            example3 = "Pleasure - /ˈplɛʒər/";
            soundExample3 = "/media/Voiced/ʒ/pleasure.mp3";
            example4 = "Leisure - /ˈlɛʒər/";
            soundExample4 = "/media/Voiced/ʒ/leisure.mp3";
            example5 = "Vision - /ˈvɪʒən/";
            soundExample5 = "/media/Voiced/ʒ/vision.mp3";
            example6 = "Version - /ˈvɜːʒən/";
            soundExample6 = "/media/Voiced/ʒ/version.mp3";

        }else if (sourceButton == btnMoreInformation7) {
            symbol = "dʒ";
            soundSymbol = "/media/Voiced/Voiced7.mp3";
            sentence = "James enjoys orange juice";
            soundSentence = "/media/Voiced/dʒ/James enjoys orange juice.mp3";
            example1 = "Judge - /dʒʌdʒ/";
            soundExample1 = "/media/Voiced/dʒ/judge.mp3";
            example2 = "Jump - /dʒʌmp/";
            soundExample2 = "/media/Voiced/dʒ/jump.mp3";
            example3 = "Jungle - /ˈdʒʌŋɡl/";
            soundExample3 = "/media/Voiced/dʒ/jungle.mp3";
            example4 = "Giant - /ˈdʒaɪənt/";
            soundExample4 = "/media/Voiced/dʒ/giant.mp3";
            example5 = "Giraffe - /dʒɪˈræf/";
            soundExample5 = "/media/Voiced/dʒ/giraffe.mp3";
            example6 = "Juice - /dʒuːs/";
            soundExample6 = "/media/Voiced/dʒ/juice.mp3";

        }else if (sourceButton == btnMoreInformation8) {
            symbol = "g";
            soundSymbol = "/media/Voiced/Voiced8.mp3";
            sentence = "Gary gave me a gift";
            soundSentence = "/media/Voiced/g/Gary gave me a gift.mp3";
            example1 = "Go - /ɡəʊ/";
            soundExample1 = "/media/Voiced/g/go.mp3";
            example2 = "Green - /ɡriːn/";
            soundExample2 = "/media/Voiced/g/green.mp3";
            example3 = "Girl - /ɡɜːl/";
            soundExample3 = "/media/Voiced/g/girl.mp3";
            example4 = "Game - /ɡeɪm/";
            soundExample4 = "/media/Voiced/g/game.mp3";
            example5 = "Garden - /ˈɡɑːdən/";
            soundExample5 = "/media/Voiced/g/garden.mp3";
            example6 = "Gold - /ɡəʊld/";
            soundExample6 = "/media/Voiced/g/gold.mp3";

        }else if (sourceButton == btnMoreInformation9) {
            symbol = "m";
            soundSymbol = "/media/Voiced/Voiced9.mp3";
            sentence = "My mom made dinner";
            soundSentence = "/media/Voiced/m/My mom made dinner.mp3";
            example1 = "Man - /mæn/";
            soundExample1 = "/media/Voiced/m/man.mp3";
            example2 = "Mother - /ˈmʌðər/";
            soundExample2 = "/media/Voiced/m/mother.mp3";
            example3 = "Milk - /mɪlk/";
            soundExample3 = "/media/Voiced/m/milk.mp3";
            example4 = "Monkey - /ˈmʌŋki/";
            soundExample4 = "/media/Voiced/m/monkey.mp3";
            example5 = "Moon - /muːn/";
            soundExample5 = "/media/Voiced/m/moon.mp3";
            example6 = "Music - /ˈmjuːzɪk/";
            soundExample6 = "/media/Voiced/m/music.mp3";

        }else if (sourceButton == btnMoreInformation10) {
            symbol = "n";
            soundSymbol = "/media/Voiced/Voiced10.mp3";
            sentence = "Nancy wrote a note";
            soundSentence = "/media/Voiced/n/Nancy wrote a note.mp3";
            example1 = "Name - /neɪm/";
            soundExample1 = "/media/Voiced/n/name.mp3";
            example2 = "Nose - /nəʊz/";
            soundExample2 = "/media/Voiced/n/nose.mp3";
            example3 = "Night - /naɪt/";
            soundExample3 = "/media/Voiced/n/night.mp3";
            example4 = "Number - /ˈnʌmbər/";
            soundExample4 = "/media/Voiced/n/number.mp3";
            example5 = "Nature - /ˈneɪtʃər/";
            soundExample5 = "/media/Voiced/n/nature.mp3";
            example6 = "Nap - /næp/";
            soundExample6 = "/media/Voiced/n/nap.mp3";

        }else if (sourceButton == btnMoreInformation11) {
            symbol = "ŋ";
            soundSymbol = "/media/Voiced/Voiced11.mp3";
            sentence = "He is singing a song";
            soundSentence = "/media/Voiced/ŋ/He is singing a song.mp3";
            example1 = "Sing - /sɪŋ/";
            soundExample1 = "/media/Voiced/ŋ/sing.mp3";
            example2 = "Ring - /rɪŋ/";
            soundExample2 = "/media/Voiced/ŋ/ring.mp3";
            example3 = "Long - /lɒŋ/";
            soundExample3 = "/media/Voiced/ŋ/long.mp3";
            example4 = "Song - /sɒŋ/";
            soundExample4 = "/media/Voiced/ŋ/song.mp3";
            example5 = "Bring - /brɪŋ/";
            soundExample5 = "/media/Voiced/ŋ/bring.mp3";
            example6 = "King - /kɪŋ/";
            soundExample6 = "/media/Voiced/ŋ/king.mp3";

        }else if (sourceButton == btnMoreInformation12) {
            symbol = "h";
            soundSymbol = "/media/Voiced/Voiced12.mp3";
            sentence = "Hannah has a big house";
            soundSentence = "/media/Voiced/h/Hannah has a big house.mp3";
            example1 = "Hello - /həˈləʊ/";
            soundExample1 = "/media/Voiced/h/hello.mp3";
            example2 = "Happy - /ˈhæpi/";
            soundExample2 = "/media/Voiced/h/happy.mp3";
            example3 = "House - /haʊs/";
            soundExample3 = "/media/Voiced/h/house.mp3";
            example4 = "Hand - /hænd/";
            soundExample4 = "/media/Voiced/h/hand.mp3";
            example5 = "Horse - /hɔːs/";
            soundExample5 = "/media/Voiced/h/horse.mp3";
            example6 = "Hat - /hæt/";
            soundExample6 = "/media/Voiced/h/hat.mp3";

        }else if (sourceButton == btnMoreInformation13) {
            symbol = "w";
            soundSymbol = "/media/Voiced/Voiced13.mp3";
            sentence = "We went to the park";
            soundSentence = "/media/Voiced/w/We went to the park.mp3";
            example1 = "We - /wiː/";
            soundExample1 = "/media/Voiced/w/we.mp3";
            example2 = "Water - /ˈwɔːtər/";
            soundExample2 = "/media/Voiced/w/water.mp3";
            example3 = "Wind - /wɪnd/";
            soundExample3 = "/media/Voiced/w/wind.mp3";
            example4 = "white - /waɪt/";
            soundExample4 = "/media/Voiced/w/white.mp3";
            example5 = "Wonder - /ˈwʌndər/";
            soundExample5 = "/media/Voiced/w/wonder.mp3";
            example6 = "Wheel - /wiːl/";
            soundExample6 = "/media/Voiced/w/wheel.mp3";

        }else if (sourceButton == btnMoreInformation14) {
            symbol = "l";
            soundSymbol = "/media/Voiced/Voiced14.mp3";
            sentence = "Lily likes reading books";
            soundSentence = "/media/Voiced/l/Lily likes reading books.mp3";
            example1 = "Love - /lʌv/";
            soundExample1 = "/media/Voiced/l/love.mp3";
            example2 = "Lake - /leɪk/";
            soundExample2 = "/media/Voiced/l/lake.mp3";
            example3 = "Light - /laɪt/";
            soundExample3 = "/media/Voiced/l/light.mp3";
            example4 = "Long - /lɒŋ/";
            soundExample4 = "/media/Voiced/l/long.mp3";
            example5 = "Leaf - /liːf/";
            soundExample5 = "/media/Voiced/l/leaf.mp3";
            example6 = "Lucky - /ˈlʌki/";
            soundExample6 = "/media/Voiced/l/lucky.mp3";

        }else if (sourceButton == btnMoreInformation15) {
            symbol = "r";
            soundSymbol = "/media/Voiced/Voiced15.mp3";
            sentence = "The red car is fast";
            soundSentence = "/media/Voiced/r/The red car is fast.mp3";
            example1 = "Red - /rɛd/";
            soundExample1 = "/media/Voiced/r/red.mp3";
            example2 = "Road - /rəʊd/";
            soundExample2 = "/media/Voiced/r/road.mp3";
            example3 = "Rain - /reɪn/";
            soundExample3 = "/media/Voiced/r/rain.mp3";
            example4 = "Rock - /rɒk/";
            soundExample4 = "/media/Voiced/r/rock.mp3";
            example5 = "Right - /raɪt/";
            soundExample5 = "/media/Voiced/r/right.mp3";
            example6 = "Rabbit - /ˈræbɪt/";
            soundExample6 = "/media/Voiced/r/rabbit.mp3";

        }else if (sourceButton == btnMoreInformation16) {
            symbol = "j";
            soundSymbol = "/media/Voiced/Voiced16.mp3";
            sentence = "Yesterday was very cold";
            soundSentence = "/media/Voiced/j/Yesterday was very cold.mp3";
            example1 = "Yes - /jɛs/";
            soundExample1 = "/media/Voiced/j/yes.mp3";
            example2 = "Yellow - /ˈjɛləʊ/";
            soundExample2 = "/media/Voiced/j/yellow.mp3";
            example3 = "You - /juː/";
            soundExample3 = "/media/Voiced/j/you.mp3";
            example4 = "Young - /jʌŋ/";
            soundExample4 = "/media/Voiced/j/young.mp3";
            example5 = "Yogurt - /ˈjoʊɡərt/";
            soundExample5 = "/media/Voiced/j/yogurt.mp3";
            example6 = "Yard - /jɑːd/";
            soundExample6 = "/media/Voiced/j/yard.mp3";

        }

        OpenInformation openInformation = new OpenInformation (sentence, example1, example2, example3, example4, example5, example6, symbol,
                soundSymbol, soundSentence, soundExample1, soundExample2, soundExample3, soundExample4, soundExample5, soundExample6,selectedUrlPage , mouseEvent);

    }
}
