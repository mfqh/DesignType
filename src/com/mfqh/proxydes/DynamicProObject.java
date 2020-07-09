package com.mfqh.proxydes;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理：
 * 自动创建代理类
 * @author 81493
 *
 */

public class DynamicProObject implements InvocationHandler {
	AllObject myObject;	
	public DynamicProObject() {}
	public DynamicProObject(AllObject myObject) {
		super();
		this.myObject = myObject;
	}	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("ago thing");
		method.invoke(myObject, args);
		System.out.println("after thing");
		return null;	
	}
}
