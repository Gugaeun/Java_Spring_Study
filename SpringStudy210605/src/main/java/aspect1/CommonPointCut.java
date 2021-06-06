package aspect1;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCut {
    @Pointcut("execution(public * module..*(..))")

    public void commonTarget() {
    }
}
