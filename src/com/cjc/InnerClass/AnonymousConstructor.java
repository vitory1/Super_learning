package com.cjc.InnerClass;

import org.w3c.dom.ls.LSOutput;

/**
 * 为匿名内部类创建一个构造器
 */
abstract class Base{
    public Base(int i){
        System.out.println("Base constructor,i="+i);
    }
    public abstract void f();
}
public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i){
            {
                System.out.println("Inside instance initializer");
            }
            public void f(){
                System.out.println("in anonymous f()");
            }
        };
    }
}
