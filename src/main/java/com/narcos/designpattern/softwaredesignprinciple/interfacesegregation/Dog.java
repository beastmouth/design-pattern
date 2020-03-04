package com.narcos.designpattern.softwaredesignprinciple.interfacesegregation;

/**
 * 接口隔离原则-此处可能会有许多不需要实现的方法，接口粒度不够细
 *
 * @author hbj
 * @date 2020/3/4 6:23 下午
 */
public class Dog implements IAnimalAction {
    public void eat() {

    }

    public void fly() {
        // 狗不会飞，这里相当于是一个空实现
    }

    public void swim() {

    }
}
