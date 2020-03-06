package com.narcos.designpattern.designpattern.creational.simplefactory;

/**
 * @author hbj
 * @date 2020/3/6 10:00 下午
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python视频");
    }
}
