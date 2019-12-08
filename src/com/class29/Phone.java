package com.class29;

public abstract class Phone {
	public void makeCall() {
		System.out.println("Make Call!");
	}
	public void sendText() {
		System.out.println("Send Text!");
	}
	public abstract void takePictures(); 
	public abstract void playSong();
	
	
	
}
class Iphone extends Phone{

	//@Override
	public void takePictures() {
		System.out.println("Iphone takes pictures");
	}

	@Override
	public void playSong() {
		System.out.println("Iphone play songs via itunes");
	}
}
class Samsung extends Phone{

	@Override
	public void takePictures() {
		System.out.println("Samsung takes HD pictures");
		
	}

	@Override
	public void playSong() {
		System.out.println("Samsung play songs");
	}
	
}