package com.narcos.designpattern.designpattern.creational.prototype;

/**
 * @author hbj
 * @date 2020/3/11 9:14 下午
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Mail mail = new Mail();
        mail.setContent("初始化模版");
//        for (int i = 0; i < 10; i++) {
//            // 假设Mail初始化十分麻烦，性能消耗大，又需要在for循环里面反复创建
//            // 此时就需要原型模式
//            mail.setName("姓名" + i);
//            mail.setEmailAddress("姓名" + i + "@immoc.com");
//            mail.setContent("恭喜您，此次慕课网中奖了");
//            MailUtil.sendMail(mail);
//        }

        // 利用原型模式
        System.out.println("初始化Mail:" + mail.toString());
        for (int i = 0; i < 10; i++) {
            Mail mailTemp = (Mail) mail.clone();
            mailTemp.setName("姓名" + i);
            mailTemp.setEmailAddress("姓名" + i + "@immoc.com");
            mailTemp.setContent("恭喜您，此次慕课网中奖了");
            System.out.println("第" + i + "次克隆完成后Mail:" + mailTemp.toString());
            MailUtil.sendMail(mailTemp);
        }

        MailUtil.saveOriginMail(mail);
    }
}
