package com.zj.kafka_product.serializer;

import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;

import com.zj.kafka_product.model.order.Order;

public class OrderSerializer implements Serializer<Order>{

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configure(Map<String, ?> arg0, boolean arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public byte[] serialize(String arg0, Order order) {
		return order.encode();
	}

}
