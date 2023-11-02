public class SimpleWebApp {
    public static void main(String[] args) {
        String userInput = getParameter("userInput"); // Simulate getting a parameter from a web request
        printToWebPage("Welcome, " + userInput); // This line is vulnerable to XSS
    }

    // Simulated method to mimic getting user input from a web request
    public static String getParameter(String paramName) {
        // In a real scenario, this would return user-supplied input
        return "userSuppliedContent";
    }

    // Simulated method to mimic sending output to a web page
    public static void printToWebPage(String content) {
        // In a real scenario, this would output directly to the web page
        System.out.println(content);
    }
}
