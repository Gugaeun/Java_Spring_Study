package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mvcStudy.control.HelloSpringControl;
import mvcStudy.control.MemberRegisterController;

@Configuration
public class ControlConfig {
	
	@Bean
	public HelloSpringControl hellospringcontrol() {
		return new HelloSpringControl();
	}
	
	@Bean
	public MemberRegisterController memberRegisterController() {
		return new MemberRegisterController();
	}

}
