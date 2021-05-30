package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.*;

@Configuration
public class AppCtx {
    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }
//    @Bean
//    public MemberPrinter memberPrinter() {
//        return new MemberPrinter();
//    }
    @Bean
    public MemberPrinter memberPrinter1() {
        return new MemberPrinter();
    }
    @Bean
    @Qualifier("printer")
    public MemberPrinter memberPrinter2() {
        return new MemberPrinter();
    }

    @Bean
    @Qualifier("summaryPrinter")
    public MemberSummaryPrinter memberPrinter3() {
        return new MemberSummaryPrinter();
    }

    @Bean
    public ChangePasswordService changePasswordService() {
        // 의존 객체 주입
        ChangePasswordService passwordService = new ChangePasswordService();
//        passwordService.setMemberDao(memberDao());    // 할 필요없음
        return passwordService;
    }

    @Bean
    public MemberRegisterService memberRegisterService() {
        // 의존 객체 주입
        MemberRegisterService memberRegisterService = new MemberRegisterService();
        return memberRegisterService;
    }

    @Bean
    public MemberInfoPrinter infoPrinter() {
        MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
        return infoPrinter;
    }


}
