package com.cjc.Thread;

public class ThreadDemo02 {
    public static void main(String[] args) {
        System.out.println("创建线程开始 main");
        //第一种创建线程的方法
        CreatThread creatThread = new CreatThread();
        //creatThread.run();
        creatThread.start();
        System.out.println("线程已经开始执行 main");
        for (int i = 0;i<20;i++){
            System.out.println("run() main.i:"+i);
        }
    }
}
class CreatThread extends Thread{
    /**
     * run方法执行 需要线程执行的任务
     */
    @Override
    public void run() {
        for (int i = 0;i<20;i++){
            System.out.println("run() i:"+i);
        }
    }
}