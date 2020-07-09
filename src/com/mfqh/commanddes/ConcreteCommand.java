package com.mfqh.commanddes;
/**
 * 具体命令
 * @author 81493
 *
 */

public class ConcreteCommand implements Command{

	private Receiver myReceiver;
	
	public ConcreteCommand() {}

	public ConcreteCommand(Receiver myReceiver) {
		super();
		this.myReceiver = myReceiver;
	}

	@Override
	public void action() {
		myReceiver.someThing();
	}

}
