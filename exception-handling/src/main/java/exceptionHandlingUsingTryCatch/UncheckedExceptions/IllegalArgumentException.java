package exceptionHandlingUsingTryCatch.UncheckedExceptions;

public class IllegalArgumentException {
    // occurs when passing an inappropriate argument to a method
    public static void main(String[] args) {
        try{
            System.out.println("Hello World"); // logs this line
            setAge(-1); // throws exception, does not execute further
            System.out.println("Finished execution"); // never logs
        }catch (java.lang.IllegalArgumentException e){ // exception is caught here
            System.out.println("IllegalArgumentException Caught: "+ e); // logs exception
        }
    }

    static void setAge(int age) {
        if (age < 0) {
            throw new java.lang.IllegalArgumentException("Age cannot be negative");
        }
    }
}
