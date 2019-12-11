package com.company;

public class Data {
    private Shape[] data = new Shape[10];

    public Data(Shape[] data){
        this.data = data;
        data[0] = new Circle("ORANGE", 11);
        data[1] = new Rectangle("RED", 10, 4);
        data[2] = new Triangle("GREEN", 4, 4, 4);
        data[3] = new Circle("BLUE", 8);
        data[4] = new Rectangle("BLACK", 3, 7);
        data[5] = new Triangle("WHITE", 5, 3, 4);
        data[6] = new Circle("BRAWN", 17);
        data[7] = new Rectangle("BLUE", 8, 24);
        data[8] = new Triangle("PINK", 6, 8, 5);
        data[9] = new Circle("YELLOW", 30);
    }

    public void arrOutput() {
        for (Shape i:data) {
            System.out.println(i);
        }
    }

    public double wholeArea () {
        double sum = 0;

        for (Shape i:data) {
            sum += i.calcArea();
        }
        return sum;
    }

    public double oneTypeArea (String colorShape) {
        double sum = 0;

        for (Shape i:data) {
            if (colorShape.equals(i.getColorShape()))
                sum += i.calcArea();
        }
        return sum;
    }
}
