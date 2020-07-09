package com.mfqh.iteratordes;
/**
 * 测试迭代器模式
 * @author 81493
 *
 */

public class Client {

	public static void main(String[] args) {
		ConcreteAggregate cAggregate = new ConcreteAggregate();
		cAggregate.addComponent("a");
		cAggregate.addComponent("b");
		cAggregate.addComponent("c");
		cAggregate.addComponent("d");
		cAggregate.addComponent("e");
		
		InIterator myIterator = cAggregate.createIterator();
		System.out.println(myIterator.isFirst());
		while(!myIterator.isLast()) {
			System.out.print(myIterator.getData());
			myIterator.next();
		}
		System.out.println(myIterator.getData());
		System.out.println(myIterator.isLast());
		myIterator.first();
		System.out.println(myIterator.isFirst());
	}
}
