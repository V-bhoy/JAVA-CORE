package tryWithResources;

public class Demo {
    // try-with-resources is a feature in Java (since Java 7)
    // that automatically closes resources (like files, sockets, DB connections)
    // when you’re done with them after the try block is executed — no need for a finally block!

    // NOTE: You can use it only with classes that implement the AutoCloseable interface
    // The autocloseable interface is the interface that contains the close method
    // It helps in having shorter, cleaner and safer code
    // We can also have our finally block in the code, but it will be executed only after the
    // default finally block of try with resources
    // to handle multiple resources, separate them with a semicolon
    // When you use multiple resources, it will instantiate them in the order from left to right
    // but close it one by one in the reverse order because it assumes that
    // the following resources are dependent on the previous one, so it needs to be closed first

    //  If an exception is thrown when closing the resource, then:
    //	•	The original exception is thrown (the one from the try block).
    //	•	The exception thrown during resource closing is suppressed.
    // you can access it using Throwable[] suppressed = originalException.getSuppressed();

    public static void main(String[] args) {
        CustomResource resource = new CustomResource();
        CustomResource2 resource2 = new CustomResource2();
        try(resource; resource2) {
            resource2.process();
            resource.process();
        }catch (Exception e) {
            System.out.println(e);
            for(Throwable suppressedException: e.getSuppressed()){
                System.out.println(suppressedException);
            }
        } finally {
            System.out.println("My custom code , for finally");
        }
    }
}
