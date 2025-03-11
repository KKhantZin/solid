package com.jdc.solid.liskov;

public class WithListkovPrinciple {
	
	static void flyMethod(Flyable bird) {
		bird.fly();
	}
	
	public static void main(String[] args) {
		Flyable b1 = new Sparrow();
		flyMethod(b1);
	
	}
}

interface Flyable {
	void fly();
}

class Bird1 {
	
}

class Sparrow extends Bird1 implements Flyable {

	@Override
	public void fly() {
		System.out.println("Sparrow can fly.");
	}
}

class Ostrich1 extends Bird1 {
	
}
