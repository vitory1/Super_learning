package com.cjc.DesignPattern.Proxy.DynamicProxy;

import com.cjc.DesignPattern.Proxy.StaticProxy.Hose;
import com.cjc.DesignPattern.Proxy.StaticProxy.People;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.invoke.MethodHandleInfo;
import java.lang.reflect.Method;

public class cglibTest implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib动态代理");
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib动态代理");
        return invokeSuper;
    }

    public static void main(String[] args) {
        cglibTest cglibTest = new cglibTest();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(People.class);
        enhancer.setCallback(cglibTest);
        Hose hose = (Hose) enhancer.create();
        hose.sale();
    }
}
