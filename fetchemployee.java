import java.sql.*;

public class FetchEmployees {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/yourdb";
        String user = "root";
        String password = "yourpassword";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("EmpID") + ", Name: " + rs.getString("Name") + ", Salary: " + rs.getDouble("Salary"));
            }

            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
