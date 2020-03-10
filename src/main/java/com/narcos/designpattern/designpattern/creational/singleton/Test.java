package com.narcos.designpattern.designpattern.creational.singleton;

import java.io.*;

/**
 * @author hbj
 * @date 2020/3/10 10:39 下午
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 序列化与反序列化破坏
        LazySingleton lazySingleton = LazySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(lazySingleton);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        LazySingleton newLazySingleton = (LazySingleton) ois.readObject();

        System.out.println(lazySingleton);
        System.out.println(newLazySingleton);
        System.out.println(lazySingleton == newLazySingleton);

    }
}
