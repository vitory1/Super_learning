package com.cjc.InnerClass.CallBack;

public class Callee1 implements Incrementable {
    private int i = 0;
    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}
class MyIncrement{
    public void increment(){
        System.out.println("Other operation");
    }
    static void f(MyIncrement mi){mi.increment();}
}
