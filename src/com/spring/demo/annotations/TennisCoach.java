package com.spring.demo.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired // directly getting the dependency here, it will b initialized directly on the field, happens java tech using reflection  
	@Qualifier("randomFortuneService") // since we have more than one fortune serve impl we need to specify the id for the bean to inject
	private FortuneService fortuneService; // can be injected even if its private,

	public TennisCoach()
	{
		System.out.println("Inside tennis Coach def constructor");
	}
	
	@PostConstruct
	public void postConstructForThisBean()
	{
		System.out.println("inside post construct of tennis bean");
	}

//	@Autowired // any method name injection
//	public void crazyMethodName(FortuneService fortuneService) {
//		System.out.println("Inside tennis Coach crazyMethodName");
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired // setter injection
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("Inside tennis Coach auto wired setter");
//		this.fortuneService = fortuneService;
//	}

//	@Autowired // Constructor injection of Fortune Service, right now there is only one impl of FortuneService hence it is calling that, if more than 
	// there will be something called @Qualifier annotation
//    public TennisCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "watch djocovic for 30 min everyday";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getFortune();
	}
	
	@PreDestroy
	public void preDestroyBeans()
	{
		System.out.println("inside pre destroy of tennis coach");
	}

}
