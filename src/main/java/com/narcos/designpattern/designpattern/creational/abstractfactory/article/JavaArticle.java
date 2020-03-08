package com.narcos.designpattern.designpattern.creational.abstractfactory.article;

/**
 * @author hbj
 * @date 2020/3/8 3:44 下午
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写Java课程手记");
    }
}
