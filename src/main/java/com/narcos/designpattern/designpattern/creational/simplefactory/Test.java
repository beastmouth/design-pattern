package com.narcos.designpattern.designpattern.creational.simplefactory;

/**
 * 简单工厂模式
 *
 * @author hbj
 * @date 2020/3/6 10:01 下午
 */
public class Test {
    //    public static void main(String[] args) {
//        // 应用层需要依赖对应的具体实现类-例如此处应用层需要依赖JavaVideo
//        Video video = new JavaVideo();
//        video.produce();
//    }
//    public static void main(String[] args) {
//        // 应用层需要依赖对应的具体实现类-例如此处应用层需要依赖JavaVideo
//        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        if (video == null) {
//            return;
//        }
//        video.produce();
//    }
    public static void main(String[] args) {
        // 应用层需要依赖对应的具体实现类-例如此处应用层需要依赖JavaVideo
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if (video == null) {
            return;
        }
        video.produce();
    }
}
