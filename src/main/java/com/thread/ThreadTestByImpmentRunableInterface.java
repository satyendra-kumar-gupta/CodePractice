package com.thread;

public class ThreadTestByImpmentRunableInterface implements Runnable{

    public  void run(){
        System.out.println("Running runnable interface ");
    }

    public static void main(String[] args) {
        ThreadTestByImpmentRunableInterface t1 = new ThreadTestByImpmentRunableInterface();
        Thread thread1 = new Thread(t1);
        thread1.start();
    }
}
