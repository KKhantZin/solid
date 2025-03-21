package com.jdc.solid.liskov;

public class ListkovPrinciple {
	public static void main(String[] args) {

		Bird b1 = new Eagle();
		flyMethod(b1);

		Bird b2 = new Ostrich();
		flyMethod(b2);

	}

	static void flyMethod(Bird bird) {
		bird.fly();
	}
}

class Bird {
    public void fly() {
        System.out.println("I can fly!");
    }
}

class Eagle extends Bird {

}

class Ostrich extends Bird {

	@Override
	public void fly() {
		throw new UnsupportedOperationException("Ostriches cannot fly.");
	}
}

/*
	Bird ဆိုတဲ့ superclass မှာ fly() ဆိုတဲ့ method ရှိတယ်။
Ostrich ဆိုတဲ့ subclass က Bird ကို အမွေဆက်ခံပြီး fly() method ကို override လုပ်ထားပေမယ့် အလုပ်မလုပ်နိုင်တဲ့ ပုံစံမျိုး (exception ပစ်တယ်) ဖြစ်နေတယ်။
letBirdFly() ဆိုတဲ့ method က Bird type ကို လက်ခံပြီး fly() ကို ခေါ်တယ်။ 
ဒါပေမယ့် Ostrich ကို ထည့်လိုက်တဲ့အခါ exception တက်ပြီး ပရိုဂရမ်ရဲ့ မှန်ကန်မှု (correctness) ကို ထိခိုက်စေတယ်။
ဒါက LSP ကို ချိုးဖောက်တဲ့ ဥပမာပါ။ ဘာလို့လဲဆိုတော့ Bird ကို အသုံးပြုထားတဲ့နေရာမှာ Ostrich ကို အစားထိုးလိုက်တဲ့အခါ ပရိုဂရမ်က မမျှော်လင့်တဲ့ ပြဿနာတက်လာလို့ပဲ။
 */
