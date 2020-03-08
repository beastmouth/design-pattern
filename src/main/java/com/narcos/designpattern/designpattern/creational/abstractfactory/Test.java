package com.narcos.designpattern.designpattern.creational.abstractfactory;

import com.narcos.designpattern.designpattern.creational.abstractfactory.article.Article;
import com.narcos.designpattern.designpattern.creational.abstractfactory.factory.ICourseFactory;
import com.narcos.designpattern.designpattern.creational.abstractfactory.factory.JavaCourseFactory;
import com.narcos.designpattern.designpattern.creational.abstractfactory.factory.PythonCourseFactory;
import com.narcos.designpattern.designpattern.creational.abstractfactory.sourcecode.SourceCode;
import com.narcos.designpattern.designpattern.creational.abstractfactory.video.Video;

/**
 * @author hbj
 * @date 2020/3/8 4:00 下午
 */
public class Test {
    public static void main(String[] args) {
        ICourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        Video video = courseFactory.getVideo();
        SourceCode sourceCode = courseFactory.getSourceCode();
        article.produce();
        video.produce();
        sourceCode.produce();

        ICourseFactory courseFactory2 = new PythonCourseFactory();
        Article article2 = courseFactory2.getArticle();
        Video video2 = courseFactory2.getVideo();
        SourceCode sourceCode2 = courseFactory2.getSourceCode();
        article2.produce();
        video2.produce();
        if (sourceCode2 != null) {
            sourceCode2.produce();
        }
    }
}
