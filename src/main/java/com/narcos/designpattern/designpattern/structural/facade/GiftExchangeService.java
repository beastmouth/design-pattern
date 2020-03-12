package com.narcos.designpattern.designpattern.structural.facade;

/**
 * @author hbj
 * @date 2020/3/12 8:15 下午
 */
public class GiftExchangeService {
    private QualifyService qualifyService = new QualifyService();
    private PointPaymentService pointPaymentService = new PointPaymentService();
    private ShippingService shippingService = new ShippingService();

//    public void setQualifyService(QualifyService qualifyService) {
//        this.qualifyService = qualifyService;
//    }
//
//    public void setPointPaymentService(PointPaymentService pointPaymentService) {
//        this.pointPaymentService = pointPaymentService;
//    }
//
//    public void setShippingService(ShippingService shippingService) {
//        this.shippingService = shippingService;
//    }

    public void giftExchange(PointGift pointGift) {
        if (!qualifyService.isAvailable(pointGift)) {
            return;
        }
        if (!pointPaymentService.pay(pointGift)) {
            return;
        }
        String shipGift = shippingService.shipGift(pointGift);
        System.out.println("物流系统下单成功，订单号为：" + shipGift);
    }
}
