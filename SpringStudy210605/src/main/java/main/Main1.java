package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import spring.Client;

public class Main1 {
    public static void main(String[] args) {
        // 스프링(Spring) 빈(Bean) 라이프사이클과 범위
        // 스프링 컨테이너(Container) 초기화와 종료
        // 빈(Bean) 객체의 라이프사이클

        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext();
        Client client = ctx.getBean(Client.class);
        client.send();

        ctx.close();
    }
}
