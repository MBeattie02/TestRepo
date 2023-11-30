public class SharedResourceExample {

    // Shared static resource
    private static int sharedCounter;

    public void increment() {
        // Directly modifying the shared resource without synchronization
        sharedCounter++;
    }

    public static synchronized void safeIncrement() {
        // Synchronized method to modify the shared resource
        sharedCounter++;
    }

    public void methodUsingSharedResource() {
        // Another method accessing shared resource without synchronization
        System.out.println("Counter value: " + sharedCounter);
    }
}
