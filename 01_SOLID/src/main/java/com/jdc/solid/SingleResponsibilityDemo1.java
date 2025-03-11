package com.jdc.solid;

//ဝန်ထမ်း အချက်အလက်ကို ကိုင်တွယ်ဖို့ class
class Employee1 {
	private String name;
	private double salary;

	public Employee1(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
}

//Database ကို သိမ်းဖို့ class
class EmployeeRepository {
	public void saveToDatabase(Employee1 employee) {
		System.out.println("Saving " + employee.getName() + " with salary " + employee.getSalary() + " to database.");
	}
}

//အစီရင်ခံစာ ထုတ်ဖို့ class
class EmployeeReportGenerator {
	public void generateReport(Employee1 employee) {
		System.out.println("Generating report for " + employee.getName() + ": Salary = " + employee.getSalary());
	}
}

//အသုံးပြုပုံ
public class SingleResponsibilityDemo1 {
	public static void main(String[] args) {
		Employee1 employee = new Employee1("Kyaw", 50000);
		EmployeeRepository repo = new EmployeeRepository();
		EmployeeReportGenerator report = new EmployeeReportGenerator();

		repo.saveToDatabase(employee);
		report.generateReport(employee);
	}
}