package com.animals.classes;

import com.animals.parent.Animal;

public class Fish extends Animal{
	
	private Boolean liveInwater;
	private Boolean hasGills;
	
	public Fish() {
		super();
		this.liveInwater = true;
		this.hasGills = true;
	}
	
	public Fish(int height, int weight, String animalType, String bloodType, Boolean liveInwater, Boolean hasGills) {
		super(height, weight, animalType, bloodType);
		this.liveInwater = liveInwater;
		this.hasGills = hasGills;
	}

	public Boolean getLiveInwater() {
		return liveInwater;
	}

	public Boolean getHasGills() {
		return hasGills;
	}
	
}	