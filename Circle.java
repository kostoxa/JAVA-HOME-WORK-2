package com.company;

public class Circle extends Shape{
    private double r;
    private  double pi;

    public  Circle(String colorShape, double r) {
        super(colorShape);
        this.r = r;
        pi = Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", r=" + r;
    }

    @Override
    public double calcArea() {
        return pi*r*r;
    }

    @Override
    public void draw() {
        System.out.printf("%s; area=%.2f\n", this, calcArea());
    }
}
