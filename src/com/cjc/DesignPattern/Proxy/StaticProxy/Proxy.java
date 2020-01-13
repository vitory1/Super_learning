package com.cjc.DesignPattern.Proxy.StaticProxy;

public class Proxy implements Hose {
    private People people;
    public Proxy(People people){
        this.people = people;
    }
    @Override
    public void sale() {
        System.out.println("before------");
        people.sale();
        System.out.println("after------");
    }
}
