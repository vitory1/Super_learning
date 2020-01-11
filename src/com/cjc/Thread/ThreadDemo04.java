package com.cjc.Thread;

public class ThreadDemo04 {
    public static void main(String[] args) {
        //    使用匿名内部类的方式创建
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0;i<20;i++){
                    System.out.println("run() i:"+i);
                }
            }
        }).start();
        for (int i = 0;i<20;i++){
            System.out.println("m.run() i:"+i);
        }
    }
}
