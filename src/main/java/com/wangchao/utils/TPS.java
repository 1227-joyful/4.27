package com.wangchao.utils;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TPS {
	
	private BigInteger id;
	
	private String name;
	
	private int age;
	
	private BigDecimal price;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	
	//÷ÿ–¥tostring
	@Override
	public String toString() {
		return "TPS [id=" + id + ", name=" + name + ", age=" + age + ", price="
				+ price + "]";
	}
	
	

}
