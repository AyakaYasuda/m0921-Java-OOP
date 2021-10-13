package com.animals.animals;

import com.animals.classes.Birds;

public class Eagle extends Birds{
	

	public Eagle(int height, int weight, String animalType, String bloodType, Boolean hasFeathers, Boolean canFly) {
		super(height, weight, animalType, bloodType, hasFeathers, canFly);
	}

	@Override
	public String showInfo() {
		return "Eagle [getSkin()=" + getSkin() + ", getCanFly()=" + getCanFly() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getAnimalType()=" + getAnimalType() + ", getBloodType()="
				+ getBloodType() + "]";
	}
	
	

}
