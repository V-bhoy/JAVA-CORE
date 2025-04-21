package com.synchronization;

// 	•	The pizza = shared resource
//	•	The chef thread calls wait() if the previous pizza is not picked up.
//	•	The delivery thread calls wait() if there’s no pizza ready.
//	•	They notify() each other when their job is done.

class Shared {
    boolean isPizzaReady = false;

    synchronized void producePizza() throws InterruptedException {
        if (isPizzaReady) wait(); // Wait if already produced
        System.out.println("Producing...");
        Thread.sleep(1000);
        isPizzaReady = true; // does not release lock
        notify(); // Tell deliveryPerson: done producing
    }

    synchronized void deliverPizza() throws InterruptedException {
        if (!isPizzaReady){
            System.out.println("Nothing to Deliver...");
            wait();
        }; // Wait if nothing produced yet
        System.out.println("Delivering...");
        Thread.sleep(1000);
        isPizzaReady = false;
        notify(); // Tell chef: it is delivered
    }
}

public class TestCommunication {
    public static void main(String[] args) {
        Shared s = new Shared();
        Thread chef= new Thread(() -> {
            try {
                for(int i = 0; i < 5; i++) s.producePizza();
            } catch (InterruptedException e) {}
        });

        Thread deliveryBoy = new Thread(() -> {
            try {
                for(int i = 0; i < 5; i++) s.deliverPizza();
            } catch (InterruptedException e) {}
        });

       chef.start();
       deliveryBoy.start();
    }
}
