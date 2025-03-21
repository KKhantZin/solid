package com.jdc.solid.open_vs_close;

public class WithoutOC {
	public static void main(String[] args) {
		Shape circle = new Shape("circle");
		Shape rectangle = new Shape("rectangle");
		
		
		AreaCalculator area = new AreaCalculator();
		System.out.println("Area of Circle : " + area.calculateArea(circle));
		System.out.println("Area of Rectangle : " + area.calculateArea(rectangle));
	}
}


/*
ဒီကုဒ်မှာ ပြဿနာ
ပုံသဏ္ဍာန်အသစ် (ဥပမာ triangle) ထပ်ထည့်ချင်ရင် AreaCalculator ထဲက calculateArea မှာ if-else အသစ်ထပ်ရေးရမယ်။
ဒါက ရှိပြီးသား ကုဒ်ကို ပြင်ဆင်ရတာဖြစ်လို့ OCP ကို ချိုးဖောက်တယ်။
ပုံသဏ္ဍာန်များလာတာနဲ့အမျှ if-else တွေ အများကြီးဖြစ်လာပြီး ကုဒ်က ရှုပ်ထွေးလာမယ်။
*/