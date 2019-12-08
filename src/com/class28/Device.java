package com.class28;
//Class device, then child class apple.

public class Device {
	String deviceType, name;
	
	Device(String deviceType,String name){
		this.deviceType = deviceType;
		this.name=name;
	}

}
class Apple extends Device{
	Apple(String deviceType, String name) {
		super(deviceType, name);
		System.out.println(deviceType +" "+name);
	}
	
}
