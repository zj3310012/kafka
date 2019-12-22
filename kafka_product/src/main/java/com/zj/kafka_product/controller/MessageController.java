package com.zj.kafka_product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zj.kafka_product.model.user.User;

@RestController
public class MessageController {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	@PostMapping("/message/send")
	public boolean send(@RequestBody User user) {
		kafkaTemplate.send("zj", user);
		return true;
	}
}
