package com.jdc.solid.dip;

public class WithDIP {
	public static void main(String[] args) {
		InputDevice keyboard = new Keyboard1();
		Computer1 computer1 = new Computer1(keyboard);
		computer1.start();
		
		InputDevice mouse = new Mouse();
		Computer1 computer2 = new Computer1(mouse);
		computer2.start();
	}
}

class Computer1 {
	private InputDevice device;  // Dependency accepts from interface.
	
	public Computer1 (InputDevice device) {
		this.device = device;
	}
	
	public void start() {
		device.use();
	}
}

interface InputDevice {
	void use();
}

class Keyboard1 implements InputDevice{

	@Override
	public void use() {
		System.out.println("Typing with keyboard...");
	}
}
class Mouse implements InputDevice {
	@Override
    public void use() {
        System.out.println("Clicking with mouse...");
    }
}

/*
 	ဒီမှာတော့ Computer class က InputDevice interface ကို မှီခိုထားပြီး Keyboard ဒါမှမဟုတ် Mouse ကို တိုက်ရိုက် မသိတော့ပါဘူး။ 
 	ဒါကြောင့် နောက်ပိုင်းမှာ Joystick လို အသစ်ထပ်ထည့်ချင်ရင်လည်း Computer class ကို ပြင်စရာမလိုပါဘူး။
 
 အကျဉ်းချုပ်
	Dependency Inversion Principle က ကုဒ်ကို Abstraction တွေကနေ ချိတ်ဆက်ခိုင်းပြီး Concrete Class တွေကို တိုက်ရိုက် မှီခိုမှုကနေ ရှောင်ဖို့ အားပေးတဲ့ နည်းလမ်းပါ။ 
ဒါကြောင့် ကုဒ်က ပိုသန့်ရှင်းပြီး ပြုပြင်ထိန်းသိမ်းရလွယ်ကူပါတယ်။
*/