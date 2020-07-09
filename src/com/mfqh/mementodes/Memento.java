package com.mfqh.mementodes;
/**
 * 备忘录类：负责拷贝数据
 * @author 81493
 *
 */

public class Memento {

	
	private int number;
	private String name;
	
	private Memento() {}           //私有构造器，只能通过备份调用
	
	public Memento(Originator originator) {
		this.number = originator.getNumber();
		this.name = originator.getName();
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	
	
}
