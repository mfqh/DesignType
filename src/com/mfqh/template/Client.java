package com.mfqh.template;

public class Client {

	public static void main(String[] args) {
		
		Template myTemplate = new Template() {
			
			@Override
			public void mainProcess() {
				System.out.println("赚钱");
				
			}
		};
		myTemplate.process();
		
	}
}
