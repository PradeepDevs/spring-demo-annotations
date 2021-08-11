package com.spring.demo.annotations;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;
@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		ArrayList<String> stringArray = new ArrayList<>();
		stringArray.add("laka");
		stringArray.add("laka");
		stringArray.add("laka");
		stringArray.add("enna");
		stringArray.add("rascala");
		stringArray.add("ennach");
		
		return stringArray.get(new Random().nextInt(stringArray.size()));	}
}
