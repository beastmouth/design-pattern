package com.narcos.designpattern.softwaredesignprinciple.singleresponsibility.classsingleresponsibility;

/**
 * 单一职责-类的单一职责
 *
 * @author hbj
 * @date 2020/3/4 5:22 下午
 */
public class Bird {
    public void mainMoveMode(String birdName) {
        // 此处便不遵循类的单一职责，遵循的例子见
        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");
        }
    }
}
