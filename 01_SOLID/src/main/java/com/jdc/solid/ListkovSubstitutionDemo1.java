package com.jdc.solid;

public class ListkovSubstitutionDemo1 {
	public static void makeAnimalEat(Animal animal) {
        animal.eat();
    }

    public static void main(String[] args) {
        Animal robot = new Robot();
        makeAnimalEat(robot); // Exception တက်မယ်!
    }
}