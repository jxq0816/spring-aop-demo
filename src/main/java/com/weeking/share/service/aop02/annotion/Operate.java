package com.weeking.share.service.aop02.annotion;

import com.weeking.share.service.aop02.ennum.OperateEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME) // 注解会在class字节码文件中存在，在运行时可以通过反射获取到  
@Target(ElementType.METHOD)
public @interface Operate {
	public OperateEnum status();
}
