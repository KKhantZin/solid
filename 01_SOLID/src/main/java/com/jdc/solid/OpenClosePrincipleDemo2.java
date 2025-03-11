package com.jdc.solid;

//Shape ဆိုတဲ့ interface တစ်ခု ဖန်တီးတယ်
interface Shape1 {
 double calculateArea();
}

//Circle အတွက် သီးသန့် class
class Circle implements Shape1 {
 private double radius;

 Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}

//Rectangle အတွက် သီးသန့် class
class Rectangle implements Shape1 {
 private double width;
 private double height;

 Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 @Override
 public double calculateArea() {
     return width * height;
 }
}

//AreaCalculator က Shape interface ကိုပဲ မှီခိုတယ်
class AreaCalculator1 {
 public double calculateArea(Shape1 shape) {
     return shape.calculateArea();
 }
}

public class OpenClosePrincipleDemo2 {
 public static void main(String[] args) {
     Shape1 circle = new Circle(5);
     Shape1 rectangle = new Rectangle(4, 6);

     AreaCalculator1 calculator = new AreaCalculator1();
     System.out.println("Circle Area: " + calculator.calculateArea(circle));
     System.out.println("Rectangle Area: " + calculator.calculateArea(rectangle));
 }
}
