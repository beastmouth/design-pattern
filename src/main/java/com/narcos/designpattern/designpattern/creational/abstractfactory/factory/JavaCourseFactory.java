package com.narcos.designpattern.designpattern.creational.abstractfactory.factory;

import com.narcos.designpattern.designpattern.creational.abstractfactory.article.Article;
import com.narcos.designpattern.designpattern.creational.abstractfactory.article.JavaArticle;
import com.narcos.designpattern.designpattern.creational.abstractfactory.sourcecode.JavaSourceCode;
import com.narcos.designpattern.designpattern.creational.abstractfactory.sourcecode.SourceCode;
import com.narcos.designpattern.designpattern.creational.abstractfactory.video.JavaVideo;
import com.narcos.designpattern.designpattern.creational.abstractfactory.video.Video;

/**
 * @author hbj
 * @date 2020/3/8 3:43 下午
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }

    @Override
    public SourceCode getSourceCode() {
        return new JavaSourceCode();
    }
}
