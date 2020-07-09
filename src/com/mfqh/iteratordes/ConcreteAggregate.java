package com.mfqh.iteratordes;

import java.util.ArrayList;
import java.util.List;
/**
 * 具体实现类：
 * 使用内部类的方式定义迭代器
 * @author 81493
 *
 */

public class ConcreteAggregate implements Aggregate{

	private List<String> myList;
	
	public ConcreteAggregate() {
		myList = new ArrayList<String>();
	}
	
	public void addComponent(String str) {
		this.myList.add(str);
	}
	
	@Override
	public InIterator createIterator() {
		return new myIterator();
	}

	class myIterator implements InIterator{

		private int cursor;
		
		public myIterator() {
			this.cursor = 0;
		}

		@Override
		public void first() {
			this.cursor = 0;	
		}

		@Override
		public void next() {
			if(cursor < myList.size()-1) {
				cursor++;
			}
		}

		@Override
		public boolean isFirst() {
		    return cursor==0? true:false;
		}

		@Override
		public boolean isLast() {
			return cursor==myList.size()-1? true:false;
		}

		@Override
		public String getData() {
			return myList.get(cursor);
		}
		
	}
}
