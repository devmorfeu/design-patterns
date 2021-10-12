package com.morfeu.lsp.abstracts;

import com.morfeu.lsp.abstracts.NubankCard;

public class CreditCard extends NubankCard {

    @Override
    public void validate() {
        System.out.println("VOCE TEM CREDITO!!!");
    }
}
