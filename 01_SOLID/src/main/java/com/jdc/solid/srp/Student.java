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

/*
 ဒီ Student class မှာ တာဝန်တွေ အများကြီး ရှိနေတာကြောင့် SRP ကို ချိုးဖောက်ပါတယ်။ အောက်က ပြဿနာတွေ ဖြစ်လာနိုင်ပါတယ်။
 
 ၁. အဆင့် တွက်ချက်မှု ပြောင်းလဲရင် Student Class ကို ပြင်ရမယ်
ဥပမာ၊ အဆင့် သတ်မှတ်တဲ့ စံနှုန်းကို ပြောင်းမယ်ဆိုရင် (ဥပမာ၊ A ကို 90 အထက်မှ ပေးမယ်) calculateGrade() ကို ပြင်ရမှာဖြစ်ပြီး Student class ကို ထိရမယ်။

၂. ဖိုင်သိမ်းတဲ့ နည်းလမ်း ပြောင်းလဲရင်လည်း Student Class ကို ပြင်ရမယ်
ဥပမာ၊ ဖိုင်သိမ်းတာကို ရိုးရိုး text file ကနေ database ထဲ သိမ်းမယ်ဆိုရင် saveResultToFile() ကို ပြင်ရမှာဖြစ်ပြီး Student class ကို ထိရမယ်။

၃. ပုံနှိပ်မှု ပုံစံ ပြောင်းလဲရင်လည်း Student Class ကို ပြင်ရမယ်
ဥပမာ၊ ရလဒ်ကို ပုံနှိပ်တဲ့ ပုံစံကို HTML format နဲ့ ပုံနှိပ်မယ်ဆိုရင် printResult() ကို ပြင်ရမှာဖြစ်ပြီး Student class ကို ထိရမယ်။

SRP ကို လိုက်နာတဲ့ ဥပမာ
အခု တာဝန်တွေကို ခွဲထုတ်ပြီး သီးသန့် class တွေမှာ ထည့်ထားပါမယ်။

Student class က ကျောင်းသား အချက်အလက်နဲ့ အမှတ်တွေ စီမံခန့်ခွဲမှုကိုပဲ တာဝန်ယူမယ်။
GradeCalculator class က ပျမ်းမျှအမှတ်နဲ့ အဆင့် တွက်ချက်မှုကို တာဝန်ယူမယ်။
ResultStorage class က ရလဒ်ကို ဖိုင်ထဲ သိမ်းတာကို တာဝန်ယူမယ်။
ResultPrinter class က ရလဒ်ကို ပုံနှိပ်တာကို တာဝန်ယူမယ်။

=================================================================================================

SRP လိုက်နာလိုက်တော့ ဘာကောင်းလာလဲ?
ပြောင်းလဲမှု လွယ်ကူလာတယ်: ဥပမာ၊ အဆင့် သတ်မှတ်တဲ့ စံနှုန်းကို ပြောင်းချင်ရင် GradeCalculator ကိုပဲ ပြင်ရင်ရပြီ။ Student ကို ထိစရာ မလိုတော့ဘူး။
ပြန်သုံးဖို့ လွယ်ကူလာတယ်: ResultPrinter ကို အခြား project မှာ ပြန်သုံးချင်ရင် သီးသန့် ယူသုံးလို့ရတယ်။
Testing လုပ်ရတာ လွယ်ကူလာတယ်: Student ကို test လုပ်ရင် အချက်အလက်နဲ့ အမှတ်တွေ စီမံခန့်ခွဲမှုကိုပဲ အာရုံစိုက်ရင်ရပြီ။ 
အဆင့် တွက်ချက်မှု ဒါမှမဟုတ် ပုံနှိပ်မှုနဲ့ ပတ်သက်တာတွေ စဉ်းစားစရာ မလိုတော့ဘူး။
ပိုမြင်သာလာတယ်: ကုဒ်တွေက သီးသန့်ဖြစ်နေတော့ ဘယ် class က ဘာလုပ်လဲ ဆိုတာ ရှင်းရှင်းလင်းလင်း သိလာတယ်။
 */
