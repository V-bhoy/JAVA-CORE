package exceptionHandlingUsingTryCatch.UncheckedExceptions;


public class ArrayIndexOutOfBoundsException {
    // occurs when accessing invalid index in an array
    public static void main(String[] args) {
       try{
           System.out.println("ArrayIndexOutOfBoundsException"); // logs this line
           int[] arr = {1,2,3};
           System.out.println(arr[2]); //logs index at 2
           System.out.println(arr[5]); // throws exception, does not proceed executing further in try block
           System.out.println("Finished execution"); // is never logged
       }catch(java.lang.ArrayIndexOutOfBoundsException e){ // exception is caught here
           // prints name and message
           System.out.println("ArrayIndexOutOfBoundsException Caught: "+ e); // logs exception
       }
    }
}
