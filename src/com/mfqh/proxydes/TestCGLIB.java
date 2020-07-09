package com.mfqh.proxydes;

import java.lang.reflect.Type;

import net.sf.cglib.proxy.Enhancer;

/**
 * 测试CGLIB实现动态代理
 * @author 81493
 *
 */

public class TestCGLIB {
	public static void main(String[] args) {
		Enhancer hancer = new Enhancer();
		hancer.setSuperclass(ReallyCGLIB.class);
		hancer.setCallback(new DynamicProCGLIB());
		
		ReallyCGLIB eCglib = (ReallyCGLIB)hancer.create();
		eCglib.one();
		//测试出代理类的父类及接口
		System.out.println(eCglib.getClass().getGenericSuperclass());
		Type[] allInter = eCglib.getClass().getGenericInterfaces();
		for (Type type : allInter) {
			System.out.println(type);
		}	
	}
}
