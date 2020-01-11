package com.cjc.Interface.Exercise;

public class SuperCar extends Car implements CarDoor{
    private String s = "SuperCar";
    @Override
    public String toString() {
        return s;
    }

    @Override
    public void install() {
        System.out.println("install()");
    }

    @Override
    public void open() {
        System.out.println("open()");
    }

    @Override
    public void close() {
        System.out.println("close()");
    }

    @Override
    public void up() {
        System.out.println("up()");
    }

    @Override
    public void down() {
        System.out.println("down()");
    }
}
