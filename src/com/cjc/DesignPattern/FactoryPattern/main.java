package com.cjc.DesignPattern.FactoryPattern;

public class main {
    public static void main(String[] args) {
        Car car1 = Factory.getcar("奥迪");
        Car car2 = Factory.getcar("奔驰");
        car1.run();
        car2.run();
    }
}
