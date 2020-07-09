package com.mfqh.uniquedes;

/**
 * 饿汉式
 * 类的加载是天然的线程安全
 * 一开始直接加载，可能造成资源浪费
 * @author 81493
 *
 */

public class HungryUnique {
	
	private static final HungryUnique instance = new HungryUnique();
	
	private HungryUnique(){}
	
	public static HungryUnique getInstance() {
		return instance;
	}

}
