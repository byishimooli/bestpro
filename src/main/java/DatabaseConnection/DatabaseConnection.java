package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    // Static variable declaration
    private static final String jdbcUrl = "jdbc:postgresql://localhost:5432/mevsme";
    private static final String username = "postgres";
    private static final String dbPassword = "Olibo0789@";
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName("org.postgresql.Driver");
                connection = DriverManager.getConnection(jdbcUrl, username, dbPassword);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
