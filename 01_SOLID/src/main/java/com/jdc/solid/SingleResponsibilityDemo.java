package com.jdc.solid;

public class SingleResponsibilityDemo {
	public static void main(String[] args) {
		
	}
}

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // ဝန်ထမ်း အချက်အလက် သိမ်းတယ်
    public void saveToDatabase() {
        System.out.println("Saving " + name + " with salary " + salary + " to database.");
    }

    // အစီရင်ခံစာ ထုတ်တယ်
    public void generateReport() {
        System.out.println("Generating report for " + name + ": Salary = " + salary);
    }
}

/*
 Employee class မှာ တာဝန်တွေ အများကြီးရှိနေတယ် (data management, database interaction, report generation)။
Database logic ပြောင်းလဲရင် ဒီ class ကို ပြင်ရမယ်။ Report format ပြောင်းလဲရင်လည်း ဒီ class ကို ပြင်ရမယ်။ ဒါက SRP ကို ချိုးဖောက်တာပါ
 * 
 */
