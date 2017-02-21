package com.bins.zk;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
public class Startup {
 
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:gateway-context.xml");
    }
 
}