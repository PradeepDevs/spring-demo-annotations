package com.spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		// get the bean from spring container 
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		//call method on bean
		System.out.println(theCoach.getDailyWorkout());
		//get daily fortune
		System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();
	}

}
