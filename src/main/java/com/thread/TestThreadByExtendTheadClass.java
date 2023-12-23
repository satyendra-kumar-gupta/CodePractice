package com.thread;

public class TestThreadByExtendTheadClass extends Thread{

    @Override
    public void run() {
        System.out.println("Thread is running....");
    }
    public static void main(String[] args) {
        TestThreadByExtendTheadClass testThread = new TestThreadByExtendTheadClass();
        testThread.start();
    }
}
