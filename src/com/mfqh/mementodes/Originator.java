package com.mfqh.mementodes;
/**
 * 备忘源：即需要被备份的数据
 * @author 81493
 *
 */

public class Originator {

	private int number;
	private String name;
	
	public Originator() {}

	public Originator(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	public Memento copyDataOriginator() {
		return new Memento(this);
	}
	
	public void recoverOriginator(Memento memento) {
		this.name = memento.getName();
		this.number = memento.getNumber();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
