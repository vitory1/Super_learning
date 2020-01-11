package com.cjc.FuYongLei.extend;

public class Detergent extends Cleanser {
    public void scrub(){
        append("Detergent.scrub()");
        super.scrub();
    }
    public void foam(){
        append(" foam() ");
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
