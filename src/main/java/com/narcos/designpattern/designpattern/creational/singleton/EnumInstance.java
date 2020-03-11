package com.narcos.designpattern.designpattern.creational.singleton;

/**
 * @author hbj
 * @date 2020/3/11 1:59 下午
 */
public enum EnumInstance {
    INSTANCE {
        @Override
        protected void printTest() {
            System.out.println("我是枚举类声明的方法");
        }
    };
    private Object data;

    protected abstract void printTest();

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
