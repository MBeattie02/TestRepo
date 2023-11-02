public class UserService {

    // Simulated method that returns user-controlled input
    public String getUserInput() {
        // In a real application, this could be input from a web form, URL parameter, etc.
        return "'; DROP TABLE users; --";
    }

    // Method that constructs and executes a SQL query including user input directly
    public void deleteUser(String username) {
        String userInput = getUserInput();
        DatabaseConnection dbConnection = new DatabaseConnection();
        
        // The following line is vulnerable to SQL Injection
        String sql = "DELETE FROM users WHERE username = '" + userInput + "'";
        
        dbConnection.executeQuery(sql);
    }
}

class DatabaseConnection {
    public void executeQuery(String sql) {
        // Executes the SQL query on the database
        // ...
    }
}
