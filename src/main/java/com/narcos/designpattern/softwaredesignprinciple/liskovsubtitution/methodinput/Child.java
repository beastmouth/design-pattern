package com.narcos.designpattern.softwaredesignprinciple.liskovsubtitution.methodinput;

import java.util.HashMap;

/**
 * @author hbj
 * @date 2020/3/5 7:16 下午
 */
public class Child extends Base {
//    @Override
//    public void method(HashMap map) {
//        // 重写
//        System.out.println("子类HashMap入参方法被执行");
//    }

//    public void method(Map map) {
//        // 重载
//        System.out.println("子类Map入参方法被执行");
//    }

    public void method(HashMap map) {
        // 重载
        System.out.println("子类HashMap入参方法被执行");
    }
}
