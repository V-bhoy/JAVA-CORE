package exceptionHandlingUsingTryCatch.UncheckedExceptions;

public class ClassCastException {
    // occurs when trying to cast an object to an incompatible type.
    public static void main(String[] args) {
        try{
            System.out.println("Starting execution"); // logs this line
            Object obj = "Hello";
            Integer num = (Integer) obj; // throws exception, does not execute further
            System.out.println(num); // never logs
            System.out.println("Finished execution"); // never logs this line
        }catch(java.lang.ClassCastException e){ // exception is caught here
            // prints exception name and message
            System.out.println("ClassCastException Caught: "+ e); // logs exception
        }
    }
}
