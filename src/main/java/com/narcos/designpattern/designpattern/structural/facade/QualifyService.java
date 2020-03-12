package com.narcos.designpattern.designpattern.structural.facade;

/**
 * @author hbj
 * @date 2020/3/12 8:09 下午
 */
public class QualifyService {
    public boolean isAvailable(PointGift pointGift) {
        System.out.println("校验" + pointGift.getName() + " 积分资格通过，库存通过");
        return true;
    }
}
