package com.thread;

public class MyThread2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Now the thread is running .....");
    }
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        Thread t1 = new Thread(myThread2, "my new thread");
        t1.start();
        String myThread = t1.getName();
        System.out.println(myThread);
    }
}
