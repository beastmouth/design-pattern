package com.narcos.designpattern.softwaredesignprinciple.dependicesinversion;

/**
 * 依赖倒置例子演示
 * 通过注入方式
 *
 * @author hbj
 * @date 2020/3/4 1:44 下午
 */
public class Narcos2 {
    private ICourse iCourse;

//    public Narcos2(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.studyCourse();
    }
}
