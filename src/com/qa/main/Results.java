package com.qa.main;

public class Results {
	double physics;
	double chemistry;
	double biology;
	double total;
	float percentage;
	
	public Results(int physicsMark, int chemistryMark, int biologyMark) {
		this.physics = physicsMark;
		this.chemistry = chemistryMark;
		this.biology = biologyMark;
		this.total = (double) this.physics + this.chemistry + this.biology;
	}
	
	public double getTotal() {
		return total;
	}
	
	public float percentageCalc() {
		float result = (float) (this.total/450);
		return result*100;
	}
	
	public boolean doPassSubject(double grade) {
		double result = grade/150;
		double percentResult = result * 100;
		if (percentResult >= 60) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void doPassOverall() {
		double biologyPercent = (this.biology/150)*100;
		double chemistryPercent = (this.chemistry/150)*100;
		double physicsPercent = (this.physics/150)*100;
		double overallGrade = (biologyPercent + chemistryPercent + physicsPercent)/3;
		System.out.println("Your overall grade is: " + overallGrade + "%"); 
		
		if (biologyPercent < 60) {
			System.out.println("You failed because your biology grade was: " + biologyPercent + "%");
		}
		
		if (chemistryPercent < 60) {
			System.out.println("You failed because your biology grade was: " + chemistryPercent + "%");
		}
		
		if (physicsPercent < 60) {
			System.out.println("You failed because your biology grade was: " + physicsPercent + "%");
		}
	}
}
