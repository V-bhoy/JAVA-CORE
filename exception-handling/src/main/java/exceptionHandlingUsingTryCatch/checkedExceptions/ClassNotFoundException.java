package exceptionHandlingUsingTryCatch.checkedExceptions;

public class ClassNotFoundException {
    // occurs when a class is not found during runtime
    public static void main(String[] args) {
        try {
            Class.forName("com.unknown.MyClass");
        } catch (java.lang.ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }
    }
}
