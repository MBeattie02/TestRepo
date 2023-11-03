public class CredentialTest {
    
    private String userPassword = "password123";
    
    public void connectToDatabase() {
        String connectionToken = "secretToken";
        String dbConnection = "jdbc:database://localhost:3306/users?user=admin&password=" + userPassword;
        // ...
    }
    
    public void someMethod() {
        sendRequest("https://api.example.com/login", "apiKey=secretApiKey");
        // ...
    }
    
    private void sendRequest(String url, String headers) {
        // ...
    }
}

