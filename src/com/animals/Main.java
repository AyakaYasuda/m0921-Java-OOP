package com.animals;

import com.animals.animals.Crocodile;
import com.animals.animals.Eagle;
import com.animals.animals.Eel;


public class Main {
	
	public static void main(String[] args) {
		
		Crocodile crocodile = new Crocodile(50, 400, "reptile", "B", "dry", true, "hard-shelled");
		System.out.println(crocodile.showInfo());
		
		Eel eel = new Eel(10, 3, "Fish", "unknown", true, true, true);
		System.out.println(eel.showInfo());
		
		Eagle eagle = new Eagle(30, 40, "birds", "B", true, true);
		System.out.println(eagle.showInfo());
	}
	
}
