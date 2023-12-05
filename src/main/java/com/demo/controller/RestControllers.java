package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.RequestBeanScope;
import com.demo.SessionBeanScope;

@RestController
@RequestMapping(path = "api")
public class RestControllers {

	
	@Autowired
	private RequestBeanScope scope;
	
	
	@Autowired
	private SessionBeanScope beanScope;
	
	@GetMapping("/message")
	public String getMessages() {
		return scope.getMessage();
	}
	
	
	@GetMapping("/beanmessage")
	public String getBeanMessages() {
		return beanScope.getMessage();
	}
}
