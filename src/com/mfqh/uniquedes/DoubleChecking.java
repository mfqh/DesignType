package com.mfqh.uniquedes;

/**
 * 双重检查，提高性能
 * 使用volatile进行资源同步，防止指令重排，返回空对象到工作空间
 * @author 81493
 *
 */

public class DoubleChecking {
	
	private  volatile static DoubleChecking instance;
	
	private DoubleChecking() {}
	
	public static DoubleChecking getInstance(){
		if(instance != null) {
			return instance;
		}
		synchronized (DoubleChecking.class) {
			if(instance == null) {
				instance = new DoubleChecking();
			}
		}
		
		return instance;
	}

}
