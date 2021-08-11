package com.spring.demo.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Value("${foo.name}")
	private String name;

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 15 mins ";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
