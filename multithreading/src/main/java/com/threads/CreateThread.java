package com.threads;

public class CreateThread extends Thread{
    // used to write the logic of a task within this
    public void run(){
       System.out.println("Thread created using Thread class");
    }

    public static void main(String[] args) {
        CreateThread createThread = new CreateThread();
        createThread.start();
       // createThread.start(); // will throw runtime exception that is IllegalThreadStateException
    }
}
