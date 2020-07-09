package com.mfqh.protodesi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 实现深复制:使用序列化和反序列化
 * @author 81493
 *
 */

public class PassiveDeepSer {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//使用未进行深复制的PassiveShallow测试
		Date nowDate = new Date();
		System.out.println(nowDate);
		//日期改变前
		Long currentTime = System.currentTimeMillis();
		PassiveShallow pShallow = new PassiveShallow(nowDate,currentTime);
		//使用序列化写入内存转换为byte数组
		ByteArrayOutputStream baStream = new ByteArrayOutputStream();  //需单独列出,方便转化数组
		ObjectOutputStream ooStream = new ObjectOutputStream(
											new BufferedOutputStream(baStream));
		ooStream.writeObject(pShallow);
		ooStream.flush();          //刷新缓存区
		byte[] a = baStream.toByteArray();
		
		ooStream.close();
		baStream.close();
		
				
		//使用反序列化,取出对象,用新引用接取
		ObjectInputStream oiStream = new ObjectInputStream(
											new BufferedInputStream(
													new ByteArrayInputStream(a)));
		Object myObject = oiStream.readObject();
		
		oiStream.close();
		PassiveShallow pShallow_copy = null;
		if(myObject instanceof PassiveShallow) {
			pShallow_copy = (PassiveShallow)myObject;
		}
		
		System.out.println(pShallow.getWhDate());
		System.out.println(pShallow_copy.getWhDate());
		
		nowDate.setTime(123456789L);
		
		System.out.println(pShallow.getWhDate());
		System.out.println(pShallow_copy.getWhDate());
	}

}
