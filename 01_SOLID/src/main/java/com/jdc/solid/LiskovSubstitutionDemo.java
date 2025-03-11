package com.jdc.solid;

public class LiskovSubstitutionDemo {
	public static void main(String[] args) {
		Animal dog = new Dog();
		makeAnimalEat(dog);
		
		Animal robot = new Robot();
		makeAnimalEat(robot);
	}
	
	static void makeAnimalEat(Animal animal) {
		animal.eat();
	}
}


class Animal {
	void eat() {
		System.out.println("I am animal, I am eat.");
	}
}

class Dog extends Animal {
	
}

class Robot extends Animal {
	
	public void eat() { 
		throw new RuntimeException("I am a robot, I can't eat");
	}
}