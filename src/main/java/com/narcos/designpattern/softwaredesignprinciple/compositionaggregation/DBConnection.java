package com.narcos.designpattern.softwaredesignprinciple.compositionaggregation;

/**
 * @author hbj
 * @date 2020/3/5 8:22 下午
 */
//public class DBConnection {
//    public String getConnection() {
//        return "MySQL数据库链接";
//    }
//}
public abstract class DBConnection {
    public abstract String getConnection();
}
