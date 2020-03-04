package com.narcos.designpattern.softwaredesignprinciple.dependicesinversion;

/**
 * 依赖倒置例子演示
 * test属于高层模块
 * Narcos实现了跟高层模块和具体的课程模块解耦
 * 只与ICourse耦合
 * 体现了高内聚低耦合
 *
 * @author hbj
 * @date 2020/3/4 1:45 下午
 */
public class Test {
    public static void main(String[] args) {
//        v1
//        Narcos narcos = new Narcos();
//        narcos.studyJavaCourse();
//        narcos.studyFECourse();

//        v2
//        Narcos narcos = new Narcos();
//        narcos.studyCourse(new JavaCourse());
//        narcos.studyCourse(new FECourse());
//        narcos.studyCourse(new PythonCourse());

//        v3
//        Narcos2 narcos = new Narcos2(new JavaCourse());
//        narcos.studyCourse();

//        v4
        Narcos2 narcos = new Narcos2();
        narcos.setiCourse(new JavaCourse());
        narcos.studyCourse();
        narcos.setiCourse(new PythonCourse());
        narcos.studyCourse();
    }
}
