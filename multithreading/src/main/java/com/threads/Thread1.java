package com.threads;

public class Thread1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread1 created using runnable interface");
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread thread = new Thread(thread1);

        thread.start();
    }
}
