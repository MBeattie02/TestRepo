public class DeadMethod {

    public void publicMethod() {
        // This method is public and might be used elsewhere
        System.out.println("Public method called");
    }

    private void unusedPrivateMethod() {
        // This private method is never called within the class
        System.out.println("This is an unused private method");
    }

    private void anotherUnusedPrivateMethod() {
        // Another private method that is never called
        System.out.println("Another unused private method");
    }

    private void usedPrivateMethod() {
        // This private method is used within the class
        System.out.println("Used private method");
    }

    public void methodUsingPrivate() {
        usedPrivateMethod(); // This is a call to a private method
    }
}
