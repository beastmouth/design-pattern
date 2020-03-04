package com.narcos.designpattern.softwaredesignprinciple.singleresponsibility.interfacesingleresponsibility;

/**
 * 单一职责-接口的单一职责（同时实现两个接口）
 *
 * @author hbj
 * @date 2020/3/4 5:49 下午
 */
public class Course implements ICourseContent, ICourseManage {
    public String getCourseName() {
        return null;
    }

    public String getCourseVideo() {
        return null;
    }

    public void studyCourse() {

    }

    public void refundCourse() {

    }
}
