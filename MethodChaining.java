public class MethodChaining {

    public void exampleMethod() {
        // This method chain has a length of 4 (assuming each method returns an object of the same type)
        getObject().firstMethod().secondMethod().thirdMethod();

        // This method chain has a length of 3
        anotherObject.methodOne().methodTwo().methodThree();
    }

    // Assuming these methods return an instance of the same class or another class with further chainable methods
    private ExampleClass getObject() {
        return new ExampleClass();
    }

    private ExampleClass firstMethod() {
        return this;
    }

    private ExampleClass secondMethod() {
        return this;
    }

    private ExampleClass thirdMethod() {
        return this;
    }

    // ... similar methods for anotherObject
}
