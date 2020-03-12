package com.narcos.designpattern.designpattern.creational.prototype.clone;

import java.util.Date;

/**
 * @author hbj
 * @date 2020/3/11 9:39 下午
 */
public class Pig implements Cloneable {
    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        // 默认实现的方式是浅克隆，例如此处clone之后，birthday，克隆后的和克隆前的使用的是同一个birthday对象
//        return super.clone();
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        // 深克隆
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }
}

