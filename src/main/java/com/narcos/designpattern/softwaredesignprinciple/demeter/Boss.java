package com.narcos.designpattern.softwaredesignprinciple.demeter;

/**
 * 迪米特法则
 *
 * @author hbj
 * @date 2020/3/4 8:02 下午
 */
public class Boss {
    public void commandCheckCourseNum(TeamLeader teamLeader) {
        // boss 和 teamLeader 是朋友关系
        // boss 和 course 不是朋友关系 ==》 boss 和 course 不应该发生交流，当前写法违背了这种关系
//        List<Course> courseList = new ArrayList<Course>();
//        for (int i = 0; i < 20; i++) {
//            courseList.add(new Course());
//        }
        teamLeader.checkNumberOfCourse();
    }
}
