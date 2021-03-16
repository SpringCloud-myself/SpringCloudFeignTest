package com.start.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.start.Entity.User;
import com.start.service.impl.ComputeClientHystrix;

@FeignClient(value	=	"compute-service", fallback = ComputeClientHystrix.class)
public interface ComputeClient {
	@RequestMapping(method = RequestMethod.GET, value = "/hello")
	String hello();
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello1")
	String hello(@RequestParam("name") String name);
	
	@RequestMapping(method = RequestMethod.GET, value = "/hello2")
	User hello(@RequestHeader("name") String name, @RequestHeader("age") int age);
	
	@RequestMapping(method = RequestMethod.POST, value = "/hello3")
	String hello(@RequestBody User user);
}
