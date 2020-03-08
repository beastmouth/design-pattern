package com.narcos.designpattern.designpattern.creational.abstractfactory.video;

/**
 * @author hbj
 * @date 2020/3/8 3:43 下午
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Java课程视频");
    }
}
