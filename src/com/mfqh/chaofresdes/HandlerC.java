package com.mfqh.chaofresdes;
/**
 * 具体处理类C
 * @author 81493
 *
 */

public class HandlerC extends Handler{

	public HandlerC() {}

	public HandlerC(Handler handler) {
		super(handler);
	}
	
	@Override
	public void handleRequest(Request realRequest) {
		//判断是否符合条件
		if(realRequest.getJudge() <= 30) {
			System.out.println("C进行审核："+realRequest.getName()+"通过审核");
		}else {
			
			System.out.println("超出标准");
		}
		
	}
}
