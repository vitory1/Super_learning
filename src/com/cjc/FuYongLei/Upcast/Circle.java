package com.cjc.FuYongLei.Upcast;

public class Circle extends Shape {
    @Override
    public void Test(){
        System.out.println("Circle");
    }
    public void draw(){
        System.out.println("Circle draw");
    }
    public String toString(){
        return "Circle";
    }
}
