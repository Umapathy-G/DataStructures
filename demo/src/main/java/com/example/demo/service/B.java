package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B {

	private A beanA;
	
	@Autowired
	public void setA(A beanA) {
		this.beanA = beanA;
	}
	
}
