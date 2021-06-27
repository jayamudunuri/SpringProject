package com.jaya.SpringSecurityGrocerySaleProject;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity

public class Sale {
	private Long id;
	private String item;
	private int quantity;
	private float amount;

	protected Sale() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	

	
	
	
	
	


}

