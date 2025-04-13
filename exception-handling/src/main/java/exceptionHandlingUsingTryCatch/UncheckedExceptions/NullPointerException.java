package exceptionHandlingUsingTryCatch.UncheckedExceptions;

public class NullPointerException {
    // occurs when performing any operation on null object
    public static void main(String[] args) {
        try{
            System.out.println("NullPointerException"); // logs this line
            String str1 = "HelloWorld";
            System.out.println(str1.length()); // logs the length of str1
            String str2 = null;
            System.out.println(str2.length()); // throws exception since a method is called on null object
            System.out.println("Finished execution"); // remains untouched since the catch block is executed
            // the flow breaks but handled in catch block
        }catch(java.lang.NullPointerException e){ // caught exception here
            // prints name and message of exception
            System.out.println("NullPointerException Caught: "+ e); // logs exception
        }
    }
}
