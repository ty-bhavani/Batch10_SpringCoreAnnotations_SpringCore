package com.te.springcoreannotationassignment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.te.springcoreannotationassignment.bean.Order;

@Configuration
public class OrderConfig {
	@Bean("FF")
	public Order getOrder(){
	
	Order order=new Order();
	order.setOid(1454);
	order.setOname("FrenchFires");
	return order;
	}



	@Bean("CL")
	public Order getOrder2(){
	
	Order order=new Order();
	order.setOid(8876);
	order.setOname("ChocoLava");
	return order;

        }
	}
