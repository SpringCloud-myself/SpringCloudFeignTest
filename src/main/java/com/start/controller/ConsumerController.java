package com.start.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.start.Entity.User;
import com.start.service.ComputeClient;
import com.start.service.RefactorHelloService;

@RestController
public class ConsumerController {
	@Autowired
	ComputeClient computeClient;

	@RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
	public String HelloConsumer() {
		return computeClient.hello();
	}
	
	@RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
	public String HelloConsumer2() {
		StringBuilder sb = new StringBuilder();
		sb.append(computeClient.hello()).append("\n");
		sb.append(computeClient.hello("dd")).append("\n");
		sb.append(computeClient.hello("dd",30)).append("\n");
		sb.append(computeClient.hello(new User("dd", 20))).append("\n");
		return sb.toString();

	}
	
	@Autowired
	RefactorHelloService refactorHelloService;
	
	@RequestMapping(value="/feign-consumer3", method = RequestMethod.GET)
	public String helloConsumer3()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(refactorHelloService.hello("MM")).append("\n");
		sb.append(refactorHelloService.hello("MM",20)).append("\n");
		sb.append(refactorHelloService.hello(new com.start.Entity.User("mm",20))).append("\n");

		return sb.toString();
	}
	
	
}
