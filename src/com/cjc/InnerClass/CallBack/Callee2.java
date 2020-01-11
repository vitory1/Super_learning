package com.cjc.InnerClass.CallBack;

public class Callee2 extends MyIncrement {
    private int i = 0 ;
    public void increment(){
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Incrementable{
        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }
    Incrementable getCallbackReference(){
        return new Closure();
    }
}
class Caller{
    private Incrementable callbackReference;
    Caller(Incrementable cbh){ callbackReference = cbh;}
    void go(){callbackReference.increment();}
}
