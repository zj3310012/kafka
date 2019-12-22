package com.zj.kafka_consumer.model.user;

import com.google.protobuf.InvalidProtocolBufferException;

public class User {

	private int id;
	
	private String name;
	
	private String email;
	
	private String age;
	
	public User() {}
	
	public User(byte[] bytes) {
		try {
			//将字节数组转换为UserProto.User对象
			UserProto.User user = UserProto.User.parseFrom(bytes);
			//UserProto.User对象转化为自己的User对象
			this.id = user.getId();
			this.name = user.getName();
			this.email = user.getEmail();
			this.age = user.getAge();
		} catch (InvalidProtocolBufferException e) {
			e.printStackTrace();
		}
	}
	
	public byte[] encode() {
		UserProto.User.Builder builder = UserProto.User.newBuilder();
		builder.setId(id);
		builder.setName(name);
		builder.setEmail(email);
		builder.setAge(age);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
}
