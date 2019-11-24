package com.class24;

public class Country {
	
	public String capital,name;
	
	Country(){
		//System.out.println("I am non argument constructor");
	}
	
	Country(String name, String capital){
		this.name = name;
		this.capital = capital;
	}
	public void getInfo() {
		System.out.println(name+ " "+capital);
	}

	public static void main(String[] args) {
		/*Country country1 = new Country();
		country1.name = "USA";
		country1.capital="Washing DC";
		
		Country country2 = new Country();
		country2.name="Nepal";
		country2.capital = "Kathmandu"; */
		
		Country country1 = new Country("USA", "Washington DC");
		Country country2 = new Country("Nepal", "Kathmandu");
		Country country3 = new Country();
		
		country1.getInfo();
		country2.getInfo();
		country3.getInfo();
	}

}
