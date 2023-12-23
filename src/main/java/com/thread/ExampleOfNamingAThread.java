package com.thread;

public class ExampleOfNamingAThread extends Thread{

    public void run(){
        System.out.println("thread running");
    }
    public static void main(String[] args) {
        ExampleOfNamingAThread th1 = new ExampleOfNamingAThread();
        ExampleOfNamingAThread th2 = new ExampleOfNamingAThread();

        System.out.println("Thread name th1 : " + th1.getName());
        System.out.println("Thread name th2 : " + th2.getName());

        th1.start();
        th2.start();

        th1.setName("test th1 thread");
        System.out.println("after changing thread name:" + th1.getName());
    }
}
