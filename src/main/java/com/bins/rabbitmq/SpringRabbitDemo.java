package com.bins.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;

/**
 * Created by songrongbin on 2016/10/25.
 */
public class SpringRabbitDemo {
    public static void main(String[] args) throws InterruptedException {

        /*CachingConnectionFactory cf = new CachingConnectionFactory("192.168.199.121");
        // RabbitAdmin 的作用感觉就是想是 Channel
        RabbitAdmin admin = new RabbitAdmin(cf);

        // 声明 queue
        Queue queue = new Queue("liwei-spring-queue");
        admin.declareQueue(queue);

        // 声明交换器
        TopicExchange exchange = new TopicExchange("liweiExchange");
        admin.declareExchange(exchange);

        String routingKey = "foo.*";
        Binding binding = BindingBuilder.bind(queue).to(exchange).with(routingKey );
        admin.declareBinding(binding );


        /**
         * 设置监听和容器
         */
        /*SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(cf);
        Object listner  = new Object(){
            public void handleMessage(String foo){
                System.out.println("Object 内部的方法：" + foo);
            }
        };
        MessageListenerAdapter adapter = new MessageListenerAdapter(listner);
        container.setMessageListener(adapter);
        container.setQueueNames("liwei-spring-queue");
        container.start();

        // 发送消息
        RabbitTemplate template = new RabbitTemplate(cf);
        template.convertAndSend("liweiExchange","foo.bar","spring story");
        Thread.sleep(1000);
        container.stop();*/


    }
}
