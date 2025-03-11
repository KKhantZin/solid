package com.jdc.solid.srp;

public class Student {
	
	private String name;
	private int[] marks;
	
	public Student(String name, int [] marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public String getName() {
		return name;
	}
	
	public int[] getMarks() {
		return marks;
	}
	
	// calculate average marks
//	public double calculateAverage() {
//		int total = 0;
//		for(int mark : marks) {
//			total += mark;
//		}
//		
//		return total / (double) marks.length;
//	}
	
	// calculate grade
//	public String calculateGrade() {
//		double average = calculateAverage();
//		if (average >= 80)
//			return "A";
//		else if (average >= 60)
//			return "B";
//		else if (average >= 40)
//			return "C";
//		else
//			return "F";
//	}
	
	// save result to file
//	public void saveResultToFile() {
//		System.out.println("\nSaving result for " + name + ": Average = " + 
//							calculateAverage() + ", Grade = " + calculateGrade() + " to file.");
//	}
	
	// print result
//	public void printResult() {
//		System.out.println("Student Name : " + name);
//		System.out.println("\nMarks");
//		System.out.println("*****");
//		for (int i = 0; i < marks.length; i++) {
//			System.out.println("Subject " + (i + 1) + ": " + marks[i]);
//		}
//
//		System.out.println("\nAverage : " + calculateAverage());
//		System.out.println("Grade : " + calculateGrade());
//	}

}
