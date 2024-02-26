package org.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimerAspect {

    @Pointcut("@annotation(org.example.annotations.Timer)")
    public void timerPointcut() {
    }


    @Around("timerPointcut()")
    public Object execTime(ProceedingJoinPoint joinPoint) throws Throwable {
        Long start = System.nanoTime();
        try {
            return joinPoint.proceed();
        } finally {
            System.out.println(joinPoint.getSignature().getDeclaringTypeName() + ", " +
                    joinPoint.getSignature().getName() + " #(" + (System.nanoTime() - start) + ")");
        }
    }

}
