package com.narcos.designpattern.softwaredesignprinciple.liskovsubtitution.methodoutput;

/**
 * @author hbj
 * @date 2020/3/5 7:41 下午
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.method());
    }
}
