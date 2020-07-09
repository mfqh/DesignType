package com.mfqh.compodes;
/**
 * 测试组合模式
 * @author 81493
 *
 */

public class Client {

	public static void main(String[] args) {
		Component c3,c4,c5,c6;
		Composite c1,c2;
		
		c1 = new Composite("枝一");
		c2 = new Composite("枝二");
		
		c3 = new Leaf("叶一");
		c4 = new Leaf("叶二");
		c5 = new Leaf("叶三");
		c6 = new Leaf("叶四");
		
		c1.addLeaf(c3);
		c1.addLeaf(c2);
		c1.addLeaf(c4);
		
		c2.addLeaf(c5);
		c2.addLeaf(c6);
		
		c2.showMessage();
		System.out.println("-----------");
		c1.showMessage();
	}
}
