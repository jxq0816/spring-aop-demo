package com.weeking.share.service.aop02;

import com.weeking.share.service.aop02.annotion.Operate;
import com.weeking.share.service.aop02.ennum.OperateEnum;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

public class OperateProxy{

	public void doAfter(JoinPoint jp) throws NoSuchMethodException, SecurityException {

		MethodSignature signature = (MethodSignature) jp.getSignature();
		Method method = signature.getMethod();
		System.out.println("method : "+method.getName());

		Method realMethod = jp.getTarget().getClass().getDeclaredMethod(signature.getName(), method.getParameterTypes());
		System.out.println("realMethod : "+method.getName());

		Operate operate = realMethod.getAnnotation(Operate.class);
		Object[] args = jp.getArgs();
		if( args.length > 0 && operate != null) {
			OperateEnum status = operate.status();
			System.out.println("keys:"+status);
			System.out.print("values:");
			for(int i=0;i<args.length;i++){
				System.out.print(args[i]);
			}
		}
		System.out.println();
		System.out.println("do after end");
	}
}
