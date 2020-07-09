package com.mfqh.Mediatordes;
/**
 * 抽象中介者
 * @author 81493
 *
 */

public interface Mediator {

	public void addColleague(String str,Colleague colleague);
	
	public void controlColleague(String name);
}
