package config;

import Aspect0.ExeTimeAspect;
import module.Calculator;
import module.CalculatorRecImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppCtxAOP1 {

    @Bean
    public ExeTimeAspect exeTimeAspect() {
        return new ExeTimeAspect();
    }
    @Bean
    public Calculator calculator() {
        return new CalculatorRecImpl();
    }

}
