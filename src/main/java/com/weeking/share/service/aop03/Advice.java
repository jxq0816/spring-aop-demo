package com.weeking.share.service.aop03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 通知类，横切逻辑
 *
 */
@Component
@Aspect
public class Advice {
    @Before("execution(* com.weeking.share.service.aop03.MathService.*(..))")
    public void before(JoinPoint jp){
        System.out.println("----------before execute 03----------");
        System.out.println(jp.getSignature().getName());
    }

    @After("execution(* com.weeking.share.service.aop03.MathService.*(..))")
    public void after(JoinPoint jp){
        System.out.println("----------after execute 03----------");
    }
}