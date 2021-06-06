package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mvcStudy.control.HelloSpringControl;
import mvcStudy.control.MemberRegisterController;
import springmvc.service.MemberRegisterService;

@Configuration
public class ControlConfig {
	
	@Autowired
	private MemberRegisterService memberRegSvc;
	
	@Bean
	public HelloSpringControl hellospringcontrol() {
		return new HelloSpringControl();
	}
	
	@Bean
	public MemberRegisterController memberRegisterController() {
		MemberRegisterController memberRegisterController = new MemberRegisterController();
		memberRegisterController.setMemberRegisterService(memberRegSvc);
		
		return new MemberRegisterController();
	}

}
