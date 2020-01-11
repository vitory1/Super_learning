package com.cjc.Interface.AbstractMethod.Factory;

public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implement1Factory());
        serviceConsumer(new Implement2Factory());
    }
}

