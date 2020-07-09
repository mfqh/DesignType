package com.mfqh.commanddes;
/**
 * 测试命令模式
 * @author 81493
 *
 */

public class Client {

	
	
	public static void main(String[] args) {
		
		Invoker invoker = new Invoker(new ConcreteCommand(new Receiver()));
		invoker.doThing();
	}
}
