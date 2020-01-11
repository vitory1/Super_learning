package com.cjc.Thread;

public class ThreadDemo03 {
    public static void main(String[] args) {
//    Second method: implement runnable interface
        CreateRunnable createRunnable = new CreateRunnable();
        Thread thread = new Thread(createRunnable);
        thread.start();
    }
}
class CreateRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<20;i++){
            System.out.println("run() i:"+i);
        }
    }
}