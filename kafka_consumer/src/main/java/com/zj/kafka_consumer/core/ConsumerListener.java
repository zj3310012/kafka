package com.zj.kafka_consumer.core;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.zj.kafka_consumer.model.user.User;

@Component
public class ConsumerListener {

    @KafkaListener(topics = "zj")
    public void onMessage(byte[] message){
        //insertIntoDb(buffer);//这里为插入数据库代码
    	User user = new User(message);
        System.out.println(JSON.toJSONString(user));
    }
}
