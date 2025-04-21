package com.threads;

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread created for task 2");
    }
}

class MyThread2 extends Thread{
    public void run(){
        System.out.println("Thread created for task 3");
    }
}

public class TaskExecutionCases extends Thread {
    public void run(){
        System.out.println("Thread created for task 1");
    }

    public static void main(String[] args) {
        // single thread performs single task
        TaskExecutionCases thread1 = new TaskExecutionCases();
        thread1.start();

        // multiple threads perform single task
        // here thread1 & thread2 are executing the same task
        TaskExecutionCases thread2 = new TaskExecutionCases();
        thread2.start();

        // multiple threads performing multiple tasks
        // here 2 tasks are performing 2 tasks
        MyThread thread3 = new MyThread();
        thread3.start();

        MyThread2 thread4 = new MyThread2();
        thread4.start();

    }
}
