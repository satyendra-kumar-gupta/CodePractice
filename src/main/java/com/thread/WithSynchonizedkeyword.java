package com.thread;

class Table2 {

    synchronized void printTable(int a){
        for(int i=1; i<=5; i++) {
            System.out.println(a * i);

            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Exception:" + e);
            }
        }
    }
}

class Thread11 extends Thread{
    Table2 t;
    Thread11(Table2 t){
        this.t =t;
    }

    public  void run(){
        t.printTable(5);
    }
}

class Thread22 extends  Thread{
    Table2 t;
    Thread22(Table2 t){
        this.t =t;
    }

    public  void run(){
        t.printTable(100);
    }
}
public class WithSynchonizedkeyword {

    public static void main(String[] args) {
        Table2 th = new Table2();
        Thread11 th1 = new Thread11(th);
        Thread22 th2 = new Thread22(th);
        th1.start();
        th2.start();
    }
}



