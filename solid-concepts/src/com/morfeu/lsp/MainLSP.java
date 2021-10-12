package com.morfeu.lsp;

import com.morfeu.lsp.abstracts.NubankRewards;

public class MainLSP {

    public static void main(String[] args) {

        //var card = new CreditCard();
        //var card = new DebitCard();
        var card = new NubankRewards();

        card.validate();
        card.collectPayment();
    }
}
