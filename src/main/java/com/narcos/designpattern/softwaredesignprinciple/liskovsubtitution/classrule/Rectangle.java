package com.narcos.designpattern.softwaredesignprinciple.liskovsubtitution.classrule;

/**
 * @author hbj
 * @date 2020/3/5 6:49 下午
 */
public class Rectangle implements Quadrangle {
    private long length;
    private long width;

    public long getWidth() {
        return width;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
