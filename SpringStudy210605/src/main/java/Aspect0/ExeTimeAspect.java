package Aspect0;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


import java.util.Arrays;

@Aspect
public class ExeTimeAspect {
    @Pointcut("execution(public * module..*(..))")
    public void publicTarget() {
        System.out.println("ExeTimeAspect.publicTarget() 실행");
    }

    @Around("publicTarget()")
    public Object measure(ProceedingJoinPoint joinPoint) throws Throwable{
        long startTime = System.nanoTime();
        Signature sig = joinPoint.getSignature();
        /**
         *  org.aspect.lang.Signature 인터페이스가 제공하는 메서드
         *  String getName() : 호출되는 메서드의 이름을 구한다.
         *  String toLongString() : 호출되는 메서드를 완전하게 표현한 문장을 구한다.
         *  String toShortString() : 호출되는 메서드를 축약해서 표현한 문장을 구한다.
         */

        try {
            return joinPoint.proceed();
        } finally {
            long endTime = System.nanoTime();

            System.out.printf("%s.%s(%s) 실행 시간 : %d ns \n", joinPoint.getTarget().getClass().getSimpleName(),
                                sig.getName(), Arrays.toString(joinPoint.getArgs()), endTime - startTime);

        }
    }
}
