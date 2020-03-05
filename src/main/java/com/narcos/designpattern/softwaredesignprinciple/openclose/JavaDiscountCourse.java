package com.narcos.designpattern.softwaredesignprinciple.openclose;

/**
 * 演示开闭原则例子
 *
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

    /**
     * 此处不遵循里氏替换原则，因为修改了父类的非抽象方法
     * 遵循里氏替换原则的写法见JavaDiscountCourse2
     */
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
