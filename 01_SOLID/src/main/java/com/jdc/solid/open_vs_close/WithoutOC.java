package com.jdc.solid.open_vs_close;

public class WithoutOC {
	public static void main(String[] args) {
		Shape circle = new Shape("circle");
		Shape rectangle = new Shape("rectangle");
		
		
		AreaCalculator area = new AreaCalculator();
		System.out.println("Area of Circle : " + area.calculateArea(circle));
		System.out.println("Area of Rectangle : " + area.calculateArea(rectangle));
	}
}
