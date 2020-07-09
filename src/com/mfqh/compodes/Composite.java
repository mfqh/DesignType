package com.mfqh.compodes;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器构件：
 * 包含容器属性
 * 可以存储叶子结点
 * @author 81493
 *
 */

public class Composite implements Component{
	
	private List<Component> myLeaf;
	
	private String name;
	
	public Composite(String name) {
		this.name = name;
		this.myLeaf = new ArrayList<Component>();
	}
	
	public void addLeaf(Component thing) {
		myLeaf.add(thing);
	}
	
	public void removeLeaf(Component thing) {
		myLeaf.remove(thing);
	}

	@Override
	public void showMessage() {
		
		System.out.println("现在查询到的是容器构件："+this.name);
		//天然的递归查询
		for(Component leaf : this.myLeaf) {
			leaf.showMessage();
		}
	}

}
