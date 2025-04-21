package com.threads;

class MyThr extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(2000); // Pause for 2 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// You’ll see both threads printing numbers but with delays, giving a sense of cooperative execution.

public class SleepTest {
    public static void main(String[] args) {
       MyThr t1 = new MyThr();
       MyThr t2 = new MyThr();

        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.start();
        t2.start();
    }
}
