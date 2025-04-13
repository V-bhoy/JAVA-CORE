package tryWithResources;

public class CustomResource2 implements AutoCloseable {
    public CustomResource2() {
        System.out.println("CustomResource2 started!");
    }

    public void process() {
        System.out.println("Resource2 Processing....");
    }

    public void close() throws Exception {
        System.out.println("CustomResource2 closing...");
        throw new Exception("Exception while closing resource2");
    }
}
