package com.mfqh.uniquedes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ObjectOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

/**
 * 使用反序列化破解单例模式
 * 
 * 
 * @author 81493
 *
 */

public class DeserClear {
	public static void main(String[] args) throws Exception {
		
		//序列化，写入文件
		ObjectOutputStream ooStream = new ObjectOutputStream(
											new BufferedOutputStream(
													new FileOutputStream(
															new File("out/serializable.txt"))));
//  	LazyUnique l1 = LazyUnique.getInstance();
		EnumUnique l1 = EnumUnique.instance;
		System.out.println(l1);
		l1.operation();
		ooStream.writeObject(l1);
		ooStream.flush();
		ooStream.close();
		
		//反序列化，提取文件
		ObjectInputStream oiStream = new ObjectInputStream(
											new BufferedInputStream(
													new FileInputStream(
															new File("out/serializable.txt"))));
		Object inObject = oiStream.readObject();
//		LazyUnique l2 = null;
		EnumUnique l2 = null;
//		if(inObject instanceof LazyUnique) {
		if(inObject instanceof EnumUnique) {
			l2 = (EnumUnique)inObject;
		}
		System.out.println(l2);
		l2.operation();
		oiStream.close();
	}

}
