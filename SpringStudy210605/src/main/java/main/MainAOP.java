package main;

import module.Calculator;
import module.CalculatorImpl;
import module.CalculatorRecImpl;
import module.NanoTimeCalculator;

public class MainAOP {
    public static void main(String[] args) {

        Calculator calculator1 = new CalculatorImpl();
        long startTime = System.currentTimeMillis();
        calculator1.factorial(10000);
        long endTime = System.currentTimeMillis();
        System.out.printf("CalculatorImpl.factorial(3) 실행 시간 = %d\n", (endTime - startTime));

        Calculator calculator2 = new CalculatorRecImpl();
        startTime = System.currentTimeMillis();
        calculator2.factorial(10000);
        endTime = System.currentTimeMillis();
        System.out.printf("CalculatorRecImpl.factorial(3) 실행 시간 = %d\n", (endTime - startTime));

        //AOP 구현
        //calculator 의 factorial() 기능 자체를 직접 구현하기보다는 NanoTimeCalculator 객체에 factorial()메소드 실행을 위임
        //NanoTimeCalculator 는 사실 계산 기능 외에 다른 부가적인 기능(여기서는 시간을 측정)을 실행함
        //이렇게 핵심 기능의 실행은 다른 객체에 위임하고 부가적인 기능을 제공하는 객체를 프록시(proxy) 라고 함.
        //공통 기능 구현과 핵심 기능 구현을 분리하는 것이 AOP 의 핵심
        NanoTimeCalculator calculator3 = new NanoTimeCalculator(new CalculatorImpl());
        long result = calculator3.factorial(1000);

        NanoTimeCalculator calculator4 = new NanoTimeCalculator(new CalculatorImpl());
        result = calculator4.factorial(1000);
    }

}
