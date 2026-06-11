import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUpdate {
        public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student_db?useSSL=false&serverTimezone=UTC&characterEncoding=utf8&allowPublicKeyRetrieval=true";
        String user = "root";
        String password = "123456";

        String sql = "UPDATE student SET major = ? WHERE name = ?";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, "软件工程");
            pstmt.setString(2, "李四");

            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                System.out.println("学生信息修改成功！");
            }
            else{
                System.out.println("未找到该学生");  
            }

        } catch (SQLException e) {
            System.out.println("数据库操作失败，原因：" + e.getMessage());
        }
    }
}
