package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		Results student1 = new Results(20, 40, 60);
		Results student2 = new Results(70, 40, 150);
		Results student3 = new Results(115, 125, 150);
		System.out.println(student1.getTotal());
		System.out.println(student1.percentageCalc());
		System.out.println(student1.doPassSubject(student2.biology));
		student1.doPassOverall();
		student2.doPassOverall();
		student3.doPassOverall();
	}
}
