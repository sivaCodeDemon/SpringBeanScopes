package com.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import lombok.Getter;
import lombok.Setter;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionBeanScope {
	
	@Setter
	@Getter
	private String message;

	public SessionBeanScope() {
		System.out.println("This is the session bean scope.");
		this.message="This is my session scope bean";
	}
}
