package com.narcos.designpattern.softwaredesignprinciple.liskovsubtitution.classrule;

/**
 * @author hbj
 * @date 2020/3/5 6:50 下午
 */
//public class Square extends Rectangle {
//    private long sideLength;
//
//    public long getSideLength() {
//        return sideLength;
//    }
//
//    public void setSideLength(long sideLength) {
//        this.sideLength = sideLength;
//    }
//
//    @Override
//    public long getLength() {
//        return getSideLength();
//    }
//
//    @Override
//    public void setLength(long length) {
//        setSideLength(length);
//    }
//
//    @Override
//    public long getWidth() {
//        return getSideLength();
//    }
//
//    @Override
//    public void setWidth(long width) {
//        setSideLength(width);
//    }
//}

public class Square implements Quadrangle {
    private long sideLength;

    public long getWidth() {
        return this.sideLength;
    }

    public long getLength() {
        return this.sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    public long getSideLength() {
        return sideLength;
    }
}