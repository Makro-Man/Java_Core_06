package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
   private double x;
   private double y;

    MyCalculator(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void division() {
        double d = x / y;
        System.out.println("Ділення : "+d);
    }

    @Override
    public void subtraction() {
        double s = x - y;
        System.out.println("Віднімання : "+s);
    }

    @Override
    public void multiplication() {
        double m = x * y;
        System.out.println("Множення : "+m);
    }

    @Override
    public void addition() {
        double a = x + y;
        System.out.println("Додавання : "+a);
    }
}
