package com.company;

public class Main {

    public static void main(String[] args) {
        Shape rectanle = new Rectangle("RED", 10, 4);
        rectanle.draw();

        Shape triangel = new Triangle("GREEN", 4, 4, 4);
        triangel.draw();

        Shape circle = new Circle("BLUE", 8);
        circle.draw();
    }
}
