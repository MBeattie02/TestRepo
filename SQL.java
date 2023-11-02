public void queryDatabase(String tableName) {
    String query = "SELECT * FROM " + tableName;
    Statement stmt = connection.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM Users WHERE username='admin'");  // This line would be flagged
    // ...
}
