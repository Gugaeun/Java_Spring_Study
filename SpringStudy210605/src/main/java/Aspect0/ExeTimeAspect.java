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

        try {
            return joinPoint.proceed();
        } finally {
            long endTime = System.nanoTime();
            Signature sig = joinPoint.getSignature();
            System.out.printf("%s.%s(%s) 실행 시간 : %d ns \n", joinPoint.getTarget().getClass().getSimpleName(),
                                sig.getName(), Arrays.toString(joinPoint.getArgs()), endTime - startTime);

        }
    }
}
