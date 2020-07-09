package com.mfqh.iteratordes;
/**
 * 抽象迭代器
 * @author 81493
 *
 */

public interface InIterator {

	void first();
	
	void next();
	
	boolean isFirst();
	
	boolean isLast();
	
	String getData();
}
