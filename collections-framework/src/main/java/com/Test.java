package com;

public class Test {
//    static {
//        throw new NullPointerException("hello");
//    }

    public static void main(String[] args) {
        try{
            System.out.println("main");
        }
        catch(Exception e){
            System.out.println("main catch block");
        }
    }
}
