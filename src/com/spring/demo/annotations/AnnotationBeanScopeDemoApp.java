package com.spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) 
	{
		//get the context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		// get the bean from spring container 
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach	 = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach == alphaCoach);
		System.out.println("Memory Location for theCoach" + theCoach);
		System.out.println("Memory Location for alphaCoach" + alphaCoach);
		//close the context
		context.close();


	}

}
