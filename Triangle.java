package com.company;

public class Triangle extends Shape {
    private double a;
    private  double b;
    private  double c;
    private double s;

    public  Triangle(String colorShape, double a, double b, double c) {
        super(colorShape);
        this.a = a;
        this.b = b;
        this.c = c;
        if (a >= b+c || b >= a+c || c >= a+b){
            System.out.println("One side of triangle can't be bigger than sum of others two!");
        }
        s = (a + b + c) / 2;
    }

    @Override
    public String toString() {
        if (a >= b+c || b >= a+c || c >= a+b) {
            return "";
        }
        return super.toString() +
                ", a=" + a + ", b=" + b + ", c=" + c;
    }

    @Override
    public double calcArea() {
        if (a >= b+c || b >= a+c || c >= a+b) {
            return 0;
        }
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public void draw() {
        if (a >= b+c || b >= a+c || c >= a+b) {
            return;
        }
        System.out.printf("%s; area=%.2f\n", this, calcArea());
    }
}
