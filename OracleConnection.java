import java.sql.*;


class OracleConnection{
public static void main(String [] args){
    
            String host = "jdbc:oracle:thin:@db.freesql.com:1521/23ai_mb9q7";
        String username = "SQL_PE0RFPXP86EZXJW244ZA0Z8NNS";
        String password = "5031GIS5FJQTAMOWX6UPL7C0k$ZCZ8";

        Connection conn = null;
        try {
            // Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(host, username, password);
            System.out.println("Connected to Oracle database");
            
            String sql = "SELECT * FROM COMPLAINTS";
            PreparedStatement ps = conn.prepareStatement(sql);
        }
         catch (SQLException e) {
            System.out.println("Failed to connect to Oracle database");
            e.printStackTrace();
        }
}
  
}
