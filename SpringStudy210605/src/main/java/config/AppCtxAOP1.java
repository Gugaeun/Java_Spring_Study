package config;

import Aspect0.ExeTimeAspect;
import module.Calculator;
import module.CalculatorImpl;
import module.CalculatorRecImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppCtxAOP1 {

    @Bean
    public ExeTimeAspect exeTimeAspect() {
        return new ExeTimeAspect();
    }
    // 설정 클래스
    // AOP 적용시 CalculatorRecImpl 가 상속받은 Calculator 인터페이스를 이용해서 프록시 생성
    @Bean
    public Calculator calculator1() {
        return new CalculatorRecImpl();
    }

    @Bean
    public Calculator calculator2() {
        return new CalculatorImpl();
    }

}
