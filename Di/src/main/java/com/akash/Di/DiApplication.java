package com.akash.Di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		
		//DI
		ApplicationContext context = SpringApplication.run(DiApplication.class, args);
		
		First first = context.getBean(First.class);
		first.build();

		//constructor DI

		Second second = new Second();
		
		Third third = new Third(second);
		third.said();

		//Di using setters!
		Set set = new Set();
		setTo to = new setTo();
		to.setSetTo(set);
		to.ok();

		
		


	}

}
