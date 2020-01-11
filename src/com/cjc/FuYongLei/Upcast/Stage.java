package com.cjc.FuYongLei.Upcast;

public class Stage {
    private actor a = new HappyActor();
    public void perform(){
        a.act();
    }
    public void change(){
        a = new SadActor();
    }
}
