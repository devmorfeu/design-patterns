package com.morfeu.lsp.abstracts;

import com.morfeu.lsp.contract.IPaymentInstrument;

abstract public class NubankCard implements IPaymentInstrument {

    @Override
    public void validate() {
        //validação basica
    }

    @Override
    public void collectPayment() {
        System.out.println("PAGAMENTO REALIZADO");
    }
}
