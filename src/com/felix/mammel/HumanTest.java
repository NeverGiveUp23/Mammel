package com.felix.mammel;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human();
		Dog d = new Dog();
		
		System.out.println(" ------ Human Talking -----");
		h.regulateTemp();
		h.startSleeping();
		h.goToWork();
		boolean sleeping = h.isSleeping();
		
		
		if(sleeping) {
			System.out.println("The Human is sleeping!");
			
		}
		
		System.out.println(" ------ Dog Talking -----");
		d.iCanWalk();
		d.startSleeping();

	}

}
