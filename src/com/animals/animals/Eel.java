package com.animals.animals;

import com.animals.classes.Fish;

public class Eel extends Fish{
	
	private Boolean releaseElectricCharge;
	

	public Eel(int height, int weight, String animalType, String bloodType, Boolean liveInwater, Boolean hasGills, Boolean releaseElectricCharge) {
		super(height, weight, animalType, bloodType, liveInwater, hasGills);
		this.releaseElectricCharge = true;
	}

	public Boolean getReleaseElectricCharge() {
		return releaseElectricCharge;
	}

	@Override
	public String showInfo() {
		return "Eel [releaseElectricCharge=" + releaseElectricCharge + ", getLiveInwater()=" + getLiveInwater()
				+ ", getHasGills()=" + getHasGills() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()
				+ ", getAnimalType()=" + getAnimalType() + ", getBloodType()=" + getBloodType() + "]";
	}
	
	

}
