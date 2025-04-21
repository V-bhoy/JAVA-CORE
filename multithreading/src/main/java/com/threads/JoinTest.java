package com.threads;

class MyJoinThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}


public class JoinTest {

    public static void main(String[] args) throws InterruptedException {
        MyJoinThread t1 = new MyJoinThread();
        MyJoinThread t2 = new MyJoinThread();

        t1.setName("Thread-🍕");
        t2.setName("Thread-🍔");

        t1.start();
        t1.join(); // main thread will wait till t1 finishes
        System.out.println("t1 done");
        t2.start(); // will only start after t1 is done

        System.out.println("Main thread ends 🍵");

        // for making the child thread to wait for the main thread
        // get its reference using currentThread() in main method
        // and then use the reference with join() in the child thread
    }

}
