package com.jdc.solid.srp;

class ResultStorage {
    public void saveToFile(Student student, double average, String grade) {
        System.out.println("\nSaving result for " + student.getName() + 
        				   ": Average = " + average + ", Grade = " + grade + " to file.");
    }

    public void saveToDatabase(Student student, double average, String grade) {
        System.out.println("\nSaving result for " + student.getName() + 
        				   ": Average = " + average + ", Grade = " + grade + " to database.");
    }
}
