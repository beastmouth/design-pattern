package com.narcos.designpattern.designpattern.structural.decorator.v2;

/**
 * @author hbj
 * @date 2020/3/13 10:16 上午
 */
public class Test {
    public static void main(String[] args) {
        AbstractBatterCake abstractBatterCake = new BatterCake();
        abstractBatterCake = new EggDecorator(abstractBatterCake);
        abstractBatterCake = new EggDecorator(abstractBatterCake);
        abstractBatterCake = new SausageDecorator(abstractBatterCake);
        System.out.println(abstractBatterCake.getDesc() + " 销售价格：" + abstractBatterCake.cost());
    }
}
