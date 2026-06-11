import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/student_db";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Connection myConn = null;
        try {
            myConn = DBUtil.getConnection();
            
            if (myConn != null) {
                System.out.println("数据库连接成功");
            }
            
        } catch (Exception e) {
            System.out.println("连接失败：");
            e.printStackTrace();
        } finally {
            DBUtil.close(myConn);
        }
    }
}