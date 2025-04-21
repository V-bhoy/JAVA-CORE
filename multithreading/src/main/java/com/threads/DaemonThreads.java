package com.threads;

public class DaemonThreads extends Thread {
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread running...");
        }
        else {
            System.out.println("Normal Thread running...");
        }
    }

    public static void main(String[] args) {
        DaemonThreads daemonThreads = new DaemonThreads();
        daemonThreads.setDaemon(true);
        daemonThreads.start();

        // If this line is commented, even the daemon thread is not executed
        // Its life is bound to the parent thread, and it runs in the background
        System.out.println("Main thread running...");
    }
}
