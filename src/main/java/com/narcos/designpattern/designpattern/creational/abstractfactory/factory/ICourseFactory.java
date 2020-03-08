package com.narcos.designpattern.designpattern.creational.abstractfactory.factory;

import com.narcos.designpattern.designpattern.creational.abstractfactory.article.Article;
import com.narcos.designpattern.designpattern.creational.abstractfactory.sourcecode.SourceCode;
import com.narcos.designpattern.designpattern.creational.abstractfactory.video.Video;

/**
 * @author hbj
 * @date 2020/3/8 3:39 下午
 */
public interface ICourseFactory {
    Video getVideo();

    Article getArticle();

    default SourceCode getSourceCode() {
        return null;
    }
}
