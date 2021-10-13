package com.animals.classes;

import com.animals.parent.Animal;

public class Birds extends Animal{
	
	private Boolean hasFeathers;
	private Boolean canFly;
	
	public Birds() {
		super();
		this.hasFeathers = true;
		this.canFly = true;
	}

	public Birds(int height, int weight, String animalType, String bloodType, Boolean hasFeathers, Boolean canFly) {
		super(height, weight, animalType, bloodType);
		this.hasFeathers = hasFeathers;
		this.canFly = canFly;
	}

	public Boolean getSkin() {
		return hasFeathers;
	}

	public Boolean getCanFly() {
		return canFly;
	}
	
	

	
	

}
