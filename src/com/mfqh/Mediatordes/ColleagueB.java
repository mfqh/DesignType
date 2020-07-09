package com.mfqh.Mediatordes;
/**
 * 具体同事B
 * @author 81493
 *
 */

public class ColleagueB implements Colleague{

	private Mediator mediator;
	
	public ColleagueB() {}
	
	public ColleagueB(Mediator mediator) {
		this.mediator = mediator;
		mediator.addColleague("Bment", this);
	}
	
	@Override
	public void inAction() {
		System.out.println("B部门执行任务");
	}

	@Override
	public void outAction(String str) {
		System.out.println("需要"+str+"部门进行支援");
		mediator.controlColleague(str);
	}
}
