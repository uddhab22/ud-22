package com.class26;

public class TestDriver {

	public static void main(String[] args) {
		ChromeDriver chrome = new ChromeDriver();
		chrome.open();
		chrome.refresh();
		
		FireFox fire = new FireFox();
		fire.open();
		fire.refresh();
		
		
		WebDriver driver = new ChromeDriver();
		driver.open();
		driver.refresh();
		
	}

}
