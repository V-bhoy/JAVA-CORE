package throwKeyword;

public class Demo {
    // The throw keyword in Java is used to manually throw an exception (either built-in or custom).
    // It’s useful when you want to create your own error scenario —
    // for example, invalid user input or illegal operations — and stop normal program execution.

    void divide(Integer... nums){
        int quotient = 0;
        if(nums[1] == 0){
            // we can pass only string messages
            throw new ArithmeticException("Cannot divide by zero!");
        }
        quotient = nums[0] / nums[1];
        System.out.println("Quotient of " + nums[0] + " and " + nums[1] + " is " + quotient);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        try{
            System.out.println("CASE 1: ");
            demo.divide(1, 2);

            System.out.println("CASE 2: Dividing by zero");
            demo.divide(10, 0);

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
