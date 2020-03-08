package com.narcos.designpattern.designpattern.creational.abstractfactory.video;

/**
 * @author hbj
 * @date 2020/3/8 3:49 下午
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程视频");
    }
}
