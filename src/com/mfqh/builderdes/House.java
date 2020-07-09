package com.mfqh.builderdes;


/**
 * 所要建造对象
 * @author 81493
 *
 */
public class House {
	
	private ObjFloor myFloor;
	private ObjDoor myDoor;
	private ObjWindows myWindows;
	public House() {}
	
	public House(ObjFloor myFloor, ObjDoor myDoor, ObjWindows myWindows) {
		this.myFloor = myFloor;
		this.myDoor = myDoor;
		this.myWindows = myWindows;
	}
	
	@Override
	public String toString() {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("房子构建为：").append("\r\n");
		strBuilder.append(myDoor.getDoor()).append("\r\n");
		strBuilder.append(myWindows.getWindows()).append("\r\n");
		strBuilder.append(myFloor.getFloor());
		
		return new String(strBuilder);
	}

	public ObjFloor getMyFloor() {
		return myFloor;
	}

	public void setMyFloor(ObjFloor myFloor) {
		this.myFloor = myFloor;
	}

	public ObjDoor getMyDoor() {
		return myDoor;
	}

	public void setMyDoor(ObjDoor myDoor) {
		this.myDoor = myDoor;
	}

	public ObjWindows getMyWindows() {
		return myWindows;
	}

	public void setMyWindows(ObjWindows myWindows) {
		this.myWindows = myWindows;
	}

	
	
}

