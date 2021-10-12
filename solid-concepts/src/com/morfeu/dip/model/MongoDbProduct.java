package com.morfeu.dip.model;

public class MongoDbProduct implements IDbProduct {

    public String getProductById(String id) {
        return "MongoDb: EXIBINDO DADOS DO PRODUTO " + id;
    }
}
