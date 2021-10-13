package com.animals.classes;

import com.animals.parent.Animal;

public class Reptile extends Animal{
	
	private String skin;
	private Boolean hasBackbone;
	private String eggs;
	
	public Reptile() {
		super();
		this.skin = "Dry Skin";
		this.hasBackbone = true;
		this.eggs = "soft-shelled";
	}
	
	public Reptile(int height, int weight, String animalType, String bloodType, String skin, Boolean hasBackbone,
			String eggs) {
		super(height, weight, animalType, bloodType);
		this.skin = skin;
		this.hasBackbone = hasBackbone;
		this.eggs = eggs;
	}

	public String getSkin() {
		return skin;
	}

	public Boolean getHasBackbone() {
		return hasBackbone;
	}

	public String getEggs() {
		return eggs;
	}
	
	
}
