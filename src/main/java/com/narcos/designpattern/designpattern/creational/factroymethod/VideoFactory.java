package com.narcos.designpattern.designpattern.creational.factroymethod;

/**
 * 指定契约，并不指定产生哪一类的视频
 * 产生哪一类的视频由他的子类决定
 *
 * @author hbj
 * @date 2020/3/6 10:04 下午
 */
public abstract class VideoFactory {
    public abstract Video getVideo();
}
