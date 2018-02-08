package com.weeking.share.service.aop02;

import org.aspectj.lang.JoinPoint;

public class OperateProxy{

	public void doAfter(JoinPoint jp) throws NoSuchMethodException, SecurityException {
		System.out.println("do after!");
	}
}
