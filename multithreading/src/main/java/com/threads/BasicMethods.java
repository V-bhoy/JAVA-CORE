package com.threads;

public class BasicMethods extends Thread {
    @Override
    public void run() {
        System.out.println("Hello I am thread that is running !"+ Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        BasicMethods thread = new BasicMethods();
        System.out.println("Before start: " + thread.isAlive());
        thread.start();
        System.out.println("After start: " + thread.isAlive());
        System.out.println("Main running: " + Thread.currentThread().getName());
        try {
            thread.join(); // wait for thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After completion: " + thread.isAlive());
    }
}
