package com.tutorsdude.Inheritance.Multilevel;

public class Multilevelrunner {

    public static void main(String[] args) {

        Vehicle veh = new Vehicle();
        veh.accelerate();


        Car car = new Car();
        car.transport();

        car.name = "bmw";
        System.out.println(car.name);

        Swift swift = new Swift();

        swift.transport();
        swift.travel();
        swift.color = "red";
        System.out.println(swift.color);
    }
}
