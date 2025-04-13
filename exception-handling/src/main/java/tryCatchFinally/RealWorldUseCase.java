package tryCatchFinally;

public class RealWorldUseCase {
    public static void main(String[] args) {
        java.io.FileReader reader = null;
        try {
            reader = new java.io.FileReader("test.txt");
            int data = reader.read();
            System.out.println((char) data);
        } catch (java.io.IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close(); // Cleanup
                System.out.println("File closed.");
            } catch (java.io.IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
