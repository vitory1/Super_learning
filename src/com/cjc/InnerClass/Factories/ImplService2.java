package com.cjc.InnerClass.Factories;

public class ImplService2 implements Service {
    private ImplService2(){}
    @Override
    public void method1() {
        System.out.println("imp2.method1");
    }

    @Override
    public void method2() {
        System.out.println("imp2.method2");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new ImplService2();
        }
    };
}
