package com.cjc.InnerClass.Factories;

public class Factories {
    public static void ServiceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        ServiceConsumer(ImplService.factory);
    }
}
