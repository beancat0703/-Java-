import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/student_db";
        String user = "root";
        String password = "123456";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(url, user, password);

        if (conn != null) {
            System.out.println("数据库连接成功");
        }

        conn.close();
    }
}