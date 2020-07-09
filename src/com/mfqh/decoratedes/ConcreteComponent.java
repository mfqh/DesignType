package com.mfqh.decoratedes;
/**
 * 具体构件：真实对象
 * @author 81493
 *
 */

public class ConcreteComponent implements Component{

	private String operator;
	
	public ConcreteComponent() {}

	public ConcreteComponent(String operator) {
		super();
		this.operator = operator;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Override
	public void operation() {
		System.out.println("执行的操作："+this.operator);
	}
	
	
}
