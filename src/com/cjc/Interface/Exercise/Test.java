package com.cjc.Interface.Exercise;

public class Test {
    static void toOpen(Door d){
        d.open();
    }
    static void toRoll(Wheels r){
        r.rollup();
    }
    static void toUp(Window w){
        w.up();
    }
    static void toInstall(CarDoor cd){
        cd.install();
    }

    public static void main(String[] args) {
        SuperCar sc = new SuperCar();
        toOpen(sc);
    }
}
