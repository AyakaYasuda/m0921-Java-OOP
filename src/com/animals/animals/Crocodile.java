package com.animals.animals;

import com.animals.classes.Reptile;

public class Crocodile extends Reptile {
	
	public Crocodile(int height, int weight, String animalType, String bloodType, String skin, Boolean hasBackbone,
			String eggs) {
		super(height, weight, animalType, bloodType, skin, hasBackbone, eggs);
	}

	@Override
	public String showInfo() {
		return "Crocodile [getSkin()=" + getSkin() + ", getHasBackbone()=" + getHasBackbone() + ", getEggs()="
				+ getEggs() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getAnimalType()="
				+ getAnimalType() + ", getBloodType()=" + getBloodType();
	}

}
