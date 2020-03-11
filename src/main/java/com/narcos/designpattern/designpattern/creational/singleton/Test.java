package com.narcos.designpattern.designpattern.creational.singleton;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author hbj
 * @date 2020/3/10 10:39 下午
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 序列化与反序列化破坏
//        LazySingleton lazySingleton = LazySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(lazySingleton);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//
//        LazySingleton newLazySingleton = (LazySingleton) ois.readObject();

        // 反射攻击
        LazySingleton lazySingleton = LazySingleton.getInstance();
        Class objectClass = LazySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        // 放开构造器的权限，使私有的构造器能够被调用
        constructor.setAccessible(true);
        LazySingleton newLazySingleton = (LazySingleton) constructor.newInstance();

        System.out.println(lazySingleton);
        System.out.println(newLazySingleton);
        System.out.println(lazySingleton == newLazySingleton);

    }
}
