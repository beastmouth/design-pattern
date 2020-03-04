package com.narcos.designpattern.softwaredesignprinciple.dependicesinversion;

/**
 * 依赖倒置例子演示
 * 该类注释代码就属于面向实现编程
 *
 * @author hbj
 * @date 2020/3/4 1:44 下午
 */
public class Narcos {
//    public void studyJavaCourse() {
//        System.out.println("Narcos在学习Java课程");
//    }
//
//    public void studyFECourse() {
//        System.out.println("Narcos在学习前端课程");
//    }
//
//    public void studyPythonCourse() {
//        System.out.println("Narcos在学习Python课程");
//    }

    public void studyCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }
}
