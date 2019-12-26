package com.zj.kafka_product.model.order;

import com.google.protobuf.InvalidProtocolBufferException;

public class Order {

	private int id;
	
	private String name;
	
	private double price;
	
	public Order() {
		
	}
	public Order(byte[] bytes) {
		try {
			OrderProto.Order order = OrderProto.Order.parseFrom(bytes);
			this.id = order.getId();
			this.name = order.getName();
			this.price = order.getPrice();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
	
	public byte[] encode() {
		OrderProto.Order.Builder builder = OrderProto.Order.newBuilder();
		builder.setId(id);
		builder.setName(name);
		builder.setPrice(price);
		return builder.build().toByteArray();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
