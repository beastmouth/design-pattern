package com.narcos.designpattern.designpattern.structural.decorator.v2;

/**
 * @author hbj
 * @date 2020/3/13 10:09 上午
 */
public class EggDecorator extends AbstractDecorator {

    public EggDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }

    @Override
    protected void doSomething() {
        System.out.println("打鸡蛋");
    }

}
