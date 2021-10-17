package com.morfeu.payoneer;

import com.morfeu.utils.Token;

public class Payonner implements IPayonnerPayment{

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("ENVIANDO PAGAMENTO VIA PAYONNER");
    }

    @Override
    public void receivePayment() {
        System.out.println("RECEBENDO PAGAMENTO VIA PAYONNER");
    }
}
