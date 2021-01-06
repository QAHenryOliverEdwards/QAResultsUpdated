package com.qa.main;

public class Results {
	int physics;
	int chemistry;
	int biology;
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
}
