package com.class28;

public class userInfo extends userClass{
	
		String address;

		userInfo(String name, int mobileNum,String address) {
			super(name, mobileNum);
			this.address = address;	
		}
		public void userDetails() {
			System.out.println(name+" "+mobileNum+" "+address);
		}
		public static void main(String[] args) {
			userInfo obj = new userInfo("James", 703909394, "104 N wayne St");
			obj.userDetails();
		}
		
	


}
