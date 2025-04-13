package handlingMultipleExceptions;

public class Demo {
    void divide(Integer... nums){
        int quotient = 0;
        quotient = nums[0] / nums[1];
        System.out.println("Quotient of " + nums[0] + " and " + nums[1] + " is " + quotient);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        try{
            System.out.println("CASE 1: ");
            demo.divide(1, 2);

            // System.out.println("CASE 2: Dividing by zero");
            // demo.divide(10, 0);

            // comment case 2 for observing case 3
            // case 2 is handled but case 3 exception is not handled, and it breaks the
            // execution flow in main thread
            // this can be resolved by handling multiple exceptions
            System.out.println("CASE 3: Passing only 1 element");
            demo.divide(10);


            // the execution of the catch block is top to bottom
            // when it matches the exception that block is executed
            // one thing to note, never place the parent exception class first
            // if you place it at first, the exception will get caught in the first block everytime
            // and the following blocks will never be reached
            // hence place the parent exception class always at the end
            // You can also pipe multiple exceptions in one catch block and print common message
            // catch(ArithmeticException | ArrayIndexOutOfBoundsException){...}
            // but you cannot include parent exception class in the beginning or end of the expression
            // because if you do, the result will always be true for exceptions
            // So better to define it in a separate catch block
        }catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Cannot divide by zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Minimum 2 args are needed!");
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Found some unexpected exception!");
        }
    }
}
