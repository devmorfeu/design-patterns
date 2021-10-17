package com.morfeu.plataform;

public class Twitch implements IPlataform{

    public Twitch() {
        configureRMTP();
        System.out.println("Twitch: TRANSMISSAO INICIADA");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Twitch: CONTA AUTORIZADA");
    }

    @Override
    public void authToken() {
        System.out.println("Twitch: AUTORIZANDO APLICAÇÃO");
    }
}
