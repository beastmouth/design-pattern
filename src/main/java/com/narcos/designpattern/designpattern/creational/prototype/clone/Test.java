package com.narcos.designpattern.designpattern.creational.prototype.clone;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author hbj
 * @date 2020/3/11 9:40 下午
 */
public class Test {
//    public static void main(String[] args) throws CloneNotSupportedException {
//        Date birthday = new Date(0L);
//        Pig pig1 = new Pig("piggy", birthday);
//        Pig pig2 = (Pig) pig1.clone();
//        System.out.println(pig1);
//        System.out.println(pig2);
//
//        pig1.getBirthday().setTime(11111111111L);
//        System.out.println(pig1);
//        System.out.println(pig2);
//    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        Method method = lazySingleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        LazySingleton cloneLazySingleton = (LazySingleton) method.invoke(lazySingleton);
        System.out.println(lazySingleton);
        System.out.println(cloneLazySingleton);
        System.out.println(lazySingleton == cloneLazySingleton);
    }
}
