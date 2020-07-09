package com.mfqh.mementodes;
/**
 * 测试 备忘录模式
 * @author 81493
 *
 */

public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator(111,"add");
		System.out.println("第一次设置"+originator.getName()+"--->"+originator.getNumber());
		CareTaker cTaker = new CareTaker();
		cTaker.addBackups(originator.copyDataOriginator());
		
		originator.setName("reduce");
		originator.setNumber(333);
		System.out.println("修改并备份01"+originator.getName()+"--->"+originator.getNumber());
		cTaker.addBackups(originator.copyDataOriginator());
		
		originator.setName("multiply");
		originator.setNumber(555);
		System.out.println("修改并备份02"+originator.getName()+"--->"+originator.getNumber());
		cTaker.addBackups(originator.copyDataOriginator());
		
		originator.setName("divide");
		originator.setNumber(888);
		System.out.println("修改不备份"+originator.getName()+"--->"+originator.getNumber());
		
		originator.recoverOriginator(cTaker.getBackups());
		System.out.println("撤销01"+originator.getName()+"--->"+originator.getNumber());
		
		originator.recoverOriginator(cTaker.getBackups());
		System.out.println("撤销02"+originator.getName()+"--->"+originator.getNumber());
		
		originator.recoverOriginator(cTaker.getBackups());
		System.out.println("撤销03"+originator.getName()+"--->"+originator.getNumber());
			
	}
}
