package com.sda.concurrency;

public class ThreadStates {


    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getState());

        Thread thread = new Thread();
        thread.start();

        System.out.println(thread.getState());

        Thread.sleep(1000);

        System.out.println(thread.getState());
    }
}
