package com.narcos.designpattern.softwaredesignprinciple.openclose;

/**
 * @author hbj
 * @date 2020/3/4 1:14 下午
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
