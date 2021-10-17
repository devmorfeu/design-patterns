package com.morfeu.payoneer;

import com.morfeu.utils.Token;

public interface IPayonnerPayment {

    Token authToken();
    void sendPayment();
    void receivePayment();
}
