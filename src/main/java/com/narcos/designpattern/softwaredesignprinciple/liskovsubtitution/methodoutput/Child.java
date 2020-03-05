package com.narcos.designpattern.softwaredesignprinciple.liskovsubtitution.methodoutput;

import java.util.HashMap;

/**
 * @author hbj
 * @date 2020/3/5 7:37 下午
 */
public class Child extends Base {
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message", "子类method被执行");
        return hashMap;
    }
}
