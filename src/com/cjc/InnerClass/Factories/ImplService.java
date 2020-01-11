package com.cjc.InnerClass.Factories;

public class ImplService implements Service{
    private ImplService(){}
    @Override
    public void method1() {
        System.out.println("imp.method1");
    }

    @Override
    public void method2() {
        System.out.println("imp.method2");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new ImplService();
        }
    };
}
