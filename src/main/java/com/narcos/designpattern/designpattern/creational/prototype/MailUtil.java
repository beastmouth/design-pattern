package com.narcos.designpattern.designpattern.creational.prototype;

import java.text.MessageFormat;

/**
 * @author hbj
 * @date 2020/3/11 9:10 下午
 */
public class MailUtil {
    public static void sendMail(Mail mail) {
        String outputContent = "向同学{0}，邮件地址：{1}，邮件内容：{2}，发送邮件成功";
        System.out.println(MessageFormat.format(outputContent, mail.getName(), mail.getEmailAddress(), mail.getContent()));
    }

    public static void saveOriginMail(Mail mail) {
        System.out.println("存储originMail记录，originMail：" + mail.getContent());
    }
}
