package com.cjc.FuYongLei.combination;

public class Bath{
    private String //Initializing at point of definition
            s1 = "Happy",
            s2 = "Happy",
            s3,s4;
    private Soap castille;
    private int i;
    private float toy;
    public Bath(){
        System.out.print("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soap();
    }
    { i = 47 ;}
    public String toString(){
        if (s4 == null)
            s4 = "Joy";
        return
           "s1="+s1+"\n"+
           "s2="+s2+"\n"+
           "s3="+s3+"\n"+
           "s4="+s4+"\n"+
           "i="+i+"\n"+
           "toy="+toy+"\n"+
           "castille="+castille;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.print(b);
    }
}
