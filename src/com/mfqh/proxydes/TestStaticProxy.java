package com.mfqh.proxydes;

public class TestStaticProxy {
	
	public static void main(String[] args) {
		AllObject myObject = new StaticProObject(new ReallObject());
		
		myObject.oneThing();
		myObject.twoThing();
		myObject.mainThing();
		myObject.threeThing();
		myObject.fourThing();
	}

}
