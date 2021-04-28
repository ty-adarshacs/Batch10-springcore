package com.tyss.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.bean.Engine;
@Configuration
public class EngineConfig {
	
	@Bean
	public Engine getEbgine() {
		Engine engine=new Engine();
		engine.setCc(100);
		engine.setType("petrol");
		return engine;
	}

}
