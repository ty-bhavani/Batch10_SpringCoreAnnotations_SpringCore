package com.te.springcoreannotationassignment.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.springcoreannotationassignment.bean.Customer;

@Configuration
public class CustomerConfig {

	@Bean
	@Autowired(required = false)
	public Customer getCustomer(){
	Customer customer=new Customer();
	customer.setCid(894);
	customer.setCname("Bhavani");
	return customer;
   }
}
