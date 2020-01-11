package com.cjc.FuYongLei.extend;

public class C extends A {
    public C(){
        super(15);
    }
    public C(int i){
        super(i);
    }
    private B b= new B(13);

    public void save1(){
        b.save();
    }
    public String toString(){
        return b.toString();
    }
}
