package com.narcos.designpattern.designpattern.structural.decorator.v1;

/**
 * @author hbj
 * @date 2020/3/13 9:59 上午
 */
public class Test {
    public static void main(String[] args) {
        BatterCake batterCake = new BatterCake();
        System.out.println(batterCake.getDesc() + " 销售价格：" + batterCake.cost());
        BatterCakeWithEgg batterCakeWithEgg = new BatterCakeWithEgg();
        System.out.println(batterCakeWithEgg.getDesc() + " 销售价格：" + batterCakeWithEgg.cost());
        BatterCakeWithEggSausage batterCakeWithEggSausage = new BatterCakeWithEggSausage();
        System.out.println(batterCakeWithEggSausage.getDesc() + " 销售价格：" + batterCakeWithEggSausage.cost());

    }
}
