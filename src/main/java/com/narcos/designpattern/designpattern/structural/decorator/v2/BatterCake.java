package com.narcos.designpattern.designpattern.structural.decorator.v2;

/**
 * @author hbj
 * @date 2020/3/13 9:55 上午
 */
public class BatterCake extends AbstractBatterCake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
