package exceptionHandlingUsingTryCatch.checkedExceptions;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQLException {
    // occurs when there is errors regarding database access
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "pass");
        }catch(java.sql.SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }
}
