package com.narcos.designpattern.softwaredesignprinciple.liskovsubtitution.classrule;

/**
 * @author hbj
 * @date 2020/3/5 6:55 下午
 */
public class Test {
//    public static void resize(Rectangle rectangle) {
//        while (rectangle.getWidth() <= rectangle.getLength()) {
//            rectangle.setWidth(rectangle.getWidth() + 1);
//            System.out.println("width : " + rectangle.getWidth() + " length : " + rectangle.getLength());
//        }
//        System.out.println("resize 方法结束 width : " + rectangle.getWidth() + " length : " + rectangle.getLength());
//    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("width : " + rectangle.getWidth() + " length : " + rectangle.getLength());
        }
        System.out.println("resize 方法结束 width : " + rectangle.getWidth() + " length : " + rectangle.getLength());
    }

//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(10);
//        rectangle.setLength(20);
//        resize(rectangle);
//    }

    public static void main(String[] args) {
//        Square square = new Square();
//        square.setWidth(10);
//        resize(square);
    }
}
