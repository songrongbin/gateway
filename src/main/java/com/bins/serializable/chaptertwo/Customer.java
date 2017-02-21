package com.bins.serializable.chaptertwo;

import java.io.Serializable;

class Customer implements Serializable {
    /**
     * Customer类中定义的serialVersionUID(序列化版本号)
     */
    private static final long serialVersionUID = -5182532647273106745L;
    private String name;
    private int age;

    //新添加的sex属性
    private String sex;
    
    /*public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }*/
    
    public Customer(String name, int age,String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /*
     * @MethodName toString
     * @Description 重写Object类的toString()方法
     * @author xudp
     * @return string
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "name=" + name + ", age=" + age + ", sex=" + sex;
    }
}