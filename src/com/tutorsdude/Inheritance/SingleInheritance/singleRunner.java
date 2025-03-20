package com.tutorsdude.Inheritance.SingleInheritance;

public class singleRunner {

    public static void main(String[] args) {

        Fruit fruit = new Fruit();
        fruit.name = "xyz";
        System.out.println(fruit.name);
        fruit.getFruit();

        Apple apple = new Apple();
        apple.name = "swhdjlq";
        System.out.println(apple.name);
        fruit.getFruit();
    }
}
