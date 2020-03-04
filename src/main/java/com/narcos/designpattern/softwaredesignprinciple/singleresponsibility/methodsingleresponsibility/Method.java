package com.narcos.designpattern.softwaredesignprinciple.singleresponsibility.methodsingleresponsibility;

/**
 * 单一职责-方法的单一职责
 *
 * @author hbj
 * @date 2020/3/4 5:51 下午
 */
public class Method {
    public void updateUserInfo(String username, String address) {
        // 更新用户名的操作
        // 更新用户地址的操作
    }

    public void updateUserInfo(String username, String... repositories) {
        // 更新用户名的操作
        // 更新用户的其他信息操作
    }

    public void updateUserInfo(String username, String address, Boolean bool) {
        if (bool) {
            // 更新用户名的操作
        } else {
            // 更新用户地址的操作
        }
    }

    /**
     * 以上的方法都不遵循方法的单一原则
     * 例如第三个可以拆分成以下两个
     */
    public void updateUsername(String username) {
        // 更新用户名
    }

    public void updateUserAddress(String address) {
        // 更新用户地址
    }
}
