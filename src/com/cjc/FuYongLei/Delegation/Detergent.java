package com.cjc.FuYongLei.Delegation;

import com.cjc.FuYongLei.extend.Cleanser;

/**
 * rewrite Detergent by using delegation method
 */
public class Detergent {
    private String s = "Cleanser";
    public void append(String a){s+=a;}
    private Cleanser c = new Cleanser();
    public void scrub(){
        c.scrub();
    }
    public void apply(){
        c.apply();
    }
    public void dilute(){
        c.dilute();
    }
    public void foam(){
        append(" foam ");
    }
    public String toString(){
        return s;
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.print(x);
        System.out.print("Testing base class:");
        Cleanser.main(args);
    }
}
