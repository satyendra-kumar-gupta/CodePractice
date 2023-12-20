package com.thread;

public class ThreadSchedulerExample extends Thread {
    public  void run() {
        for(int i=0; i<10; i++)
        {   try {
            Thread.sleep(1000);
        }catch (InterruptedException interruptedException){
            System.out.println(interruptedException);
        }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        ThreadSchedulerExample threadSchedulerExample1 = new ThreadSchedulerExample();
        ThreadSchedulerExample threadSchedulerExample2 = new ThreadSchedulerExample();
        threadSchedulerExample1.start();
        threadSchedulerExample2.start();
    }
}
