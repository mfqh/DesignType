package com.mfqh.chaofresdes;
/**
 * 具体处理类A
 * @author 81493
 *
 */

public class HandlerA extends Handler{
	
	public HandlerA() {}

	public HandlerA(Handler handler) {
		super(handler);
	}
	
	@Override
	public void handleRequest(Request realRequest) {
		//判断是否符合条件
		if(realRequest.getJudge() <= 10) {
			System.out.println("A进行审核："+realRequest.getName()+"通过审核");
		}else {
			//传给后续处理类进行处理
			this.nextHandler.handleRequest(realRequest);
		}
		
	}

}
