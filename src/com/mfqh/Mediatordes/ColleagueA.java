package com.mfqh.Mediatordes;
/**
 * 具体同事A
 * @author 81493
 *
 */

public class ColleagueA implements Colleague{

	private Mediator mediator;
	
	public ColleagueA() {}
	
	public ColleagueA(Mediator mediator) {
		this.mediator = mediator;
		mediator.addColleague("Ament", this);
	}
	
	@Override
	public void inAction() {
		System.out.println("A部门执行任务");
	}

	@Override
	public void outAction(String str) {
		System.out.println("需要"+str+"部门进行支援");
		mediator.controlColleague(str);
	}

}
