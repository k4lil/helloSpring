package com.hello.dal.models;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	public Long id;
	public String desc;
	public long quantity;
	/* Constructor */
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(Long pId, String pDesc, Long pQuanitity) {
		this.id = pId;
		this.desc = pDesc;
		this.quantity = pQuanitity;
	}
	/* Getters & Setters */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
}
