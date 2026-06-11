import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCDelete {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC&characterEncoding=utf8&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "123456";

        String sql = "DELETE FROM student WHERE id = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, 1);

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("学生信息删除成功！");
            }

        } catch (SQLException e) {
            System.out.println("数据库操作失败，原因：" + e.getMessage());
        }
    }
}