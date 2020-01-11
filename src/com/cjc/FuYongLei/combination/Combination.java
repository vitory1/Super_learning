package com.cjc.FuYongLei.combination;

/**
 * 组合语法：对象引用置于新类中
 */
public class Combination {
    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}
class SprinklerSystem {
    private String value1,value2,value3,value4;
    private waterSource source = new waterSource();
    private int i;
    private float f;
    public String toString(){
        return
                "value1="+ value1 + " "+
                "value2="+ value2 + " "+
                "value3="+ value3 + " "+
                "value4="+ value4 + " "+"\n"+
                "i = " + i + " " + "f = " + f + " " +
                        "source = " +source;
    }
}
