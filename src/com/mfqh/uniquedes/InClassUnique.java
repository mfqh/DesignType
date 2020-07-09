package com.mfqh.uniquedes;

/**
 * 静态内部类型
 * 使用静态内部类创建新的对象
 * 类的加载是天然线程安全的
 * @author 81493
 *
 */

public class InClassUnique {
	
	private static InClassUnique instance;
	
	private InClassUnique() {}
	
	static class newInstance{
		
		public static final InClassUnique obtInstance = new InClassUnique();
		
	}
	
	public static InClassUnique getInstance() {
		if(instance == null) {
			instance = newInstance.obtInstance;
		}
		
		return instance;
	}

}
