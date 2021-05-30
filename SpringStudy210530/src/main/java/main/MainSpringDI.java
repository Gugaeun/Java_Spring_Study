package main;

import config.AppCtx;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainSpringDI {
    private static ApplicationContext ctx = null;

    public static void main(String[] args) {
        ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        // 콘솔에서 입력받기 위해 System.in 을 이용해서 BufferedReader 생성
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("명령어를 입력하세요.");
            // 한 줄 입력
            try {
                String command = reader.readLine();

                // 입력한 문자열이 "exit"이면 프로그램 종료
                if (command.equalsIgnoreCase("exit")) {
                    System.out.println("종료합니다.");
                    break;
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
