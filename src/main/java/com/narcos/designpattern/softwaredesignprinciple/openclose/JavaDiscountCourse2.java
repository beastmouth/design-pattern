package com.narcos.designpattern.softwaredesignprinciple.openclose;

/**
 * @author hbj
 * @date 2020/3/5 6:39 下午
 */
public class JavaDiscountCourse2 extends JavaCourse {
    public JavaDiscountCourse2(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }
}
