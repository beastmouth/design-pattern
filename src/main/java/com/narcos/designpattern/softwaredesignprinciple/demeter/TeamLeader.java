package com.narcos.designpattern.softwaredesignprinciple.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则
 *
 * @author hbj
 * @date 2020/3/4 8:02 下午
 */
public class TeamLeader {
    public void checkNumberOfCourse(List<Course> courseList) {
        System.out.println("在线课程的数量为" + courseList.size());
    }

    public void checkNumberOfCourse() {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量为" + courseList.size());
    }
}
