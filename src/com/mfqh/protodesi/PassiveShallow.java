package com.mfqh.protodesi;

import java.io.Serializable;
import java.util.Date;

/**
 * 原型模式：
 * 通过new产生一个对象需要非常繁琐的数据准备或访问权限，则使用原型模式（进行克隆：类似于new，不同于new）
 * 
 * 被克隆的对象：
 * 必须实现Cloneable接口（是一个空接口，标记接口）
 * 重写clone方法（ps：该方法是继承自object的方法）
 * 
 *
 * 两种复制方式：
 * 浅复制：源对象和克隆对象的引用属性是同一个引用，指向同一个地址
 * 深复制：将源对象的引用属性也进行克隆，使得两个对象的引用属性分别指向不同的地址，或序列化与反序列化。
 * @author 81493
 *
 */

public class PassiveShallow implements Cloneable,Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private Date whDate;	
	private Long curTime;
	
	public PassiveShallow() {}
	
	public PassiveShallow(Date whDate, Long curTime) {
		this.whDate = whDate;
		this.curTime = curTime;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Date getWhDate() {
		return whDate;
	}

	public Long getCurTime() {
		return curTime;
	}
	
	
}
