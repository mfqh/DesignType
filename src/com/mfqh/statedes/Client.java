package com.mfqh.statedes;

public class Client {

	public static void main(String[] args) {
		Context mContext = new Context();
		mContext.setState(new StateB());     //赋值初始状态
		
		mContext.request();      //请求状态,自动切换
		mContext.request();
	}
}
