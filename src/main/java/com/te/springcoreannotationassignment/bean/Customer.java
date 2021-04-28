package com.te.springcoreannotationassignment.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Customer {

	private int cid;
	
	private String cname;
	
	@Autowired(required = false)
	@Qualifier("FF")
	private Order order;
	
public Customer() {
		
	}

   public Customer(int cid, String cname, Order order) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.order = order;
}





	public int getCid() {
		return cid;
	}

	
	public void setCid(int cid) {
		this.cid = cid;
	}

	
	public String getCname() {
		return cname;
	}

	
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	
	
}
