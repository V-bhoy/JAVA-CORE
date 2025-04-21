package com.threads;

class MyYieldThread extends Thread {
    public void run() {
        Thread.yield();
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);// Suggest to yield control
        }
    }
}

public class YieldTest {
    public static void main(String[] args) {
        MyYieldThread t1 = new MyYieldThread();
        MyYieldThread t2 = new MyYieldThread();

        t1.setName("🍕 CodeThread-1");
        t2.setName("🍔 CodeThread-2");

        t1.start();
        t2.start();

        for (int i=1; i<=5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
