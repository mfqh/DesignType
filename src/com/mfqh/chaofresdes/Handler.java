package com.mfqh.chaofresdes;
/**
 * 抽象处理类
 * @author 81493
 *
 */

public abstract class Handler {

	protected Handler nextHandler;

	public Handler() {}

	public Handler(Handler handler) {
		super();
		this.nextHandler = handler;
	}
	
	public void setNextRequest(Handler handler) {
		this.nextHandler = handler;
	}
	
	public abstract void handleRequest(Request realRequest);
}
