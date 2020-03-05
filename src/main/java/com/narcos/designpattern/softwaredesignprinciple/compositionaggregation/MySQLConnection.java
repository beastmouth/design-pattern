package com.narcos.designpattern.softwaredesignprinciple.compositionaggregation;

/**
 * @author hbj
 * @date 2020/3/5 8:29 下午
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库链接";
    }
}
