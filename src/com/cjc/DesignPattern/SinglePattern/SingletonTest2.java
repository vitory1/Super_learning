package com.cjc.DesignPattern.SinglePattern;
//饿汉式是当class文件被加载的时候，就会被初始化 天生安全
class Singleton2{
    private static final Singleton2 singleton2 = new Singleton2();
    private Singleton2(){

    }
    public static Singleton2 getSingleton2(){
        return singleton2;
    }

}
public class SingletonTest2 {
    public static void main(String[] args) {
        Singleton2 singleton2 = Singleton2.getSingleton2();
        Singleton2 singleton = Singleton2.getSingleton2();
        System.out.println(singleton2==singleton);
    }
}
