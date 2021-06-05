package config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.printer.MemberInfoPrinter2;
import spring.helper.MemberPrinter;

@Configuration
public class AppCtx2 {
    @Bean
    public MemberPrinter printer() {
        return new MemberPrinter();
    }

    @Bean
    @Qualifier("mprinter")
    public MemberPrinter printer2() {
        return new MemberPrinter();
    }
    @Bean
    public MemberInfoPrinter2 infoPrinter() {
        return new MemberInfoPrinter2();
    }
}
