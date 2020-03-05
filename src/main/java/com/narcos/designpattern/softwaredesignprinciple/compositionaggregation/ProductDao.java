package com.narcos.designpattern.softwaredesignprinciple.compositionaggregation;

/**
 * @author hbj
 * @date 2020/3/5 8:24 下午
 */
//public class ProductDao extends DBConnection {
//    public void addProduct() {
//        String conn = super.getConnection();
//        System.out.println("使用" + conn + "增加产品");
//    }
//}
public class ProductDao {
    private DBConnection dbConnection;

    public DBConnection getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }
}