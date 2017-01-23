package com.hello.dal.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Product {
	@NotNull(message="champ obligatoire")
	public Long id;
    @Size(min=5)
	public String desc;
    @NotNull
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
