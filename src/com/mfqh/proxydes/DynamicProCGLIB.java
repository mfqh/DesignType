package com.mfqh.proxydes;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 使用CGLIB实现动态代理
 * @author 81493
 *
 */

public class DynamicProCGLIB implements MethodInterceptor{

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		
		System.out.println("ago thing");
		arg3.invokeSuper(arg0, arg2);
		System.out.println("after thing");
		return null;
	}
	

}
