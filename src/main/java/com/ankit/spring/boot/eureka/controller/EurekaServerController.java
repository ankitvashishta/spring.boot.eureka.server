package com.ankit.spring.boot.eureka.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eureka.server")
@CrossOrigin
public class EurekaServerController {
	@GetMapping("/server")
	public String getEurekaServer() {
		return "This is Eureka Server.";
	}

}
