package com.weeking.share.service.aop01;

import org.aspectj.lang.JoinPoint;

/**
 * 通知类，横切逻辑
 *
 */
public class AspectProxy {

    public void before(JoinPoint jp){
        System.out.println("----------AOP01 before execute----------");
        System.out.println(jp.getSignature().getName());
    }

    public void after(JoinPoint jp){
        System.out.println("----------AOP01 after execute----------");
    }
}