package com.spring.demo.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.spring.demo.annotations") if we uncomment this line spring will scan for all the beans that are present in this package, 
//here we want to use these 2 beans that we have declared
@PropertySource("classpath:sport.properties")
public class SportConfig 
{
	//define methods to expose your beans
	@Bean
	public FortuneService sadFortuneService()// method name is the bean id
	{
		return new SadFortuneService();
	}
	
	//inject that bean to your swim coach
	@Bean
	public Coach swimCoach()
	{
		return new SwimCoach(sadFortuneService());// taking reference from above bean
	}
	

}
