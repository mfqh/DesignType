package com.mfqh.chaofresdes;

public class Request {

	private int judge;
	private String name;
	
	public Request() {}
	
	public Request(int judge, String name) {
		super();
		this.judge = judge;
		this.name = name;
	}

	public int getJudge() {
		return judge;
	}

	public void setJudge(int judge) {
		this.judge = judge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
