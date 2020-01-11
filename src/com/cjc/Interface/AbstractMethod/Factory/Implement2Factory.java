package com.cjc.Interface.AbstractMethod.Factory;

public class Implement2Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implement2();
    }
}
