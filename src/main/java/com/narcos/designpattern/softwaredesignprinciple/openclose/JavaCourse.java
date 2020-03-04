package com.narcos.designpattern.softwaredesignprinciple.openclose;

/**
 * 演示开闭原则例子
 *
 * @author hbj
 * @date 2020/3/4 11:48 上午
 */
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
