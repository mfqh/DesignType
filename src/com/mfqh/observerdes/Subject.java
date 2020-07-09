package com.mfqh.observerdes;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象目标对象
 * @author 81493
 *
 */

public abstract class Subject {

	protected List<Observer> obserList;
		
	public Subject() {
		obserList = new ArrayList<Observer>();
	}

	public void addObserver(Observer observer) {
		obserList.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		obserList.remove(observer);
	}
	
	public void notifyAllObserver() {
		for(Observer observer:obserList) {
			observer.update(this);
		}
	}
	
}
