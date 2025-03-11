package com.jdc.solid.srp;

public class WithoutSRP {
	public static void main(String[] args) {
		int[] marks = {85, 90, 78, 92};
		Student s1 = new Student("Richard", marks);
		
//		s1.printResult();
//		s1.saveResultToFile();
		
		GradeCalculator cal = new GradeCalculator();
		ResultStorage res = new ResultStorage();
		ResultPrinter resp = new ResultPrinter();
		
		double average = cal.calculateAverage(s1);
		String grade = cal.calculateGrade(s1);
		
		resp.printResult(s1, average, grade);
		
		res.saveToFile(s1, average, grade);
		
	}
}
