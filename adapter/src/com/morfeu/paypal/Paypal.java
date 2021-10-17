package com.morfeu.paypal;

import com.morfeu.utils.Token;

public class Paypal implements IPaypalPayment{

    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        System.out.println("ENVIANDO PAGAMENTO VIA PAYPAL");

    }

    @Override
    public void paypalReceive() {
        System.out.println("RECEBENDO PAGAMENTO VIA PAYPAL");
    }
}