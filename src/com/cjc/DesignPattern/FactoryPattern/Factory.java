package com.cjc.DesignPattern.FactoryPattern;

public class Factory {
    private static Car car = null;
    public static Car getcar(String carType){
        switch (carType){
            case "奥迪":
                car = new aodi();
                break;
            case "奔驰":
                car = new benchi();
                break;
            default:
                break;
        }
        return car;
    }
}
