package com.mfqh.flyweightdes;

import java.util.HashMap;

/**
 * 享元工厂：用键值对存储数据
 * @author 81493
 *
 */



public class FlyWeightFactory {

	private static HashMap<String, FlyWeight> chessFactory 
						= new HashMap<String,FlyWeight>();
	
	public static FlyWeight getWeight(String color) {
		
		FlyWeight myWeight = null;
		
		if(chessFactory.get(color) != null) {
			myWeight = chessFactory.get(color);

		}else {
			myWeight = new ConcreteFlyWeight(color);
			chessFactory.put(color, myWeight);
		}
			
		return myWeight;
		
	}
}
