package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mvcStudy.dao.MemberDao;

@Configuration
public class MemberConfig {
	@Bean
	
	public MemberDao memberDao() {
		return new MemberDao();
	}

}
