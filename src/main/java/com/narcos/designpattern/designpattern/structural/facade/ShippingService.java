package com.narcos.designpattern.designpattern.structural.facade;

/**
 * @author hbj
 * @date 2020/3/12 8:12 下午
 */
public class ShippingService {
    public String shipGift(PointGift pointGift) {
        // 物流系统的对接逻辑
        System.out.println(pointGift.getName() + "进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}
