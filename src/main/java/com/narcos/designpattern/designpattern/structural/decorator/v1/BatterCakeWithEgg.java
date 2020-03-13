package com.narcos.designpattern.designpattern.structural.decorator.v1;

/**
 * @author hbj
 * @date 2020/3/13 9:55 上午
 */
public class BatterCakeWithEgg extends BatterCake {
    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
