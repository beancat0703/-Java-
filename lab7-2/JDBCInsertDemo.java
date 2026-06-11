import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCInsertDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC&characterEncoding=utf8&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "123456";

        String sql = "INSERT INTO student (name, age, major) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, "张三");
            pstmt.setInt(2, 20);
            pstmt.setString(3, "计算机科学与技术");

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("学生信息插入成功！");
            }

        } catch (SQLException e) {
            System.out.println("数据库操作失败，原因：" + e.getMessage());
        }
    }
}