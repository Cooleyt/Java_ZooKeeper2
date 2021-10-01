package com.practice.zookeeper2;

public class Human {
	private int energyLevel = 300;
	
	public Human() {
		
	}
	
	public void setEnergy(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int getEnergy() {
		return energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println("The humans energy level is: " + energyLevel );
		return energyLevel;
	}
}
