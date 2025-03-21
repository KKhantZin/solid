package com.jdc.solid.open_vs_close;

public interface ShapeInterface {
	
	double calculateArea();
}

class AreaCalculator1 {
	public double calculateArea(ShapeInterface shape) {
		return shape.calculateArea();
	}
}

class Circle1 implements ShapeInterface {
	
	private double radius;
	
	public Circle1(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		
		return Math.PI * radius * radius;
	}
	
}

class Rectangle1 implements ShapeInterface {
	private double width;
	private double height;
	
	public Rectangle1(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return width * height;
	}
}

/*
 ဒီကုဒ်ရဲ့ အားသာချက်
Open for Extension: ပုံသဏ္ဍာန်အသစ် (ဥပမာ Triangle) ထပ်ထည့်ချင်ရင် Shape interface ကို implement လုပ်တဲ့ class အသစ်တစ်ခု ရေးရုံပဲ။ 
AreaCalculator ကို ပြင်စရာမလိုပါဘူး။
ဥပမာ Triangle ထည့်ချင်ရင်:

class Triangle implements Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

Closed for Modification: AreaCalculator က တစ်ခါရေးပြီးရင် ပြန်ပြင်စရာမလိုတော့ဘူး။ သူက Shape interface ကိုပဲ မှီခိုထားတယ်။

နိဂုံး
Open/Closed Principle ကို လိုက်နာဖို့ဆိုရင် abstraction (interface သို့မဟုတ် abstract class) ကို အသုံးပြုပြီး ကုဒ်ကို ဒီဇိုင်းထုတ်ရပါမယ်။ 
ဒီလိုလုပ်ခြင်းအားဖြင့် ကုဒ်ကို ပြင်ဆင်စရာမလိုပဲ လုပ်ဆောင်ချက်အသစ်တွေ ထပ်ဖြည့်နိုင်မှာဖြစ်တယ်။ 
ကျွန်တော်ပြထားတဲ့ ဥပမာတွေကနေ OCP ရဲ့ အရေးပါမှုကို နားလည်လောက်ပြီလို့ မျှော်လင့်ပါတယ်။ နောက်ထပ် မေးစရာရှိရင် မေးလို့ရပါတယ်ခင်ဗျာ။
*/



