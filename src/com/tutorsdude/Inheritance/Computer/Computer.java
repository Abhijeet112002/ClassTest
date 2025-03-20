package com.tutorsdude.Inheritance.Computer;

public class Computer {

    public String brand;

    public Moniter moniter;
    public Keyboard keyboard;
    public Ram[] ram;
    public Speaker[] speaker;

    public void printall(){
        System.out.println("computer brand name:" + brand);
        System.out.println("moniter:" + moniter);
        System.out.print("keyboard:" + keyboard);
        System.out.println("ram:" + ram);
        System.out.println("Speaker:" + speaker);

        for (int i=0;i<ram.length;i++){
            ram[i].printall();
        }

        for( int i=0; i<speaker.length; i++){
            speaker[i].printall();
        }


    }
}
