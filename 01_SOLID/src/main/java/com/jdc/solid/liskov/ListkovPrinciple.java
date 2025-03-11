package com.jdc.solid.liskov;

public class ListkovPrinciple {
	public static void main(String[] args) {

		Bird b1 = new Eagle();
		flyMethod(b1);

		Bird b2 = new Ostrich();
		flyMethod(b2);

	}

	static void flyMethod(Bird bird) {
		bird.fly();
	}
}

class Bird {
    public void fly() {
        System.out.println("I can fly!");
    }
}

class Eagle extends Bird {

}

class Ostrich extends Bird {

	@Override
	public void fly() {
		throw new UnsupportedOperationException("Ostriches cannot fly.");
	}
	
}
