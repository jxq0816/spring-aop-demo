package com.weeking.share.service.aop03;

import com.weeking.share.service.aop02.annotion.Operate;
import com.weeking.share.service.aop02.ennum.OperateEnum;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 通知类，横切逻辑
 *
 */
@Component
@Aspect
public class Advice {
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