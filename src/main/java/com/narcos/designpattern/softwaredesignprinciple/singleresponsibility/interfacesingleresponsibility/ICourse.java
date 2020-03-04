package com.narcos.designpattern.softwaredesignprinciple.singleresponsibility.interfacesingleresponsibility;

/**
 * 单一职责-接口的单一职责（此处不遵循接口的单一职责）
 *
 * @author hbj
 * @date 2020/3/4 5:45 下午
 */
public interface ICourse {
    /**
     * 上面两个方法负责获取课程的信息
     */
    String getCourseName();

    String getCourseVideo();

    /**
     * 下面两个方法负责管理课程
     */
    void studyCourse();

    void refundCourse();
}
