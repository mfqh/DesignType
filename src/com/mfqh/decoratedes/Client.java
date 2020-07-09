package com.mfqh.decoratedes;

public class Client {
	
	public static void main(String[] args) {
		Component aComponent = new ConcreteComponent("击毙对方首脑");
		aComponent.operation();
		Component deComponent01 = new DecoratorAplan(aComponent);
		deComponent01.operation();
		Component deComponent02 = new DecoratorBplan(deComponent01);
		deComponent02.operation();
	}

}
