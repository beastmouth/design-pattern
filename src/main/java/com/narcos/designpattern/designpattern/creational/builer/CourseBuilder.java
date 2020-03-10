package com.narcos.designpattern.designpattern.creational.builer;

/**
 * @author hbj
 * @date 2020/3/10 2:05 下午
 */
public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);

    public abstract void buildCoursePPT(String coursePPT);

    public abstract void buildCourseVideo(String courseVideo);

    public abstract void buildCourseArticle(String courseArticle);

    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
