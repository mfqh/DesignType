package com.mfqh.chaofresdes;
/**
 * 具体处理类B
 * @author 81493
 *
 */

public class HandlerB extends Handler{

	public HandlerB() {}

	public HandlerB(Handler handler) {
		super(handler);
	}
	
	@Override
	public void handleRequest(Request realRequest) {
		//判断是否符合条件
		if(realRequest.getJudge() <= 20) {
			System.out.println("B进行审核："+realRequest.getName()+"通过审核");
		}else {
			//传给后续处理类进行处理
			this.nextHandler.handleRequest(realRequest);
		}
		
	}
}
