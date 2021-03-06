package com.weeking.share.service.aop03;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 切面类，通知方法
 *
 */
@Component
@Aspect
public class AspectProxy03 {
    @Before("execution(* com.weeking.share.service.aop03.MathService.*(..))")
    public void before(JoinPoint jp){
        System.out.println("---------- AOP03 before execute ----------");
        MethodSignature signature = (MethodSignature) jp.getSignature();
        Method method = signature.getMethod();
        System.out.println("method : "+method.getName());
        Object[] args = jp.getArgs();
        if( args.length>0) {
            System.out.print("param:");
            for(int i=0;i<args.length;i++){
                System.out.print(args[i]+" ");
            }
        }
        System.out.println();
    }

    @After("execution(* com.weeking.share.service.aop03.MathService.*(..))")
    public void after(JoinPoint jp){
        System.out.println("---------- AOP03 after execute ----------");
    }
}