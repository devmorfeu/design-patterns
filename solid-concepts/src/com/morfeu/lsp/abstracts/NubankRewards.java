package com.morfeu.lsp.abstracts;

import com.morfeu.lsp.contract.IPaymentInstrument;

public class NubankRewards implements IPaymentInstrument {

    @Override
    public void validate() {
        System.out.println("LIMITE OK, REWARDS OK!!!");
    }

    @Override
    public void collectPayment() {
        System.out.println("PONTUAÇÃO: 1200");
    }
}
