package com.morfeu.lsp.contract;

public interface IPaymentInstrument {

    void validate();
    void collectPayment();
}
