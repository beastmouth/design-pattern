package com.narcos.designpattern.softwaredesignprinciple.openclose;

/**
 * 演示开闭原则例子
 *
 * @author hbj
 * @date 2020/3/4 12:41 下午
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse2(96, "Java从零到企业级开发", 348d);
        JavaDiscountCourse2 javaCourse = (JavaDiscountCourse2) iCourse;
        // sout 是有锁的，在实际项目中尽量不用
//        System.out.println("课程ID：" + javaCourse.getId() + " 课程名称：" + javaCourse.getName() + " 课程原始价格：" + javaCourse.getOriginPrice() + " 课程折后价格：" + javaCourse.getPrice());
        System.out.println("课程ID：" + javaCourse.getId() + " 课程名称：" + javaCourse.getName() + " 课程原始价格：" + javaCourse.getPrice() + " 课程折后价格：" + javaCourse.getDiscountPrice());
    }
}
