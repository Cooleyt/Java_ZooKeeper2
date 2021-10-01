package com.practice.zookeeper2;

public class Bat extends Human {
	public void fly() {
		this.setEnergy(this.getEnergy()-50);
		System.out.println("The bat is taking off! Swoooosh! He loses energy");
	}
	
	public void eatHumans() {
		this.setEnergy(this.getEnergy()+25);
		System.out.println("The bat just at a human! He gains energy");
	}
	
	public void attackTown() {
		this.setEnergy(this.getEnergy()-100);
		System.out.println("The bat just attacked a town and its burning! He loses a lot of energy");
	}
}
