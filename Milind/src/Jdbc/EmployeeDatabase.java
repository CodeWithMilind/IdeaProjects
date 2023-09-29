
import java.sql.*;


public class EmployeeDatabase {

    private static final String JDBC_URL = "jdbc:oracle:thin@DESKTOP-RL6IOVM:1521:xe";
    private static final String USERNAME = "system";
    private static final String PASSWORD = "2004";

    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            Statement smt = connection.createStatement();
            smt.executeUpdate("create table emp(eno number,ename varchar(12))");

            System.out.println("TABLE CREATED SUCCESSFULLY");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
