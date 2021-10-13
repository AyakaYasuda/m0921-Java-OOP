package com.m0921;

public class Car {

	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	// constructor - set a default
	public Car(){
		doors = "closed";
		driver = "seated";
		engine = "on";
		speed = 60;
	}
	
	// parameterized constructor (no need to use setters)
	public Car(String doors, String engine, String driver, int speed) {
		this.doors = doors;
		this.driver = driver;
		this.engine = engine;
		this.speed = speed;
	}
	
	public String getDoors() {
		return doors;
	}
//	public void setDoors(String doors) {
//		this.doors = doors;
//	}
	public String getEngine() {
		return engine;
	}
//	public void setEngines(String engines) {
//		this.engine = engines;
//	}
	public String getDriver() {
		return driver;
	}
//	public void setDriver(String driver) {
//		this.driver = driver;
//	}
	public int getSpeed() {
		return speed;
	}
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
		
	public String run() {
		if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed > 0) {
			return "running";
		} else {
			return "not running";
		}
	}
}
