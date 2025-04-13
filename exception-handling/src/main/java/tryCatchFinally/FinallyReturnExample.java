package tryCatchFinally;

public class FinallyReturnExample {
    // The finally block is executed even when the return is used
    public static int test() {
        try {
            return 1;
        } finally {
            System.out.println("finally block executed");
            return 2;
            // this will override the return in try block
            // similarly if you throw an exception it will override the exception in catch block
        }
    }

    public static void main(String[] args) {
        System.out.println("Returned: " + test());
    }
}
