package com.synchronization;

class MyClass {
    public synchronized void instanceMethod() {
        System.out.println(Thread.currentThread().getName() + " entered instanceMethod");
        try {
            Thread.sleep(1000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " exiting instanceMethod");
    }

    public static synchronized void staticMethod() {
        System.out.println(Thread.currentThread().getName() + " entered staticMethod");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " exiting staticMethod");
    }
}


public class StaticSynchronization {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass(); // Different object

        Thread t1 = new Thread(() -> obj1.instanceMethod(), "Thread-1");
        Thread t2 = new Thread(() -> obj2.instanceMethod(), "Thread-2");
        // Because t1 and t2 are calling instanceMethod()
        // on different objects (obj1 and obj2),
        // both threads acquire different locks, so they run in parallel.

        Thread t3 = new Thread(() -> obj1.staticMethod(), "Thread-3");
        Thread t4 = new Thread(() -> obj2.staticMethod(), "Thread-4");
        // Even though obj1 and obj2 are different,
        // the staticMethod() is class-level,
        // so both threads must acquire the same lock on MyClass.class.
        //Thread-3 entered staticMethod
        //Thread-3 exiting staticMethod
        //Thread-4 entered staticMethod
        //Thread-4 exiting staticMethod

        // Comment start() on t1 & t2 to observe static level synchronization
        t1.start();
        t2.start();

        t3.start();
        t4.start();
    }
}
