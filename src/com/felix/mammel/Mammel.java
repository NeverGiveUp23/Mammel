package com.felix.mammel;

public class Mammel {
	
	private boolean sleeping = false;
	
	public void regulateTemp() {
		System.out.println("My Temp is just right, for now.");
	}
	
	public void startSleeping() {
		sleeping = true;
		System.out.println("ZzZz");
	}
	
	public boolean isSleeping() {
		return sleeping;
	}
	

}
