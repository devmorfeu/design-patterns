package com.morfeu;

import com.morfeu.plataform.IPlataform;
import com.morfeu.plataform.Twitch;
import com.morfeu.plataform.Youtube;
import com.morfeu.transmission.AdvancedLive;

public class Main {

    public static void main(String[] args) {

        startLive(new Youtube());
        startLive(new Twitch());
        startLive(new Youtube());

    }

    public static void startLive(IPlataform plataform) {

//        System.out.println(".....AGUARDE");
//        var live = new Live(plataform);
//        live.broadcasting();
//        live.result();

        System.out.println("TRANSMISSAO AVANÇADA... AGUARDE");
        AdvancedLive advancedLive = new AdvancedLive(plataform);

        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.result();
    }
}
