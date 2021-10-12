package com.morfeu.lsp.abstracts;

public class DebitCard extends NubankCard {

    @Override
    public void validate() {
        System.out.println("VOCE TEM SALDO!!!!!");
    }
}
