package tryWithResources;

public class CustomResource implements AutoCloseable {
    public CustomResource() {
        System.out.println("CustomResource started!");
    }

    public void process() {
        System.out.println("Processing....");
        throw new RuntimeException("Exception in resource...I want to break the execution thread...hahaha");
    }

    public void close(){
        System.out.println("CustomResource closed!");
    }
}
