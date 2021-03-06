package com.example.sgsparks.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

//    @Before("execution(* com.example.sgsparks.service.*.*(..))")
//    public void loggerBefore() {
//        System.out.println("get으로 시작하는 메서드가 시작됩니다.");
//    }
//
//    @After("execution(* com.example.sgsparks.service.*.*(..))")
//    public void loggerAfter() {
//        System.out.println("get으로 시작하는 메서드가 끝났습니다.");
//    }
//
//    @Around("execution(* com.example.sgsparks.controller.*.*(..))")
//    public Object loggerAround(ProceedingJoinPoint pjp) throws Throwable {
//        long beforeTimeMills = System.currentTimeMillis();
//        System.out.println("[UserController] 실행 시작:" + pjp.getSignature().getDeclaringTypeName() + "." + pjp.getSignature().getName());
//        Object result = pjp.proceed();
//
//        long afterTimeMillis = System.currentTimeMillis() - beforeTimeMills;
//        System.out.println("[UserController] 실행완료:" + afterTimeMillis + "밀리초 소요" + pjp.getSignature().getDeclaringTypeName() + "." + pjp.getSignature().getName());
//        return result;
//    }
}
