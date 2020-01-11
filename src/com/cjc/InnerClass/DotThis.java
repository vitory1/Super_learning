package com.cjc.InnerClass;

public class DotThis {
    void f(){
        System.out.println("DotThis.f()");
    }
    private class Inner{
        public DotThis outer(){
            return DotThis.this;
        }
    }
    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis t = new DotThis();
        DotThis.Inner dt = t.inner();
        dt.outer().f();
    }
}
