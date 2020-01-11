package com.cjc.FuYongLei.extend;

public class B {
    int i ;
    public B(int i){
        this.i = i ;
    }
    private String s="B";
    public void save(){
        System.out.println("B"+i);
    }
    public String toString(){
        return s;
    }
}

