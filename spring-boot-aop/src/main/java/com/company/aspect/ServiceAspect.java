package com.company.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.company.service.MessageService.giveMessage(..))")
    public void beforeGiveMessageMethod(JoinPoint joinPoint){
        System.out.println(
                "Param caught before give message method param: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.company.service.MessageService.giveMessage(..))")
    public void afterGiveMessageMethod(JoinPoint joinPoint){
        System.out.println(
                "Param caught after give message method param: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }
}
