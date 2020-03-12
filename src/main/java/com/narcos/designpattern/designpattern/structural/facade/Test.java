package com.narcos.designpattern.designpattern.structural.facade;

/**
 * @author hbj
 * @date 2020/3/12 8:21 下午
 */
public class Test {
    public static void main(String[] args) {
        PointGift pointGift = new PointGift("PS4");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
//        giftExchangeService.setQualifyService(new QualifyService());
//        giftExchangeService.setPointPaymentService(new PointPaymentService());
//        giftExchangeService.setShippingService(new ShippingService());
        giftExchangeService.giftExchange(pointGift);
    }
}
