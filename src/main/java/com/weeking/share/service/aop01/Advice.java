package com.weeking.share.service.aop01;

import org.aspectj.lang.JoinPoint;

/**
 * 通知类，横切逻辑
 *
 */
public class Advice {

    public void before(JoinPoint jp){
        System.out.println("----------before execute 01----------");
        System.out.println(jp.getSignature().getName());
    }

    public void after(JoinPoint jp){
        System.out.println("----------after execute 01----------");
    }
}