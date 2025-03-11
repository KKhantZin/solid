package com.jdc.solid.open_vs_close;

public interface ShapeInterface {
	
	double calculateArea();
}

class AreaCalculator1 {
	public double calculateArea(ShapeInterface shape) {
		return shape.calculateArea();
	}
}

class Circle1 implements ShapeInterface {
	
	private double radius;
	
	public Circle1(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		
		return Math.PI * radius * radius;
	}
	
}

class Rectangle1 implements ShapeInterface {
	private double width;
	private double height;
	
	public Rectangle1(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}
}
