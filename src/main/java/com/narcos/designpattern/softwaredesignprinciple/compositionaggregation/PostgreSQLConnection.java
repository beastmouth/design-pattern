package com.narcos.designpattern.softwaredesignprinciple.compositionaggregation;

/**
 * @author hbj
 * @date 2020/3/5 8:29 下午
 */
public class PostgreSQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "PostgreSQL数据库链接";
    }
}
