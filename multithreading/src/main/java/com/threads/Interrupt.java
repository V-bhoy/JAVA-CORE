package com.threads;

class MyInterruptedThread extends Thread {
    public void run() {
        System.out.println(isInterrupted());
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
        System.out.println(isInterrupted());
        try {
            Thread.sleep(5000);
            System.out.println("Thread finished sleeping");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted during sleep!");
        }
    }
}


public class Interrupt {
    public static void main(String[] args) {
        MyInterruptedThread thread = new MyInterruptedThread();
        thread.start();
        thread.interrupt(); // this will throw the interrupted exception when
        // thread is in sleep mode and execute the catch block
        // if you comment the interrupt method or the sleep method,
        // the exception will not be thrown
        // and the thread will execute normally
    }
}
