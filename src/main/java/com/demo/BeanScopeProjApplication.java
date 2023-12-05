package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * @author  sivaK
 */
@SpringBootApplication
public class BeanScopeProjApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(BeanScopeProjApplication.class, args);
		
		SingletoneandPrototype scope  =	context.getBean(SingletoneandPrototype.class);
		SingletoneandPrototype scope1 =	context.getBean(SingletoneandPrototype.class);
		SingletoneandPrototype scope2 =	context.getBean(SingletoneandPrototype.class);
	}

}
