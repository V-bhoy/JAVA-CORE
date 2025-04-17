package com;

public class Test {
    public static void main(String[] args) {
        String n1 = "abcpqr";
        String n2 = "abc";
        String n3= "pqr";
        String n4 = n2+n3;
        String n5 = n2+"pqr";
        String n6 = "abc"+"pqr";
        System.out.println(n4.equals(n1));
        System.out.println(n4 == n1);
        System.out.println(n5 == n4);
        System.out.println(n5 == n1);
        System.out.println(n1.hashCode()); // creates an object in SCP
        System.out.println(n2.hashCode()); // creates an object in SCP
        System.out.println(n3.hashCode()); // creates an object in SCP
        System.out.println(n4.hashCode()); // creates an object in heap
        System.out.println(n5.hashCode()); // creates an object in heap
        System.out.println(n6.hashCode()); // creates an object in SCP
        // Concatenation of variables or when String object is created using new, creates an object in the heap
        // because when we concat variables or variables with constant, its values are resolved at runtime
        // and it creates an object in heap at runtime not SCP, you need to explicitly call intern() on it
        // to store it in SCP at runtime

        // SCP --> n1, n6 ---> abcpqr, n2---> abc, n3-->pqr
        // heap --> n4 {value: abcpqr} , n5 { value: abcpqr}
    }
}
