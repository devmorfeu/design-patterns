package com.morfeu.transmission;

import com.morfeu.plataform.IPlataform;

public class Live implements ITransmission{

    protected IPlataform plataform;

    public Live(IPlataform plataform) {
        this.plataform = plataform;
    }

    @Override
    public void broadcasting() {
        System.out.println("INICIANDO TRANSMISSAO");
    }

    @Override
    public void result() {
        System.out.println("******** AO VIVO ********");

    }
}
