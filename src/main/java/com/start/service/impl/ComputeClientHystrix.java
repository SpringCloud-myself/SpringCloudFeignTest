package com.start.service.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.start.Entity.User;
import com.start.service.ComputeClient;

@Component
public class ComputeClientHystrix implements ComputeClient {

	public String hello() {
		return "null";
	}

	public String hello(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public User hello(String name, int age) {
		// TODO Auto-generated method stub
		return null;
	}

	public String hello(User user) {
		// TODO Auto-generated method stub
		return null;
	}
}
