public class ExceptionHandling {

    public void methodWithGenericCatch() {
        try {
            // Some code that might throw an exception
        } catch (Exception e) {
            // This is a generic catch block, catching 'Exception'
        }
    }

    public void methodWithEmptyCatch() {
        try {
            // Some code that might throw an exception
        } catch (SpecificException e) {
            // This catch block is empty
        }
    }

    public void methodWithSwallowedException() {
        try {
            // Some code that might throw an exception
        } catch (SpecificException e) {
            // The exception is neither logged nor rethrown
            int a = 5; // Irrelevant operation, simulating a swallowed exception
        }
    }

    public void methodWithProperExceptionHandling() {
        try {
            // Some code that might throw an exception
        } catch (SpecificException e) {
            // The exception is properly logged
            logger.log(e);
            throw e; // and rethrown
        }
    }

    // Assume SpecificException is a custom exception class
    class SpecificException extends Exception {}
}
