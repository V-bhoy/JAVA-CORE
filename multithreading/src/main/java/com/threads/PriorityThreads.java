package com.threads;

public class PriorityThreads extends Thread {
    public void run() {
        System.out.println("Running thread: " + getName() + " with priority: " + getPriority());
    }

    public static void main(String[] args) {
        PriorityThreads t1 = new PriorityThreads();
        PriorityThreads t2 = new PriorityThreads();
        PriorityThreads t3 = new PriorityThreads();

        t1.setName("🥇 HighPriority");
        t2.setName("🏅 NormalPriority");
        t3.setName("🥉 LowPriority");

        t1.setPriority(Thread.MAX_PRIORITY);  // 10
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MIN_PRIORITY);  // 1

        t1.start();
        t2.start();
        t3.start();
    }
}
