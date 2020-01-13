package com.cjc.DesignPattern.Proxy.StaticProxy;

/*静态代理需要自己写一个代理类*/
public class TestProxy {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new People());
        proxy.sale();
    }
}
