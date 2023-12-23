package com.thread;

public class ThreadJoinExample extends Thread {
    public void run(){
        for(int i=0; i<3; i++){
            try {
                Thread.sleep(300);
                System.out.println("Current Thread Name is: "+ Thread.currentThread().getName());
            }catch (InterruptedException e) {
                System.out.println("The exception has been caught: "+e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ThreadJoinExample th1 = new ThreadJoinExample();
        ThreadJoinExample th2 = new ThreadJoinExample();
        ThreadJoinExample th3 = new ThreadJoinExample();

        th1.start();
        try {
            System.out.println("The current thread name is: "+ Thread.currentThread().getName());
            th1.join();
        }catch (InterruptedException e){
            System.out.println("The exception has been caught :" +e);
        }

        th2.start();
        try {
            System.out.println("The current thread name is: "+ Thread.currentThread().getName());
            th2.join();
        }catch (InterruptedException e){
            System.out.println("The exception has been caught :" +e);
        }

        th3.start();
    }
}
