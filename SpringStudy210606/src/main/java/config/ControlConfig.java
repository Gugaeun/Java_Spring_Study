package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mvcStudy.HelloSpringControl;

@Configuration
public class ControlConfig {
	
	@Bean
	public HelloSpringControl hellospringcontrol() {
		return new HelloSpringControl();
	}

}
