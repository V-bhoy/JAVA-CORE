package throwsKeyword;


import java.lang.ArithmeticException;

import java.io.IOException;

public class Demo {

//    The throws keyword is used in a method declaration
//    to indicate that the method might throw an exception — but won’t handle it inside.
//    It tells the caller of the method to handle the exception.

    void divide(Integer... nums) throws IOException, ArithmeticException {
        int quotient = 0;
        // here, we are using a  checked exception purposely
        // if you just use the checked exception here without using the throws keyword
        // it will expect you to handle the exception in this method only
        // and not allow you to proceed, since it is mandatory
        // using it with throws keyword, will tell JVM that the method won't handle the exception
        // and expects the caller of the method to do it, which we are already handling
        // in the main method using try catch block
        // you can also use throws with unchecked exceptions as well.
        // the difference is when you use Runtime exception with throw, it can be handled anywhere
        // either in the method or caller, but throws tells the caller to handle
        // if you want to use multiple exceptions with throws, you can separate them with a comma
        if(nums[0] == 0){
            throw new IOException("Input Numerator to be zero, not expected!");
        }
        quotient = nums[0] / nums[1];
        System.out.println("Quotient of " + nums[0] + " and " + nums[1] + " is " + quotient);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        try{
            System.out.println("CASE 1: ");
            demo.divide(1, 2);

            System.out.println("CASE 2: passing numerator zero and throwing temporary custom exception");
            demo.divide(0, 10);

            // comment case 2 for observing case 3
            System.out.println("CASE 3: divide by zero");
            demo.divide(10, 0);

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
