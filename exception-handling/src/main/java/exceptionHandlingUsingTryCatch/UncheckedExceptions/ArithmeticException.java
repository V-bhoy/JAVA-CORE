package exceptionHandlingUsingTryCatch.UncheckedExceptions;

public class ArithmeticException {
    // occurs when dividing by zero
    public static void main(String[] args) {

        // WITHOUT HANDLING EXCEPTION
//        System.out.println("ArithmeticException"); // logs this line
//        int x = 10/0; // the exception is thrown at this line
//        System.out.println(x); // x is never printed

        // HANDLING EXCEPTION

        try{
            System.out.println("ArithmeticException"); // logs this line
            int x = 10/2; // evaluated
            System.out.println(x); // logs x
            int y = 10/0; // throws arithemetic exception and doesnt proceed any execution in try block
            System.out.println(y); // never logs, the flow breaks but handled in catch block
        }catch (java.lang.ArithmeticException e){ // exception caught here
            System.out.println("ArithmeticException Caught: " + e ); // executes this line
        }
    }
}
