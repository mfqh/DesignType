package com.mfqh.decoratedes;
/**
 * 具体装饰类B
 * @author 81493
 *
 */


public class DecoratorBplan extends Decorator{

	public DecoratorBplan(Component component) {
		super(component);
	}
	
	private void action() {
		System.out.println("添加计划B");
	}
	
	@Override
	public void operation() {
		this.deComponent.operation();
		action();
	}

}
