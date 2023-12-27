package com.rndayala.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configure {

	public Configure() {
		System.out.println("Instantiating Configure object..");
	}
	
	@Bean
	public Password generateAlgo() {
		Password p = new Password("SHA1");
		return p;
	}
}
