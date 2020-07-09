package com.mfqh.decoratedes;
/**
 * 具体装饰类A
 * @author 81493
 *
 */

public class DecoratorAplan extends Decorator{

	public DecoratorAplan(Component component) {
		super(component);
	}
	
	private void action() {
		System.out.println("添加计划A");
	}
	
	@Override
	public void operation() {
		this.deComponent.operation();
		action();
	}
}
