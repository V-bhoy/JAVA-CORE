package com.synchronization;

class BankAccount {
    int balance = 1000;

    void withdrawWithoutSynchronized(int amount) {
        System.out.println(Thread.currentThread().getName());
        if (balance >= amount) {
            balance -= amount;
        }else{
            System.out.println("Cannot withdraw amount");
        }
        System.out.println("Balance Left case 1: "+ balance);
    }

    synchronized void withdrawWithSynchronized(int amount) {
        System.out.println(Thread.currentThread().getName());
        if (balance >= amount) {
            balance -= amount;
        }else{
            System.out.println("Cannot withdraw amount");
        }
        System.out.println("Balance Left case 2: "+ balance);
    }
};

public class SynchronizedMethod extends Thread {
    private static BankAccount account = null;
    public void run() {
       account.withdrawWithoutSynchronized(700);
       // account.withdrawWithSynchronized(700);
    }
    public static void main(String[] args) {
        account = new BankAccount();
        SynchronizedMethod t1 = new SynchronizedMethod();
        SynchronizedMethod t2 = new SynchronizedMethod();
        t1.start();
        t2.start();
    }
}
