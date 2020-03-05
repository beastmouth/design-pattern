package com.narcos.designpattern.softwaredesignprinciple.liskovsubtitution.methodinput;

import java.util.HashMap;

/**
 * @author hbj
 * @date 2020/3/5 7:18 下午
 */
public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);
    }
}
