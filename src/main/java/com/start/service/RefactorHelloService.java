package com.start.service;

import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value="compute-service")
public interface RefactorHelloService extends com.start.service.HelloService{

}
