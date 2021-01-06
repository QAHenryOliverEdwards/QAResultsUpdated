package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		Results student1 = new Results(20, 40, 60);
		System.out.println(student1.getTotal());
		System.out.println(student1.percentageCalc());
	}
}
