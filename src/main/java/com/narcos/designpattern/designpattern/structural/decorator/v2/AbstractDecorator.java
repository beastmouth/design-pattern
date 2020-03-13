package com.narcos.designpattern.designpattern.structural.decorator.v2;

/**
 * @author hbj
 * @date 2020/3/13 10:07 上午
 */
public abstract class AbstractDecorator extends AbstractBatterCake {

    private AbstractBatterCake abstractBatterCake;

    public AbstractDecorator(AbstractBatterCake abstractBatterCake) {
        this.abstractBatterCake = abstractBatterCake;
    }

    @Override
    protected String getDesc() {
        return this.abstractBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.abstractBatterCake.cost();
    }

    // 此时之所以会用抽象的装饰者，是因为在不同的实现类里面还有特定的动作
    protected abstract void doSomething();
}
