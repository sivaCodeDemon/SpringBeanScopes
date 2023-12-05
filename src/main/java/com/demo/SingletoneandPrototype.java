package com.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*
 * This scope annotation used for the prototypr bean scope of a springclass 
 * prototype is used to create a new instances when trigger the request 
 */
//@Scope("prototype")
public class SingletoneandPrototype {

	/*
	 * This is the singleton bean scope once you  
	 * hit the request only one single instance are been created 
	 */
	public SingletoneandPrototype() {
		System.out.println("This is from the singletonInstance!!!!!!");
	}
}
