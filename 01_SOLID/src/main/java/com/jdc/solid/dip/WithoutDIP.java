package com.jdc.solid.dip;

public class WithoutDIP {
	public static void main(String[] args) {
		Computer c1 = new Computer();
		c1.start();
	}
}

class Keyboard {
	public void type() {
		System.out.println("Typing with keyboard.");
	}
}

class Computer {
	private Keyboard keyboard = new Keyboard();
	
	public void start() {
		keyboard.type();
	}
	
}

/*
 ဒီကုဒ်မှာ Computer class က Keyboard class ကို တိုက်ရိုက် မှီခိုနေတယ်။ 
 အကယ်၍ Keyboard အစား Mouse ထည့်ချင်ရင် Computer class ကို ပြန်ပြင်ရမယ်။ 
 ဒါက Tight Coupling ဖြစ်သွားတယ်။
 */
