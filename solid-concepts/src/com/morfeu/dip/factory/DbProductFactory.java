package com.morfeu.dip.factory;

import com.morfeu.dip.model.Db;
import com.morfeu.dip.model.IDbProduct;
import com.morfeu.dip.model.MongoDbProduct;
import com.morfeu.dip.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct create(Db type) {
        if (type == Db.MYSQL) {
            return new MySQLProduct();
        }else {
            return new MongoDbProduct();
        }
    }
}
