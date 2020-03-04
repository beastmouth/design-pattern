package com.narcos.designpattern.softwaredesignprinciple.dependicesinversion;

/**
 * 依赖倒置例子演示
 *
 * @author hbj
 * @date 2020/3/4 1:53 下午
 */
public class FECourse implements ICourse {
    public void studyCourse() {
        System.out.println("Narcos在学习前端课程");
    }
}
