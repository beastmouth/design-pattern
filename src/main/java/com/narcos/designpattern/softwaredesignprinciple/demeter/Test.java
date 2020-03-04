package com.narcos.designpattern.softwaredesignprinciple.demeter;

/**
 * 迪米特法则
 *
 * @author hbj
 * @date 2020/3/4 8:07 下午
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckCourseNum(teamLeader);
    }
}
