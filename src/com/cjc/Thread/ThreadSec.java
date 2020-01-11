package com.cjc.Thread;
/*什么是线程安全？
*当多个线程读写一个全局变量的时候它会发生线程安全问题。
* */
class Sale implements Runnable{
    private int count = 100;
    public Boolean flag = true;
//    改进
    private Object ob = new Object();
    @Override
    public void run() {
        if (flag){
            while (count>0){
                synchronized (this) {
                    if (count > 0) {
                        try {
                            Thread.sleep(40);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + ",出售第=" + (100 - count + 1) + "张票");
                        count--;
                    }
                }
            }
            }else {
            while (count>0){
                show();
            }
        }
    }
    public synchronized void show() {
        if (count > 0) {
            try {
                Thread.sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ",出售第=" + (100 - count + 1) + "张票");
            count--;
        }
    }
}
public class ThreadSec {
    public static void main(String[] args) throws InterruptedException {
        Sale s = new Sale();
        Thread thread1 = new Thread(s);
        Thread thread2 = new Thread(s);
        thread1.start();
        Thread.sleep(100);
        s.flag = false ;
        thread2.start();
    }
}
