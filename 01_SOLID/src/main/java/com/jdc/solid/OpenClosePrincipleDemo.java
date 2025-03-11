package com.jdc.solid;

public class OpenClosePrincipleDemo {
    public static void main(String[] args) {
        Shape circle = new Shape("circle");
        Shape rectangle = new Shape("rectangle");

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Circle Area: " + calculator.calculateArea(circle));
        System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
    }
}

class Shape {
    String type;

    Shape(String type) {
        this.type = type;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        if (shape.type.equals("circle")) {
            // Assume radius is 5 for simplicity
            return Math.PI * 5 * 5;
        } else if (shape.type.equals("rectangle")) {
            // Assume width = 4, height = 6
            return 4 * 6;
        }
        return 0;
    }
}

/*
ပုံသဏ္ဍာန်အသစ် (ဥပမာ triangle) ထပ်ထည့်ချင်ရင် AreaCalculator ထဲက calculateArea မှာ if-else အသစ်ထပ်ရေးရမယ်။
ဒါက ရှိပြီးသား ကုဒ်ကို ပြင်ဆင်ရတာဖြစ်လို့ OCP ကို ချိုးဖောက်တယ်။
ပုံသဏ္ဍာန်များလာတာနဲ့အမျှ if-else တွေ အများကြီးဖြစ်လာပြီး ကုဒ်က ရှုပ်ထွေးလာမယ်။
*/




