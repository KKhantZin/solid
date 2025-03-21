package com.jdc.solid.isp;

public class WithoutISP {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
        waiter.serveFood(); 
        waiter.cookFood();  // Exception 

        Chef chef = new Chef();
        chef.cookFood(); 
        chef.serveFood();   // Exception 

        DeliveryPerson delivery = new DeliveryPerson();
        delivery.deliverFood();
        delivery.cookFood();    // Exception
	}
}

interface ResturantEmployee {
	void serveFood(); 	// for waiter

	void cookFood(); 	// for chef

	void deliverFood(); // for deliveryPerson

	void manageInventory(); 	// for manager
}

class Waiter implements ResturantEmployee {

	public void serveFood() {
		System.out.println("Waiter is serving food to customers.");
	}

	public void cookFood() {
		throw new UnsupportedOperationException("Waiter cannot cook food!");
	}

	public void deliverFood() {
		throw new UnsupportedOperationException("Waiter cannot deliver food!");
	}

	public void manageInventory() {
		throw new UnsupportedOperationException("Waiter cannot manage inventory!");
	}
}

class Chef implements ResturantEmployee {
	
	public void serveFood() {
        throw new UnsupportedOperationException("Chef cannot serve food!");
    }

    public void cookFood() {
        System.out.println("Chef is cooking delicious food.");
    }

    public void deliverFood() {
        throw new UnsupportedOperationException("Chef cannot deliver food!");
    }

    public void manageInventory() {
        System.out.println("Chef is managing kitchen inventory.");
    }
}

class DeliveryPerson implements ResturantEmployee {
    public void serveFood() {
        throw new UnsupportedOperationException("Delivery Person cannot serve food!");
    }

    public void cookFood() {
        throw new UnsupportedOperationException("Delivery Person cannot cook food!");
    }

    public void deliverFood() {
        System.out.println("Delivery Person is delivering food to customers.");
    }

    public void manageInventory() {
        throw new UnsupportedOperationException("Delivery Person cannot manage inventory!");
    }
}

/*
 ပြဿနာ:

Waiter က စားပွဲထိုးတာပဲ လုပ်နိုင်ပြီး cookFood() တို့ deliverFood() တို့ကို မလုပ်နိုင်ဘူး။ 
ဒါပေမယ့် interface မှာ ပါတာကြောင့် အတင်းအကျပ် implement လုပ်ရတယ်။
ဒီလိုပဲ Chef နဲ့ DeliveryPerson မှာလည်း သူတို့ မလိုအပ်တဲ့ method တွေကို အလကားထည့်ထားရတယ်။
ဒါက ကုဒ်ကို ရှုပ်ထွေးစေပြီး နောက်ပိုင်း ထိန်းသိမ်းရခက်စေတယ်။
 */






