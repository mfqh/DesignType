package com.mfqh.uniquedes;

import java.lang.reflect.Constructor;

/**
 * 使用反射破解单例设计模式
 * 
 * 可在构造器中抛出异常
 * @author 81493
 *
 */

public class ReflectClear {
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception {
		
		LazyUnique l1 = LazyUnique.getInstance();
		LazyUnique l2 = LazyUnique.getInstance();
		
		System.out.println(l1);
		System.out.println(l2);
		
		Class myClass = Class.forName("com.mfqh.uniquedes.LazyUnique");
		Constructor<LazyUnique> myConstructor = myClass.getDeclaredConstructor();
		myConstructor.setAccessible(true);
		LazyUnique l3 = myConstructor.newInstance();

		System.out.println(l3);
	}

}
