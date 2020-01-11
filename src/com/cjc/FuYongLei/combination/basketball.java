package com.cjc.FuYongLei.combination;

public class basketball {
    private ball b;
    private String s1;
    public basketball(){
        s1 = "nihao!";
        if (b == null){
            b=new ball();
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        basketball ba = new basketball();
        System.out.println(ba);
    }
}
