package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.*;

@Configuration
public class AppCtx {
    // 자동 주입 기능
    @Autowired
    private MemberDao memberDao;

    @Bean
    public ChangePasswordService changePasswordService() {
        // 의존 객체 주입
        ChangePasswordService passwordService = new ChangePasswordService();
        //passwordService.setMemberDao(memberDao());    // 할 필요없음
        return passwordService;
    }

    @Bean
    public MemberRegisterService MemberRegisterService() {
        // 의존 객체 주입
        MemberRegisterService MemberRegisterService = new MemberRegisterService();
        //passwordService.setMemberDao(memberDao());    // 할 필요없음
        return MemberRegisterService;
    }

    @Bean
    public MemberInfoPrinter infoPrinter() {
        MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
        return infoPrinter;
    }

    @Bean
    public MemberPrinter memberPrinter() {
        MemberPrinter memberPrinter = new MemberPrinter();
        return memberPrinter;
    }


}
