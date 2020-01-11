package com.cjc.Interface;

public class FilterProcessor {
    public static void main(String[] args) {
        WaveForm w = new WaveForm();
        Apply.process(new FilterAdapter(new LowPass(1.0)),w);
    }
}
