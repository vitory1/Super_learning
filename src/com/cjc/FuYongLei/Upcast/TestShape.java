package com.cjc.FuYongLei.Upcast;

import java.util.Random;

public class TestShape {
    private static RandomShapeGenerator rsg = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        for (int i = 0 ; i < s.length ; i++){
            s[i] = rsg.next();
        }
        for (Shape shape:s
             ) {
            shape.draw();
            shape.Test();
        }
    }
}
class RandomShapeGenerator{
    Random random = new Random(47);
    public Shape next(){
        switch (random.nextInt(3)){
            default:
            case 0 : return new Circle();
            case 1 : return new Square();
            case 2 : return new Triangle();
        }
    }
}