package com.te.springcoreannotationassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.te.springcoreannotationassignment.bean.Customer;
import com.te.springcoreannotationassignment.config.BothConfig;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext context=new AnnotationConfigApplicationContext(BothConfig.class);
		
		Customer customer = context.getBean(Customer.class);
		System.out.println(customer.getCid());
		System.out.println(customer.getCname());
		System.out.println(customer.getOrder().getOid());
		System.out.println(customer.getOrder().getOname());

	}

}
