package com.mfqh.decoratedes;
/**
 * 装饰类：
 * 可定义为抽象类，子类做具体实现
 * @author 81493
 *
 */

public abstract class Decorator implements Component{

	protected Component deComponent;
	
	public Decorator() {}

	public Decorator(Component deComponent) {
		super();
		this.deComponent = deComponent;
	}
	
		
}
