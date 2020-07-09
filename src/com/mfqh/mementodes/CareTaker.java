package com.mfqh.mementodes;
/**
 * 负责人类：
 * 将备忘对象进行存储
 * @author 81493
 *
 */

import java.util.Stack;

public class CareTaker {

	//可使用栈的特性进行存取
	
	private Stack<Memento> theMementos;
	
	public CareTaker() {
		theMementos = new Stack<Memento>();
	}
	
	//添加备份
	public void addBackups(Memento memento) {
		theMementos.add(memento);
	}
	
	public Memento getBackups() {
		return theMementos.pop();
	}
	
}
