package com.akash.Di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		
		//DI
		ConfigurableApplicationContext context = SpringApplication.run(DiApplication.class, args);

		First first = context.getBean(First.class);
		first.build();
        context.close();

		//constructor DI

		Second second = new Second();
		
		Third third = new Third(second);
		third.said();

		//Di using setters!
		Set set = new Set();
		setTo to = new setTo();
		to.setSetTo(set);
		to.ok();

        //Constuctor DI

        ApplicationContext context1 = SpringApplication.run(DiApplication.class,args);
        Thrid thrid = context1.getBean(Thrid.class);
        thrid.stDisplay();

		
		


	}

}
