package com.mfqh.adapterdes;

/**
 * 
 * 客户端
 * @author 81493
 *
 */
public class Client {
	
	
	public void test(Adapter myTarAdapter ) {
		myTarAdapter.action();
	}
	
	public static void main(String[] args) {
		
		Client client = new Client();
		Adapter myAdapter = new TarAdapter(new Adaptee());
		
		client.test(myAdapter);
	}

}
