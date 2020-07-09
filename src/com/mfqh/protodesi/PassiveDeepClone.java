package com.mfqh.protodesi;

import java.util.Date;

/**
 * 实现深复制：
 * ①将源对象的引用属性也进行克隆，使得两个对象的引用属性分别指向不同的地址
 * @author 81493
 *
 */

public class PassiveDeepClone implements Cloneable{
	
	private Date whDate;	
	private Long curTime;
	
	public PassiveDeepClone() {}
	
	public PassiveDeepClone(Date whDate, Long curTime) {
		this.whDate = whDate;
		this.curTime = curTime;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//将克隆对象的引用属性也进行克隆
		Object object = super.clone();
		PassiveDeepClone deep = (PassiveDeepClone)object;
		deep.whDate = (Date)this.whDate.clone();
		return deep;
	}

	public Date getWhDate() {
		return whDate;
	}


	public Long getCurTime() {
		return curTime;
	}

}
