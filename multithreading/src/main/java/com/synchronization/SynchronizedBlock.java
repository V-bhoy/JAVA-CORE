package com.synchronization;

class Counter {
    int count = 0;

    public void increment() {
       // count ++;
        synchronized (this) {
            count++;
        }
    }
}
public class SynchronizedBlock extends Thread {
    private static Counter counter = new Counter();
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {

       SynchronizedBlock t1 = new SynchronizedBlock();
       SynchronizedBlock t2 = new SynchronizedBlock();

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final count: " + counter.count);
    }
}
