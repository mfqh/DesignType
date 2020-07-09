package com.mfqh.observerdes;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer{

	private int myState;
	
	public ConcreteObserver() {}
	
	public int getMyState() {
		return myState;
	}

	public void setMyState(int myState) {
		this.myState = myState;
	}

	@Override
	public void update(Observable o, Object arg) {
		this.myState = ((ConcreteSubject)o).getState();
		
	}

}
