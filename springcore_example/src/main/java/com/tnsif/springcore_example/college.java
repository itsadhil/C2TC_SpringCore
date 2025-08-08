package com.tnsif.springcore_example;

import org.springframework.stereotype.Component;

 @Component
public class college {
	
	private student s1;

	public void setS1(student s1) {
		this.s1 = s1;
	}

	public void display() {
		System.out.println("Manakula ");
		s1.display();
	}
	
	public college() {
		System.out.println("College object created");
	}
}