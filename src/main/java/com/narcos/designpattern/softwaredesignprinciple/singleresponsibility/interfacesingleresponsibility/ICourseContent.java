package com.narcos.designpattern.softwaredesignprinciple.singleresponsibility.interfacesingleresponsibility;

/**
 * 单一职责-接口的单一职责（只负责管理课程的基本信息）
 *
 * @author hbj
 * @date 2020/3/4 5:49 下午
 */
public interface ICourseContent {
    String getCourseName();

    String getCourseVideo();
}
