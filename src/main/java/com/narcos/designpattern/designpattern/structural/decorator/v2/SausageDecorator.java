package com.narcos.designpattern.designpattern.structural.decorator.v2;

/**
 * @author hbj
 * @date 2020/3/13 10:13 上午
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(AbstractBatterCake abstractBatterCake) {
        super(abstractBatterCake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }

    @Override
    protected void doSomething() {
        System.out.println("切香肠");
    }

}
