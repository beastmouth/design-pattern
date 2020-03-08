package com.narcos.designpattern.designpattern.creational.abstractfactory.factory;

import com.narcos.designpattern.designpattern.creational.abstractfactory.article.Article;
import com.narcos.designpattern.designpattern.creational.abstractfactory.article.PythonArticle;
import com.narcos.designpattern.designpattern.creational.abstractfactory.video.PythonVideo;
import com.narcos.designpattern.designpattern.creational.abstractfactory.video.Video;

/**
 * @author hbj
 * @date 2020/3/8 3:48 下午
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
