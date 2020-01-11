package com.cjc.Interface.AbstractMethod.Factory;

public class Implement1Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implement1();
    }
}
