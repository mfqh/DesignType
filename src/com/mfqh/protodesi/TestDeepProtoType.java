package com.mfqh.protodesi;

import java.util.Date;

/**
 * 测试深复制：克隆属性方法
 * @author 81493
 *
 */

public class TestDeepProtoType {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Date nowDate = new Date();
		System.out.println(nowDate);
		//日期改变前
		Long currentTime = System.currentTimeMillis();
		PassiveDeepClone pObject = new PassiveDeepClone(nowDate,currentTime);
		System.out.println(pObject);
		System.out.println(pObject.getWhDate());
		PassiveDeepClone pObject_copy = (PassiveDeepClone)pObject.clone();
		System.out.println(pObject_copy);
		System.out.println(pObject_copy.getWhDate());
		
		//改变日期
		System.out.println("改变日期");
		nowDate.setTime(123456789L);
		System.out.println(nowDate);
		System.out.println();

		//日期改变后
		System.out.println(pObject);
		System.out.println(pObject.getWhDate());
		System.out.println(pObject_copy);
		System.out.println(pObject_copy.getWhDate());
	}

}
