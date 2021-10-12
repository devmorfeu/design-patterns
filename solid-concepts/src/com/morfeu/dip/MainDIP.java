package com.morfeu.dip;

import com.morfeu.dip.payment.PaymentProduct;

public class MainDIP {

    public static void main(String[] args) {

        var paymentProduct = new PaymentProduct();
        paymentProduct.pay("250");
    }
}
