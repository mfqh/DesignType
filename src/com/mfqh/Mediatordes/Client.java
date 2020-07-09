package com.mfqh.Mediatordes;

public class Client {

	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		Colleague aColleague = new ColleagueA(mediator);
		Colleague bColleague = new ColleagueB(mediator);
		Colleague cColleague = new ColleagueC(mediator);
		
		aColleague.inAction();
		aColleague.outAction("Bment");
		bColleague.outAction("Cment");
		cColleague.outAction("Ament");
	}
}
