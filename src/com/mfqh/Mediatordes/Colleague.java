package com.mfqh.Mediatordes;
/**
 * 抽象同事
 * @author 81493
 *
 */

public interface Colleague {

	void inAction();
	
	void outAction(String str);
}
