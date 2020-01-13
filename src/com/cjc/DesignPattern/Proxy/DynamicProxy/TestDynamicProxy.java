package com.cjc.DesignPattern.Proxy.DynamicProxy;

import com.cjc.DesignPattern.Proxy.StaticProxy.Hose;
import com.cjc.DesignPattern.Proxy.StaticProxy.People;

import java.lang.reflect.Proxy;

public class TestDynamicProxy{
    public static void main(String[] args) {
        People people  = new People();
        JdkProxy jdkProxy = new JdkProxy(people);
        Hose hose = (Hose)Proxy.newProxyInstance(people.getClass().getClassLoader(), people.getClass().getInterfaces(),jdkProxy);
        hose.sale();
    }
}
