package com.company;

public class main {
    public static void main(String[] args) {
        Ball b1 = new Ball("Blue", 2);
        Ball b2 = new Ball("Green", 7);
        Ball b3 = new Ball("White");
        b1.setDiameter(1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}