package com.tutorsdude.Inheritance;

import com.tutorsdude.Inheritance.Computer.*;

public class Runner {

        public static void main(String[] args) {

            Computer computer = new Computer();

            computer.brand = "Hp";
            System.out.println("computer brand is :" + computer.brand);

            Keyboard keyboard = new Keyboard();

            keyboard.noOfKeys = 100;
            keyboard.brand = "hp keyboard";
            keyboard.price = 5000;

            keyboard.printall();


            Ram ram1 = new Ram();
            ram1.storage = 256;
            ram1.price = 100000;

            Ram ram2 = new Ram();
            ram2.storage = 2546;
            ram2.price = 200000;

            Ram ram3 = new Ram();
            ram3.storage = 2346;
            ram3.price = 300000;

            Ram[] ramarray = { ram1,ram2,ram3};
            computer.ram = ramarray;

            computer.printall();

            Speaker speaker1 = new Speaker();
            speaker1.brand = "hp speaker";
            speaker1.price = 40000;
            speaker1.qualityType = "good";

            Speaker speaker2 = new Speaker();
            speaker2.brand = "hp speaker";
            speaker2.price = 40000;
            speaker2.qualityType = "good";

            Speaker speaker3 = new Speaker();
            speaker3.brand = "hp speaker";
            speaker3.price = 40000;
            speaker3.qualityType = "good";

            Speaker[] speakerArray = { speaker1,speaker2,speaker3};
            computer.speaker = speakerArray;


            computer.printall();


            Moniter moniter = new Moniter();

            moniter.brand = "hp";
            moniter.price = 20000;

            Display display = new Display();
            display.resolution = "HD";
            display.brand = "LED";

            computer.moniter = moniter;


            computer.printall();












        }


    }




