package com.mfqh.observerdes;
/**
 * 具体观察者
 * @author 81493
 *
 */

public class ObserverA implements Observer{

	private int state;    //表状态，测试是否同步
	
	@Override
	public void update(Subject subject) {
		//强制转换，获取对象
		SubjectA myA = (SubjectA) subject;
		//进行同步
		this.state = myA.getState();
	}
	
	public int getState() {
		return state;
	}
	
}
