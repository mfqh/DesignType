package com.mfqh.builderdes;

/**
 * 抽象装配者：定义进行装配的方法
 * @author 81493
 *
 */

interface AbsBuilder {
	
	ObjFloor BuilderFloor();
	
	ObjDoor BuilderDoor();
	
	ObjWindows BuilderWindows();

}
