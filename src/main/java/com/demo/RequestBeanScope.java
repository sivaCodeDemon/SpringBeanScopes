package com.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import lombok.Getter;
import lombok.Setter;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestBeanScope {

	@Getter
	@Setter
	private String message;
	
	
	public RequestBeanScope() {
		System.out.println("This is my request bean scope method");
		this.message="This is my request bean scope method";
	}
}
