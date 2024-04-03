package com.emc.test;

import com.emc.dto.Organizer;

public class Test {

	public static void main(String[] args) {
		
		Organizer organizer = new Organizer();
		
		organizer.id = 123;
		
		organizer.name = "apple Inc";
		
		System.out.println(organizer); // object reference
		
		System.out.println(organizer.id);  
		
		System.out.println(organizer.name);
		
		
		
		
	}
}
