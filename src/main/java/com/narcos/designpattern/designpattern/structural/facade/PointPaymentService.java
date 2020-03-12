package com.narcos.designpattern.designpattern.structural.facade;

/**
 * @author hbj
 * @date 2020/3/12 8:11 下午
 */
public class PointPaymentService {
    public boolean pay(PointGift pointGift) {
        // 扣减积分
        System.out.println("支付" + pointGift.getName() + "积分成功");
        return true;
    }
}
