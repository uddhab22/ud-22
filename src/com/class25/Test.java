package com.class25;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("Creating an object of employee class");
		
		Employee emp = new Employee();
		emp.salary = 70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("=============================");
		
		System.out.println("Creating an object of Scrum team");
		ScrumTeam sm = new ScrumTeam();
		sm.salary = 90000;
		sm.work();
		sm.getPaid();
		sm.artifacts="Product backlog, Sprint Backlog, ";
		sm.ceremonies=" Sprint demo, Planning, Retro, Daily Stanup";
		sm.attendsScrumMeeting();
		
		System.out.println("============================");
		
		System.out.println("Creating an object of Developer Class");
		Developer dev = new Developer();
		dev.salary=100000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint demo, Planning, Retro, Daily Standup";
		dev.attendsScrumMeeting();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
