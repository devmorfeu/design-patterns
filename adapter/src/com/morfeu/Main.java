package com.morfeu;

import com.morfeu.adapter.PayonnerAdapter;
import com.morfeu.payoneer.Payonner;

public class Main {

    public static void main(String[] args) {

        //var payment = new Paypal();

        var payment = new PayonnerAdapter(new Payonner());

        payment.paypalPayment();
        payment.paypalReceive();
    }
}