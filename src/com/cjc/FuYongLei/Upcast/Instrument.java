package com.cjc.FuYongLei.Upcast;

public class Instrument {
    public void play(){}
    static void tune(Instrument i){
        i.play();
    }
}
class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}
