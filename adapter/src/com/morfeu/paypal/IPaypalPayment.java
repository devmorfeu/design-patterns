package com.morfeu.paypal;

import com.morfeu.utils.Token;

public interface IPaypalPayment {

    Token authToken();
    void paypalPayment();
    void paypalReceive();
}
