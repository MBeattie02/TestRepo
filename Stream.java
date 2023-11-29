import java.util.List;

public class Stream {

    public void processList(List<String> items) {
        // This loop can be refactored to a stream operation
        for (String item : items) {
            System.out.println(item);
        }

        // This loop also can be refactored to a stream operation
        for (String item : items) {
            if (item.length() > 3) {
                processItem(item);
            }
        }

        // This loop is more complex and might not be easily refactored
        for (String item : items) {
            if (item.length() > 3) {
                processItem(item);
            } else {
                handleShortItem(item);
            }
        }
    }

    private void processItem(String item) {
        // Some processing on the item
    }

    private void handleShortItem(String item) {
        // Handle items with short length
    }
}
