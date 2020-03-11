package com.narcos.designpattern.designpattern.creational.singleton;

import java.io.Serializable;

/**
 * 懒汉式
 * 此处实现序列化是用来演示序列化破坏
 *
 * @author hbj
 * @date 2020/3/10 9:44 下午
 */
public class LazySingleton implements Serializable {
    //    private static LazySingleton lazySingleton;
    private volatile static LazySingleton lazySingleton;

    private LazySingleton() {
        // 解决反射攻击
        if (lazySingleton != null) {
            throw new RuntimeException("单例模式禁止被反射调用");
        }
    }

//    public static LazySingleton getInstance() {
//        if (lazySingleton == null) {
//            // 有线程安全问题，需要double checked
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }

    // synchronized 修饰静态方法，相当于是锁住了整个类(开销大，性能低)
    // 等价代码 synchronized(LazySingleton.class)
//    public synchronized static LazySingleton getInstance() {
//        if (lazySingleton == null) {
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    // lazySingleton = new LazySingleton(); 是三步，可能会与指令重排序问题
                    lazySingleton = new LazySingleton();
                    // Java语言允许在单线程内不影响执行结果的重排序
                    // 1.分配内存给该对象
                    // 2.初始化对象（调用构造器）
                    // 3.是lazySingle变量指向该对象在内容中的地址
                }
            }
        }
        return lazySingleton;
    }

    // 解决序列化破坏
    private Object readResolve() {
        return lazySingleton;
    }
}
