package com.morfeu.dip.model;

public class MySQLProduct implements IDbProduct{

    public String getProductById(String id) {
        return "MySQL: EXIBINDO DADOS DO PRODUTO " + id;
    }
}
