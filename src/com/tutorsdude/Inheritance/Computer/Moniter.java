package com.tutorsdude.Inheritance.Computer;

import java.sql.SQLOutput;

public class Moniter {

    public String brand;
    public Display display;
    public int price;

    public void printall(){
        System.out.println("moniter brand name:" + brand);
        System.out.println("moniter display:" + display);
        System.out.println("price of the moniter is :" + price);

        display.printall();

    }










}
