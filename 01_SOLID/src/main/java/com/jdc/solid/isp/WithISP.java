package com.jdc.solid.isp;

public class WithISP {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();

        Waiter1 waiter = new Waiter1();
        Chef1 chef = new Chef1();
        DeliveryPerson1 delivery = new DeliveryPerson1();
        Manager1 manager = new Manager1();

        System.out.println("Assigning tasks:");
        restaurant.assignWork(waiter);         
        restaurant.assignCooking(chef);         
        restaurant.assignDelivery(delivery);     
        restaurant.assignInventoryManagement(manager); 
        restaurant.assignWork(manager);
	}
}

class Restaurant {
    public void assignWork(Servable servant) {
        servant.serveFood();
    }

    public void assignCooking(Cookable cook) {
        cook.cookFood();
    }

    public void assignDelivery(Deliverable delivery) {
        delivery.deliverFood();
    }

    public void assignInventoryManagement(InventoryManageable manager) {
        manager.manageInventory();
    }
}

interface Servable {
    void serveFood();
}

interface Cookable {
    void cookFood();
}

interface Deliverable {
    void deliverFood();
}

interface InventoryManageable {
    void manageInventory();
}

class Waiter1 implements Servable {
    public void serveFood() {
        System.out.println("Waiter is serving food to customers.");
    }
}

// စာဖိုမှူး - ချက်ပြုတ်တာ နဲ့ ပစ္စည်းစာရင်းစစ်တာ လုပ်တယ်
class Chef1 implements Cookable, InventoryManageable {
    public void cookFood() {
        System.out.println("Chef is cooking delicious food.");
    }

    public void manageInventory() {
        System.out.println("Chef is managing kitchen inventory.");
    }
}

// ပို့ဆောင်သူ - ပို့ဆောင်တာပဲ လုပ်တယ်
class DeliveryPerson1 implements Deliverable {
    public void deliverFood() {
        System.out.println("Delivery Person is delivering food to customers.");
    }
}

class Manager1 implements Servable, InventoryManageable {
    public void serveFood() {
        System.out.println("Manager is serving food when needed.");
    }

    public void manageInventory() {
        System.out.println("Manager is managing restaurant inventory.");
    }
}

/*
 ဘာကောင်းသွားလဲ?
တာဝန်ခွဲခြားမှု: Interface တွေကို တာဝန်အလိုက် ခွဲထားတာကြောင့် class တစ်ခုချင်းစီမှာ သူ့ရဲ့ လိုအပ်တဲ့ တာဝန်တွေပဲ ရှိတယ်။
Waiter မှာ serveFood() ပဲ ရှိတယ်။ cookFood() တို့ မလိုအပ်တော့ဘူး။
Chef မှာ cookFood() နဲ့ manageInventory() ပဲ ရှိတယ်။
ပြောင်းလွယ်ပြင်လွယ်: နောက်ထပ် ဝန်ထမ်းအသစ် (ဥပမာ Cashier) ထပ်ထည့်ရင် သူ့အတွက် လိုအပ်တဲ့ interface ကို အလွယ်တကူ သုံးလို့ရတယ်။
ပြန်သုံးရလွယ်ကူမှု: Restaurant class မှာ method တွေက interface တွေကို အခြေခံထားတာကြောင့် 
ဘယ် class က ဘယ် interface ကို implement လုပ်ထားသလဲဆိုတာကို စဉ်းစားစရာမလိုဘူး။
ပိုသပ်တဲ့ကုဒ်: မလိုအပ်တဲ့ method တွေ ထည့်စရာမလိုတော့ဘူး။ Exception ပစ်ရတာမျိုး မဖြစ်တော့ဘူး။
*/