package com.spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortune implements FortuneService {
	
	@Override
	public String getFortune() 
	{
		return "Happy happy service";
	}

}
