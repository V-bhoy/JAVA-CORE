package CustomException;

public class Demo {
    public static void main(String[] args) {
        try{
            System.out.println("Hello World");
            System.out.println("I am throwing a custom exception, handle it...");
            throw new MyCustomException("I caught you...");
        }catch(MyCustomException e){
            System.out.println(e);
        }
    }
}
