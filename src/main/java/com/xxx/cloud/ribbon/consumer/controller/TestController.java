package com.xxx.cloud.ribbon.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class TestController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("ribbon-consume")
	public String consume() {
		log.info("call");
		return restTemplate.getForEntity("http://eureka-client1/hello", String.class).getBody();
	}

}
