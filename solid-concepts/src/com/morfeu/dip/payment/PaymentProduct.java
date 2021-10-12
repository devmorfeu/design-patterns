package com.morfeu.dip.payment;

import com.morfeu.dip.factory.DbProductFactory;
import com.morfeu.dip.model.Db;

public class PaymentProduct {

    public void pay(String id) {
        //var dbProduct = new MySQLProduct();
        var dbProduct = DbProductFactory.create(Db.MONGODB);
        var product = dbProduct.getProductById(id);
        System.out.println(product);
    }
}
