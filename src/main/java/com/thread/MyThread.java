package com.thread;

public class MyThread {
    public static void main(String[] args) {
        Thread t1 = new Thread("My first thread");
        t1.start();
        String currentThreadName = t1.getName();
        System.out.println(currentThreadName);
    }
}
