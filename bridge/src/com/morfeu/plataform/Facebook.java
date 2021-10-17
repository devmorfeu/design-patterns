package com.morfeu.plataform;

public class Facebook implements IPlataform{

    public Facebook() {
        configureRMTP();
        System.out.println("FACEBOOK: TRANSMISSAO INICIADA");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("FACEBOOK: CONTA AUTORIZADA");
    }

    @Override
    public void authToken() {
        System.out.println("FACEBOOK: AUTORIZANDO APLICAÇÃO");
    }
}
