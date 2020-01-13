package com.cjc.DesignPattern.Proxy.DynamicProxy;

import com.cjc.DesignPattern.Proxy.StaticProxy.People;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler {
    private Object target;
    public JdkProxy(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---before");
        method.invoke(target,args);
        System.out.println("---after");
        return null;
    }
}
