package tryCatchFinally;

public class Demo {
    // The finally block is used when we want to always execute some code after the try catch block
    // even if an exception is thrown or caught or the method returns early
    // It is mainly used to execute important cleanup code —
    // like closing a file, releasing a resource, or disconnecting from a database —
    // no matter what happens (exception or not).

    void divide(Integer... nums) {
        int quotient = 0;
        quotient = nums[0] / nums[1];
        System.out.println("Quotient of " + nums[0] + " and " + nums[1] + " is " + quotient);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        CustomResource resource = new CustomResource();
        try {
            resource.process();
            System.out.println("CASE 1: ");
            demo.divide(1, 2);
            System.out.println("CASE 2: ");
            demo.divide(10, 0);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            resource.close();
            System.out.println("The code in this block is always executed!");
        }
    }
}
