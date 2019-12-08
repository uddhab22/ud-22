package com.class25_1;

	

public class VolumeOrArea {
	public void volumeorArea(int x, int y) {
		int area = x*y;
		System.out.println("The area of the rectangle  with length "+x+" and width  "+y+" is "+area);
	}
	
	public void volumeorArea(int x) {
		int area = x*x;
		System.out.println("The area of the square with side of "+x+" is "+area);
	}
	
	public void volumeorArea(int x, int y, int z) {
		int volume = x*y*z;
		System.out.println("The volume of the box with length "+x+" width "+y+ " and height "+z+" is "+ volume);
	}
	

}
