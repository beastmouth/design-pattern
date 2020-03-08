package com.narcos.designpattern.designpattern.creational.abstractfactory.article;

/**
 * @author hbj
 * @date 2020/3/8 3:49 下午
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Python课程手记");
    }
}
