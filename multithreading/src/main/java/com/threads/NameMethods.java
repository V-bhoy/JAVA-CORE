package com.threads;

public class NameMethods extends Thread {
    public void run() {
        System.out.println("Running thread: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Running thread: " + Thread.currentThread().getName());
        NameMethods t1 = new NameMethods();
        NameMethods t2 = new NameMethods();

        t1.setName("🚀 FastThread");
        t2.setName("🐢 SlowThread");

        t1.start();
        t2.start();
    }
}
