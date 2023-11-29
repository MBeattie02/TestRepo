public class ExampleClass {
    
    public void someMethod() {
        try {
            // This try block is empty, violating the first condition
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void anotherMethod() {
        try {
            int x = 5; // Single non-comment statement, violating the second condition
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
