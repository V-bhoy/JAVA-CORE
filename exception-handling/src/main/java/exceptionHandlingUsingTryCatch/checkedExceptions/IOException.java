package exceptionHandlingUsingTryCatch.checkedExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOException {
    // occurs during input output operations
    // example: reading a file that doesn't exist
    // you must handle it since it is checked at compile time,
    // otherwise JVM would never execute the main block
    public static void main(String[] args) {

        // COMMENT OUT TO CHECK THE EXCEPTION IN CONSOLE WITHOUT HANDLING
        // you won't see any logs, since the program is not executed unless it is handled

//        System.out.println("Starting the execution");
//        FileReader reader = new FileReader("nonexistent.txt");
//        System.out.println("Ended the execution");

        // HANDLING USING TRY CATCH BLOCK
        // THE First print message is executed
        // on the next line, the exception is caught since teh file doesn't exist
        // and catch block is executed without proceeding ahead in the try block
        try {
            System.out.println("Starting the execution");
            FileReader reader = new FileReader("nonexistent.txt");
            System.out.println("Ended the execution");
        }catch (FileNotFoundException e){
            // either you can print the stack of the exception
            // e.printStackTrace();
            // you can just print the exception that will display name and message
            System.out.println(e);
            // just display the message
            System.out.println(e.getMessage());
            // Just display user friendly message
            System.out.println("File not found");
        }
    }
}
