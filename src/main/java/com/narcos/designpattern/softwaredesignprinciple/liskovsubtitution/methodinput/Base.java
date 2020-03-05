package com.narcos.designpattern.softwaredesignprinciple.liskovsubtitution.methodinput;

import java.util.Map;

/**
 * @author hbj
 * @date 2020/3/5 7:15 下午
 */
public class Base {
//    public void method(HashMap map) {
//        System.out.println("父类被执行");
//    }

    public void method(Map map) {
        System.out.println("父类被执行");
    }
}
