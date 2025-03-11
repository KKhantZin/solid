package com.jdc.solid.open_vs_close;

public class Shape {
	
	String type;
	
	public Shape(String type) {
		this.type = type;
	}
}

class AreaCalculator {
	public double calculateArea(Shape shape) {
		if(shape.type.equals("circle")) {
			return Math.PI * 5 * 5;
		} else if(shape.type.equals("rectangle")) {
			// width = 4, height = 6
			return 4 * 6;
		}
		
		return 0;
	}
}

