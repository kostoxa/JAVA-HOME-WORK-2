package com.company;

public class Main {

    public static void main(String[] args) {
//        Shape rectanle = new Rectangle("RED", 10, 4);
//        rectanle.draw();
//
//        Shape triangel = new Triangle("GREEN", 4, 4, 4);
//        triangel.draw();
//
//        Shape circle = new Circle("BLUE", 8);
//        circle.draw();

        Shape [] y = new Shape[10];
        Data x = new Data(y);
        x.arrOutput();
        System.out.println(x.wholeArea());
        System.out.println(x.oneTypeArea("BLUE"));
    }
}
