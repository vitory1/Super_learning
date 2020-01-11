package com.cjc.InnerClass.Using;

public class Y implements A {
    B makeB(){
        return new B(){};
    }
}
