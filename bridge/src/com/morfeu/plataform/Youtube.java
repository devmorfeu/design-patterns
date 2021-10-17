package com.morfeu.plataform;

public class Youtube implements IPlataform{

    public Youtube() {
        configureRMTP();
        System.out.println("Youtube: TRANSMISSAO INICIADA");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Youtube: CONTA AUTORIZADA");
    }

    @Override
    public void authToken() {
        System.out.println("Youtube: AUTORIZANDO APLICAÇÃO");
    }
}
