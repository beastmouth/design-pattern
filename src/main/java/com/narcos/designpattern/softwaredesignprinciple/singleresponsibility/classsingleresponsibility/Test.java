package com.narcos.designpattern.softwaredesignprinciple.singleresponsibility.classsingleresponsibility;

/**
 * @author hbj
 * @date 2020/3/4 5:42 下午
 */
public class Test {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.mainMoveMode("大雁");
        bird.mainMoveMode("鸵鸟");

        System.out.println("遵循类的单一职责用法");

        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
