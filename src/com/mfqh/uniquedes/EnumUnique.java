package com.mfqh.uniquedes;

import com.mfqh.uniquedes.InClassUnique.newInstance;

/**
 * 枚举型
 * 枚举是天然的单例设计模式
 * 可防止反射和反序列化
 * @author 81493
 *
 */

enum EnumUnique {
	
	//该属性是枚举EnumUnique的实例
	instance;
	
	int a[] = new int[3];
	//可添加方法
	public void operation() {
		System.out.println("枚举单例设计模式");
		System.out.println(a);
	}

}

