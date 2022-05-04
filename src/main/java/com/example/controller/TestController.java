package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	    
	    @RequestMapping(value = "/hello welcome to springboot")
		public String helloMethod() {
			return "hello ..";
		}
}
