package com.narcos.designpattern.designpattern.creational.singleton;

/**
 * @author hbj
 * @date 2020/3/10 10:15 下午
 */
public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    private StaticInnerClassSingleton() {
        // 私有的构造器必须要有，否则外部就可以new出这个类的实例了
    }

}
