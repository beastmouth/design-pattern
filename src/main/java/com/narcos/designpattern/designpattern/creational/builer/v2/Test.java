package com.narcos.designpattern.designpattern.creational.builer.v2;

/**
 * @author hbj
 * @date 2020/3/10 5:07 下午
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .courseName("Java设计模式精讲")
                .coursePPT("Java设计模式精讲ppt")
//                .courseVideo("Java设计模式精讲视频")
//                .courseArticle("Java设计模式精讲手记")
                .courseQA("Java设计模式精讲问答")
                .build();
        System.out.println(course.toString());
    }
}
