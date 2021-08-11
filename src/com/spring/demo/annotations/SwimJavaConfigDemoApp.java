package com.spring.demo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config file 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		// get the bean from spring container 
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		//call method on bean
		System.out.println(theCoach.getName());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getDailyWorkout());
		//get daily fortune
		System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();
	}
}