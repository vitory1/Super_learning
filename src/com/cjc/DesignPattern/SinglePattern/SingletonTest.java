package com.cjc.DesignPattern.SinglePattern;

class Singleton{
    private static Singleton singleton;
    private Singleton(){}

    /**
     * 懒汉式当你需要的时候，才会被实例化，之后都是用一个实例。懒汉式 线程不安全 所以需要加上同步
     * @return
     */
    public static Singleton getSingleton(){
        if (singleton == null){
            synchronized (Singleton.class){
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}

public class SingletonTest {
//    懒汉式：单例模式
public static void main(String[] args) {
    Singleton s1 = Singleton.getSingleton();
    Singleton s2 = Singleton.getSingleton();
    System.out.println(s1==s2);
}
}
