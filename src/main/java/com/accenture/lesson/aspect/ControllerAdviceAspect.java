package com.accenture.lesson.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ControllerAdviceAspect {

    private final String POINT_CUT = "execution(* com.accenture.lesson.handler.*Handler.*(..))";
    private static Logger log = LoggerFactory.getLogger(ControllerAdviceAspect.class);

    @Before(value = POINT_CUT)
    public void before(JoinPoint joinPoint){
        log.info("Start Handler for Controller Exception");
        log.info("The AOP for:"  + joinPoint.getSignature().getDeclaringTypeName());
        log.info("The Method :" + joinPoint.getSignature().getName());
//        log.info("The Args :" + joinPoint.getArgs().toString());
    }

    @After(value = POINT_CUT)
    public void after(JoinPoint joinPoint){
        log.info("Handler end");
    }

    @AfterThrowing(value = POINT_CUT,throwing="e")
    public void afterThrowing(JoinPoint joinPoint,Exception e){
        log.info(joinPoint.toLongString() + e);
    }
}
