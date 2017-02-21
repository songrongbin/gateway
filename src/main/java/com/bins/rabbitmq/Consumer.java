package com.bins.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by songrongbin on 2016/10/25.
 */
public class Consumer {
    private static ApplicationContext context;

    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("rabbit-context.xml");
        AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);
        String receiveStr = (String) amqpTemplate.receiveAndConvert("helloworld.queue");
        System.out.println(receiveStr);

    }
}
