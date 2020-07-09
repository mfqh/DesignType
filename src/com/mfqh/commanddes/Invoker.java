package com.mfqh.commanddes;
/**
 * 调用者，请求者
 * @author 81493
 *
 */



public class Invoker {

	private Command command;           //可使用容器存储多个对象，进行批处理

	public Invoker() {}

	public Invoker(Command command) {
		super();
		this.command = command;
	}
	
	public void doThing() {
		this.command.action();
	}
	
	
}
