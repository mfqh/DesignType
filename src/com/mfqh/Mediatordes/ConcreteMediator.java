package com.mfqh.Mediatordes;
/**
 * 具体中介者：
 * 持有每个同事类的对象
 * @author 81493
 *
 */

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator implements Mediator{

	private Map<String, Colleague> fucTable;
	
	public ConcreteMediator() {
		this.fucTable = new HashMap<String, Colleague>();
	}
	
	public void addColleague(String str,Colleague colleague) {
		fucTable.put(str, colleague);
	}

	public void controlColleague(String name) {
		if(fucTable.get(name) != null) {
			fucTable.get(name).inAction();
		}else {
			System.out.println("联系不到此部门");
		}
	}
}
