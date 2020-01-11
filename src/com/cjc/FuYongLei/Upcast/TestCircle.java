package com.cjc.FuYongLei.Upcast;

public class TestCircle {
    public static void main(String[] args) {
        Unicycle uc = new Unicycle();
        Method.ride(uc);
    }
}
class Method{
    public static void ride(Circle c){
        System.out.println("ride"+c);
    }
}
class Unicycle extends Circle{
    public String toString(){
        return "Unicycle";
    }
}
class Bicycle extends Circle{
    public String toString(){
        return "Bicycle";
    }
}
class Tricycle extends Circle{
    public String toString(){
        return "Tricycle";
    }
}