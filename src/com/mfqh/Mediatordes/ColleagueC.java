package com.mfqh.Mediatordes;
/**
 * 具体同事C
 * @author 81493
 *
 */

public class ColleagueC implements Colleague{

	private Mediator mediator;
	
	public ColleagueC() {}
	
	public ColleagueC(Mediator mediator) {
		this.mediator = mediator;
		mediator.addColleague("Cment", this);
	}
	
	@Override
	public void inAction() {
		System.out.println("C部门执行任务");
	}

	@Override
	public void outAction(String str) {
		System.out.println("需要"+str+"部门进行支援");
		mediator.controlColleague(str);
	}
}
