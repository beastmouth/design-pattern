package com.narcos.designpattern.softwaredesignprinciple.compositionaggregation;

/**
 * @author hbj
 * @date 2020/3/5 8:25 下午
 */
public class Test {
    public static void main(String[] args) {
//        ProductDao productDao = new ProductDao();
//        productDao.addProduct();
        ProductDao productDao = new ProductDao();
//        productDao.setDbConnection(new MySQLConnection());
        productDao.setDbConnection(new PostgreSQLConnection());
        productDao.addProduct();
    }
}
