package com.cjc.InnerClass;

/**
 * 匿名内部类:创建一个继承自Contents的匿名类的对象通过new表达式返回的引用被自动向上转型为对Contents的引用
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents(){
            private String s = "ss";
            //public int value(){return i;}
            public String toString(){
                return s ;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
        System.out.println(c);
    }
}
