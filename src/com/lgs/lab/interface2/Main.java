package com.lgs.lab.interface2;

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator(31.2,55.8);
        myCalculator.addition();
        myCalculator.division();
        myCalculator.multiplication();
        myCalculator.subtraction();
    }
}
