package com.jdc.solid.liskov;

public class WithListkovPrinciple {
	
	static void flyMethod(Flyable bird) {
		bird.fly();
	}
	
	public static void main(String[] args) {
		Flyable b1 = new Sparrow();
		flyMethod(b1);
	
	}
}

interface Flyable {
	void fly();
}

class Bird1 {
	
}

class Sparrow extends Bird1 implements Flyable {

	@Override
	public void fly() {
		System.out.println("Sparrow can fly.");
	}
}

class Ostrich1 extends Bird1 {
	
}

/*
 ဒီဥပမာမှာ:

Flyable ဆိုတဲ့ interface တစ်ခုထပ်ထည့်ပြီး ပျံနိုင်တဲ့ ငှက်တွေကိုပဲ အဲဒီ interface ကို implement လုပ်ခိုင်းတယ်။
Sparrow က Flyable ကို implement လုပ်ထားလို့ fly() method ကို မှန်ကန်စွာ အလုပ်လုပ်နိုင်တယ်။
Ostrich က Flyable ကို implement မလုပ်ထားဘူး၊ ဒါကြောင့် သူ့ကို fly() လုပ်ဖို့ မခိုင်းတော့ဘူး။
ဒီလိုလုပ်တာက Bird ကို အစားထိုးတဲ့နေရာမှာ ပြဿနာမရှိတော့ဘူး။
ဒါက LSP ကို လိုက်နာတဲ့ ပုံစံပါ။
 */
