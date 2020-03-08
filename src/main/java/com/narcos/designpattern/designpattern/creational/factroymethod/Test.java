package com.narcos.designpattern.designpattern.creational.factroymethod;

/**
 * @author hbj
 * @date 2020/3/6 10:01 下午
 */
public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();
    }
}
