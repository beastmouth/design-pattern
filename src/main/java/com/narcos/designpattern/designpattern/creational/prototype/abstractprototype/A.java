package com.narcos.designpattern.designpattern.creational.prototype.abstractprototype;

/**
 * @author hbj
 * @date 2020/3/11 9:37 下午
 */
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
