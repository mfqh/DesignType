package com.mfqh.proxydes;

import java.lang.reflect.Proxy;
import java.lang.reflect.Type;


/**
 * 测试使用JDK自带的动态代理
 * @author 81493
 *
 */

public class TestDynamicProxy {
	
	public static void main(String[] args) {
		AllObject myObject = new ReallObject();
		//生成处理器
		DynamicProObject handler = new DynamicProObject(myObject);
		//生成代理对象
		AllObject neProxy = (AllObject)Proxy.newProxyInstance(
				                   ClassLoader.getSystemClassLoader(), 
				                   		new Class[] {AllObject.class},handler);
		neProxy.oneThing();
		//测试出代理类的父类及接口
		System.out.println(neProxy.getClass().getGenericSuperclass());
		Type[] allInter = neProxy.getClass().getGenericInterfaces();
		for (Type type : allInter) {
			System.out.println(type);
		}	
	}

}
