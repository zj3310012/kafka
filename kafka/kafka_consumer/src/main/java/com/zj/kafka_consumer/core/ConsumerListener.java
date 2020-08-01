package com.zj.kafka_consumer.core;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.zj.kafka_consumer.model.order.Order;

@Component
public class ConsumerListener {

    @KafkaListener(topics = "zj")
    public void onMessage(byte[] message){
        //insertIntoDb(buffer);//这里为插入数据库代码
    	Order order = new Order(message);
        System.out.println(JSON.toJSONString(order));
    }
}
