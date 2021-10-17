package com.morfeu.adapter;

import com.morfeu.payoneer.Payonner;
import com.morfeu.paypal.IPaypalPayment;
import com.morfeu.utils.Token;

public class PayonnerAdapter implements IPaypalPayment {

    private Token token;
    private Payonner payonner;

    public PayonnerAdapter(Payonner payonner){
        this.payonner = payonner;
        System.out.println("ADAPTANDO O PAYONNER UTILIZANDO OS MÉTODOS PADROES DO PAYPAL");
    }
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payonner.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payonner.receivePayment();
    }
}
