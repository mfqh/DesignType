package com.mfqh.protodesi;


import java.util.Date;



public class TestShaProtoType {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Date nowDate = new Date();
		System.out.println(nowDate);
		//日期改变前
		Long currentTime = System.currentTimeMillis();
		PassiveShallow pObject = new PassiveShallow(nowDate,currentTime);
		System.out.println(pObject);
		System.out.println(pObject.getWhDate());
		System.out.println(pObject.getCurTime());
		PassiveShallow pObject_copy = (PassiveShallow)pObject.clone();
		System.out.println(pObject_copy);
		System.out.println(pObject_copy.getWhDate());
		System.out.println(pObject_copy.getCurTime());
		
		//改变日期
		System.out.println("改变日期");
//		Calendar myCalendar = new GregorianCalendar();
//		myCalendar.setTime(nowDate);
//		myCalendar.add(Calendar.YEAR, +100);
//		Date changDate = nowDate;                    //测试Date所指地址是否改变
//		nowDate = myCalendar.getTime();              //可以发现通过Calender改变日期后，
//		System.out.println(changDate);               //getTime（）直接会改变引用
//		System.out.println(nowDate);  

		nowDate.setTime(1234456789L);
		System.out.println(nowDate);
		System.out.println();
		
	
		//日期改变后
		System.out.println(pObject);
		System.out.println(pObject.getWhDate());
		System.out.println(pObject_copy);
		System.out.println(pObject.getCurTime());
		System.out.println(pObject_copy.getWhDate());
		System.out.println(pObject_copy.getCurTime());
		
		
	}

}
