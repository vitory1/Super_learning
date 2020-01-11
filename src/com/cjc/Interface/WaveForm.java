package com.cjc.Interface;

public class WaveForm {
    private static long counter;
    private final long id = counter++;
    public String toString(){return "Wareform"+id;}
}
class Filter{
    public String name(){
        return getClass().getSimpleName();
    }
    public WaveForm process(WaveForm input){
        return input;
    }
}
class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff = cutoff;
    }
    public WaveForm process(WaveForm input){
        return input;
    }

    public static void main(String[] args) {
        Filter f = new LowPass(13);
        System.out.println(f.name());
        System.out.println(f.process(new WaveForm()));
    }
}