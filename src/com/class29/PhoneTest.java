package com.class29;

public class PhoneTest {

	public static void main(String[] args) {
		Phone phone = new Iphone();
		System.out.println("===============IPHONE===============");
		phone.makeCall();
		phone.sendText();
		phone.takePictures();
		phone.playSong();
		
		System.out.println("==============Samsung================");
		Phone phone2 = new Samsung();
		phone2.makeCall();
		phone2.sendText();
		phone2.takePictures();
		phone2.playSong();
		
	}

}
