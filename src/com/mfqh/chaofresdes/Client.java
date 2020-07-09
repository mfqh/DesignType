package com.mfqh.chaofresdes;
/**
 * 测试：责任链模式
 * @author 81493
 *
 */

public class Client {
	public static void main(String[] args) {
		Handler aHandler = new HandlerA();
		Handler bHandler = new HandlerB();
		Handler cHandler = new HandlerC();
		//进行连接
		aHandler.setNextRequest(bHandler);
		bHandler.setNextRequest(cHandler);
		
		Request myRequest = new Request(36,"张三");
		aHandler.handleRequest(myRequest);
	}
}
