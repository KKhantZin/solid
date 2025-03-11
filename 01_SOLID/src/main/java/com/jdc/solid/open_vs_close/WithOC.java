package com.jdc.solid.open_vs_close;

public class WithOC {
	public static void main(String[] args) {
		
		Circle1 c1 = new Circle1(5);
		Rectangle1 r1 = new Rectangle1(4, 6);
		
		AreaCalculator1 a1 = new AreaCalculator1();
		System.out.println("Circle Area: " + a1.calculateArea(c1));
        System.out.println("Rectangle Area: " + a1.calculateArea(r1));
	}
}
