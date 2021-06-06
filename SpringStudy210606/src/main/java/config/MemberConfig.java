package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mvcStudy.dao.MemberDao;
import springmvc.service.MemberRegisterService;

@Configuration
public class MemberConfig {
	@Bean
	
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService(memberDao());
	}

}
