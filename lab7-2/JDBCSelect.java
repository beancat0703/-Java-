import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCSelect {
        public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC&characterEncoding=utf8&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "123456";

        String sql = "SELECT * FROM student";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {           

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String major = rs.getString("major");

                System.out.println("学号: " + id + " | 姓名: " + name + " | 年龄: " + age + " | 专业: " + major);
            }
        } catch (SQLException e) {
            System.out.println("数据库操作失败，原因：" + e.getMessage());
        }
    }
}