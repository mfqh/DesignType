package com.mfqh.compodes;

/**
 * 叶子构件：
 * 无子节点，存贮在上层容器中
 * @author 81493
 *
 */

public class Leaf implements Component{
	
	private String name;
	
	public Leaf() {}

	public Leaf(String name) {
		super();
		this.name = name;
	}



	@Override
	public void showMessage() {
		
		System.out.println("现在查询到的是叶子构件："+this.name);
	
	}

}
