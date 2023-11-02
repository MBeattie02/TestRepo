import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class VulnerableClass {
    
    private Connection connection;

    public void queryDatabase(String tableName, String columnName, String value) {
        try {
            String query = "SELECT * FROM " + tableName + " WHERE " + columnName + "='" + value + "'";
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            // ...
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

