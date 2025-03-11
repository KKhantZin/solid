package com.jdc.solid.srp;

class ResultPrinter {
	public void printResult(Student student, double average, String grade) {
		
		System.out.println("Student: " + student.getName());
		System.out.println("\nMarks");
		System.out.println("*****");
		for (int i = 0; i < student.getMarks().length; i++) {
			System.out.println("Subject " + (i + 1) + ": " + student.getMarks()[i]);
		}
		System.out.println("\nAverage: " + average);
		System.out.println("Grade: " + grade);
	}

	public void printResultInHTML(Student student, double average, String grade) {
		System.out.println("<html><body>");
		System.out.println("<h1>Student: " + student.getName() + "</h1>");
		System.out.println("<p>Marks: </p>");
		for (int i = 0; i < student.getMarks().length; i++) {
			System.out.println("<p>Subject " + (i + 1) + ": " + student.getMarks()[i] + "</p>");
		}
		System.out.println("<p>Average: " + average + "</p>");
		System.out.println("<p>Grade: " + grade + "</p>");
		System.out.println("</body></html>");
	}
}
