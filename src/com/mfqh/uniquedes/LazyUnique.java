package com.mfqh.uniquedes;

import java.io.ObjectStreamException;
import java.io.Serializable;

import com.mfqh.uniquedes.InClassUnique.newInstance;

/**
 * 懒汉式
 * 使用synchronized锁住相应资源，防止并发
 * 性能较低
 * 
 * 测试反射和反序列化破解
 * 反射：可在构造器抛出异常
 * 反序列化：序列化时，需实现Serializable接口，防止反序列化可定义readResolve()：是一种回调，直接返回对象
 * @author 81493
 *
 */

@SuppressWarnings("all")
public class LazyUnique implements Serializable{
	
	private static LazyUnique instance;
	
	private LazyUnique() {
//		throw new myException("外部调用构造器");
	}
	
	public static synchronized LazyUnique getInstance() {
		if(instance == null) {
			instance = new LazyUnique();
		}
		
		return instance;
	}
	
	private Object readResolve() throws ObjectStreamException{
		
		return instance;
	}

}

@SuppressWarnings("all")
//自定义异常，防止反射调用构造器
class myException extends RuntimeException{
	public myException(){
		
	}
	
	public myException(String str) {
		super(str);
	}
}
