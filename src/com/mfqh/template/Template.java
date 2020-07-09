package com.mfqh.template;

public abstract class Template {

	private void firstProcess() {
		System.out.println("第一件事");
	}
	
	
	private void lastProcess() {
		System.out.println("第二件事");
	}
	
	public abstract void mainProcess();
	
	public void process() {
		firstProcess();
		mainProcess();
		lastProcess();
	}
}
