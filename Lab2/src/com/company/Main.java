package com.company;


public class Main {

    public static void main(String[] args) {

        MyCounter myCounter = new MyCounter();
        MyCounter2 myCounter2 = new MyCounter2();
        MyCounter3 myCounter3 = new MyCounter3();

        System.out.println(myCounter.count(2.54 , 1.23 , -2.14 , -0.23));
        System.out.println(myCounter2.count(3.56, 1.02, 3, 2.43));
        System.out.println(myCounter3.count(0.58, -0.34, 1.25, 1.88));
    }
}
