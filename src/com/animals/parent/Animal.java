package com.animals.parent;

public class Animal {
	
	private int height;
	private int weight;
	private String animalType;
	private String bloodType;
	
	
	public Animal() {
		this.height = 80;
		this.weight = 200;
		this.animalType = "mammal";
		this.bloodType = "A";
	}
	
	public Animal(int height, int weight, String animalType, String bloodType) {
		this.height = height;
		this.weight = weight;
		this.animalType = animalType;
		this.bloodType = bloodType;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getAnimalType() {
		return animalType;
	}

	public String getBloodType() {
		return bloodType;
	}

	public String showInfo() {
		return "Animal [height=" + height + ", weight=" + weight + ", animalType=" + animalType + ", bloodType="
				+ bloodType + "]";
	}
	
	

}
