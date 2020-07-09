package com.mfqh.factorydes;

/**
 * 测试三种工厂模式
 * ①简单工厂模式
 * ②工厂模式
 * ③抽象工厂模式
 * @author 81493
 *
 */

public class TestFactory {

	public static void main(String[] args) {
		//①简单工厂模式(一个统一的工厂)
		System.out.println("简单工厂模式：");
		SimpleFactory sFactory = new SimpleFactory();
		//传参
		Product sProduct01 = sFactory.getProduct("ProductOne");
		Product sProduct02 = sFactory.getProduct("ProductTwo");
		System.out.println(sProduct01);
		System.out.println(sProduct02);
		//直接调对应函数
		Product sProduct03 = sFactory.getProductOne();
		Product sProduct04 = sFactory.getProductTwo();
		System.out.println(sProduct03);
		System.out.println(sProduct04);
		
		//②工厂模式(不同的产品，相对不同的工厂)
		System.out.println("工厂模式：");
		CoFactory coFactory = new CoFactoryOne();
		CoFactory ctFactory = new CoFactoryTwo();
		Product cProduct01 = coFactory.getProduct();
		Product cProduct02 = ctFactory.getProduct();
		System.out.println(cProduct01);
		System.out.println(cProduct02);
		
		//③抽象工厂模式(一个工厂可以建立多个的产品)
		System.out.println("抽象工厂模式：");
		AbstrFactory aoFactory = new AbstrFactoryOne();
		AbstrFactory atFactory = new AbstrFactoryTwo();
		Product aProduct01 = aoFactory.getProduct();
		OtherProduct aotProduct01 = aoFactory.getOtherProduct();
		Product aProduct02 = atFactory.getProduct();
		OtherProduct aotProduct02 = atFactory.getOtherProduct();
		System.out.println(aProduct01);
		System.out.println(aProduct02);
		System.out.println(aotProduct01);
		System.out.println(aotProduct02);
		
	}
}
